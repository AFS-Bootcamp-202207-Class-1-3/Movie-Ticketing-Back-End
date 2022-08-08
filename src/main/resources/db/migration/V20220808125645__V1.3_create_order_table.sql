CREATE TABLE if not exists customer_order(
  id varchar(255)  NOT NULL primary key,
  movie_id varchar(255) DEFAULT NULL,
  movie_schedule_id varchar(255) DEFAULT NULL,
  price double precision ,
  is_pay boolean,
  ticket_code varchar(255)  DEFAULT NULL ,
  user_id varchar(255) DEFAULT NULL,
  has_used boolean
)