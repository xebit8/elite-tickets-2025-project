package ru.mirea.elitetickets2025.dao;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import ru.mirea.elitetickets2025.entities.Customer;
import ru.mirea.elitetickets2025.mappers.CustomerMapper;
import ru.mirea.elitetickets2025.models.CustomerModel;
import ru.mirea.elitetickets2025.repositories.CustomerRepository;

import java.util.Optional;
import java.util.UUID;

@Component
@RequiredArgsConstructor
public class CustomerDao {

    private final CustomerRepository customerRepository;

    private final AccountDao accountDao;

    private final CustomerMapper customerMapper;

    public CustomerModel createNewCustomer(CustomerModel customerModel){
        Customer customer = customerMapper.modelToEntity(customerModel);
        customerRepository.save(customer);
        return customerModel;
    }

    public CustomerModel findCustomerByAccountId(UUID id){
        Optional<Customer> customerOpt = customerRepository.findById(id);
        Customer customer = customerOpt.orElseThrow();
        return customerMapper.entityToModel(customer);
    }

    @Transactional(Transactional.TxType.REQUIRED)
    public CustomerModel updateCustomer(CustomerModel fieldsToUpdate){
        UUID customerId = accountDao.getAccountIdByEmail(fieldsToUpdate.getAccountEmail());

        Customer entity = customerRepository.findById(customerId).orElseThrow();

        entity.setBirthday(fieldsToUpdate.getBirthday());
        entity.setFirstName(fieldsToUpdate.getFirstName());
        entity.setLastName(fieldsToUpdate.getLastName());
        entity.setGender(fieldsToUpdate.getGender());

        return customerMapper.entityToModel(customerRepository.save(entity));
    }
}
