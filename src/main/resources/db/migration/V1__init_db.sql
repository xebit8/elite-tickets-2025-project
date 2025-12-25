CREATE TYPE "genders" AS ENUM (
  'MALE',
  'FEMALE',
  'PREFER_NOT_SAY',
  'HELICOPTER'
);

CREATE TYPE "roles" AS ENUM (
  'VOLUNTEER',
  'ADMIN'
);

CREATE TYPE "restrictions" AS ENUM (
  'ANYONE',
  'YOUNG',
  'TEEN',
  'ADULT'
);

CREATE TYPE "order_statuses" AS ENUM (
  'PENDING',
  'PAYMENT_SUCCESS',
  'CANCELED'
);

CREATE TABLE "ticket_tiers" (
  "id" serial PRIMARY KEY,
  "tier_title" varchar(255),
  "img_template" varchar(255)
);

CREATE TABLE "account" (
  "id" uuid PRIMARY KEY DEFAULT gen_random_uuid(),
  "email" varchar(255),
  "password" varchar(255)
);

CREATE TABLE "authorities" (
  "id" serial PRIMARY KEY,
  "authority" roles
);

CREATE TABLE "user_authority" (
  "account_id" uuid,
  "authority_id" int
);

CREATE TABLE "customer" (
  "account_id" uuid PRIMARY KEY,
  "last_name" varchar(255),
  "first_name" varchar(255),
  "birthday" date,
  "gender" genders
);

CREATE TABLE "worker" (
  "account_id" uuid PRIMARY KEY,
  "role" roles
);

CREATE TABLE "events" (
  "id" serial PRIMARY KEY,
  "title" varchar(255),
  "description" text,
  "address_id" int,
  "start_time" timestamp,
  "end_time" timestamp,
  "age_restriction" restrictions,
  "document_required" bool,
  "ticket_limit" int
);

CREATE TABLE "event_address" (
  "id" serial PRIMARY KEY,
  "address_name" varchar(255),
  "city" varchar(255),
  "street" varchar(255),
  "building" varchar(255),
  "floor" varchar(255),
  "room" varchar(255)
);

CREATE TABLE "event_tier_info" (
  "event_id" int,
  "ticket_tier_id" int,
  "price" int,
  "tier_desc" text
);

CREATE TABLE "tickets" (
  "id" uuid PRIMARY KEY DEFAULT gen_random_uuid(),
  "event_id" int,
  "customer_id" uuid,
  "redeemed_by" timestamp,
  "price" int,
  "tier_id" int,
  "is_redeem" bool
);

CREATE TABLE "transactions" (
  "id" uuid PRIMARY KEY DEFAULT gen_random_uuid(),
  "ticket_id" uuid,
  "customer_id" uuid,
  "purchase_time" timestamp
);

CREATE TABLE "order_history" (
  "id" uuid PRIMARY KEY DEFAULT gen_random_uuid(),
  "event_id" int,
  "customer_id" uuid,
  "ticket_id" uuid,
  "order_time" timestamp,
  "order_status" order_statuses
);

ALTER TABLE "user_authority" ADD FOREIGN KEY ("account_id") REFERENCES "account" ("id");

ALTER TABLE "user_authority" ADD FOREIGN KEY ("authority_id") REFERENCES "authorities" ("id");

ALTER TABLE "customer" ADD FOREIGN KEY ("account_id") REFERENCES "account" ("id");

ALTER TABLE "worker" ADD FOREIGN KEY ("account_id") REFERENCES "account" ("id");

ALTER TABLE "events" ADD FOREIGN KEY ("address_id") REFERENCES "event_address" ("id");

ALTER TABLE "event_tier_info" ADD FOREIGN KEY ("event_id") REFERENCES "events" ("id");

ALTER TABLE "event_tier_info" ADD FOREIGN KEY ("ticket_tier_id") REFERENCES "ticket_tiers" ("id");

ALTER TABLE "tickets" ADD FOREIGN KEY ("event_id") REFERENCES "events" ("id");

ALTER TABLE "tickets" ADD FOREIGN KEY ("customer_id") REFERENCES "customer" ("account_id");

ALTER TABLE "tickets" ADD FOREIGN KEY ("tier_id") REFERENCES "ticket_tiers" ("id");

ALTER TABLE "transactions" ADD FOREIGN KEY ("ticket_id") REFERENCES "tickets" ("id");

ALTER TABLE "transactions" ADD FOREIGN KEY ("customer_id") REFERENCES "customer" ("account_id");

ALTER TABLE "order_history" ADD FOREIGN KEY ("event_id") REFERENCES "events" ("id");

ALTER TABLE "order_history" ADD FOREIGN KEY ("customer_id") REFERENCES "customer" ("account_id");

ALTER TABLE "order_history" ADD FOREIGN KEY ("ticket_id") REFERENCES "tickets" ("id");
