CREATE TABLE if not exists pay  (
  id varchar(255) NOT NULL primary key,
  orders_ids varchar(255) DEFAULT NULL,
  total_price double precision ,
  status int
)