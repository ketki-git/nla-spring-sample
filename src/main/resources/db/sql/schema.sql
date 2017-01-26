DROP TABLE CUSTOMER IF EXISTS;
 
CREATE TABLE CUSTOMER (
    CUSTOMER_ID    integer identity primary key,
    CUSTOMER_NAME varchar(50) not null,
    CUSTOMER_ADDRESS varchar(255),
    CUSTOMER_CITY varchar(50) not null,
    CUSTOMER_STATE varchar(50) not null,
    CUSTOMER_ZIP_POSTAL varchar(30) not null,
    CUSTOMER_PHONE varchar(50),
    CUSTOMER_EMAIL varchar(50) 
);

DROP TABLE BOOK IF EXISTS;
 
CREATE TABLE BOOK (
    BOOK_ID    integer identity primary key,
    BOOK_NAME varchar(100) not null,    
    BOOK_AUTHOR varchar(50) not null,    
    BOOK_BORROWER_ID integer,
    FOREIGN KEY (BOOK_BORROWER_ID) REFERENCES CUSTOMER(CUSTOMER_ID)
);

DROP TABLE BOOK_INFO IF EXISTS;

CREATE TABLE BOOK_INFO (
    BOOK_ID    integer,    
    BOOK_INFO varchar(1000),
    FOREIGN KEY (BOOK_ID) REFERENCES BOOK(BOOK_ID)
);