CREATE TABLE if not exists  movie_schedule(
   id varchar(255)  NOT NULL primary key,
   cinema_id varchar(255) DEFAULT NULL,
   movie_id varchar(255) DEFAULT NULL,
   start_time date DEFAULT NULL,
   capacity int ,
   available_position int,
   price double precision ,
   room varchar(255) DEFAULT NULL
);
