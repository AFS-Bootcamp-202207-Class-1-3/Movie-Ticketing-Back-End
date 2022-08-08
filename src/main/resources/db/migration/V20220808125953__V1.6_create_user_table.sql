CREATE TABLE if not exists customer(
  id varchar(255)  NOT NULL primary key,
  real_name varchar(255) DEFAULT  NULL,
  nick_name varchar(255) DEFAULT  NULL,
  avatar_url varchar(255) DEFAULT  NULL,
  age int,
  gender varchar(255) DEFAULT  NULL ,
  phone_number varchar(255) DEFAULT  NULL,
  city varchar(255) DEFAULT  NULL,
  introduction varchar(255) DEFAULT  NULL
)