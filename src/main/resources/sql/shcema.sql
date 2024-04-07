CREATE TABLE users(
    id SERIAL PRIMARY KEY ,
    name varchar(50) NOT NULL ,
    email varchar(50) NOT NULL UNIQUE ,
    password
        varchar(250) NOT NULL,
    role varchar(20) NOT NULL
)