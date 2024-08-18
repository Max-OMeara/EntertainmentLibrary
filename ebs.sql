SHOW DATABASES;

CREATE DATABASE IF NOT EXISTS ebs;

USE ebs;

CREATE TABLE login (
    meter_no VARCHAR(20),
    username VARCHAR(30),
    password VARCHAR(20),
    user_type VARCHAR(20)
);

DESCRIBE login;

SELECT * FROM login;

CREATE TABLE customer (
    name VARCHAR(20),
    meter_no VARCHAR(20),
    address VARCHAR(50),
    city VARCHAR(20),
    state VARCHAR(20),
    email VARCHAR(40),
    phone VARCHAR(20)
);

SELECT * FROM customer;

CREATE TABLE meter_info (
    meter_no VARCHAR(20),
    meter_location VARCHAR(20),
    meter_type VARCHAR(20),
    phase_code VARCHAR(20),
    bill_type VARCHAR(20),
    days VARCHAR(20)
);

SELECT * FROM meter_info;

CREATE TABLE tax (
    cost_per_unit VARCHAR(20),
    meter_rent VARCHAR(20),
    service_charge VARCHAR(20),
    service_tax VARCHAR(20),
    swacch_baharat_cess VARCHAR(20)
);

INSERT INTO tax VALUES('9','47','22','57','6','18');

SELECT * FROM tax;

CREATE TABLE bill (
    meter_no VARCHAR(20),
    month VARCHAR(30),
    units VARCHAR(20),
    totalbill VARCHAR(20)
);