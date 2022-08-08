CREATE TABLE if not exists movie  (
  id varchar(255) NOT NULL primary key,
  name varchar(255) DEFAULT NULL,
  introduction varchar(255) DEFAULT NULL,
  duration int,
  release_time date DEFAULT NULL,
  post_url varchar(255) DEFAULT NULL,
  types varchar(255) DEFAULT NULL
)