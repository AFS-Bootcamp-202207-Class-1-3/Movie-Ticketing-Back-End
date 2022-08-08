CREATE TABLE if not exists pair(
  id varchar(255) NOT NULL primary key,
  movie_schedule_id varchar(255)  DEFAULT NULL,
  user_id varchar(255) DEFAULT NULL,
  partner_id varchar(255) DEFAULT NULL
)