# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table user_master (
  user_id                   varchar(255) not null,
  user_name                 varchar(255),
  password                  varchar(255),
  regist_time               datetime(6) not null,
  update_time               datetime(6) not null,
  constraint pk_user_master primary key (user_id))
;




# --- !Downs

SET FOREIGN_KEY_CHECKS=0;

drop table user_master;

SET FOREIGN_KEY_CHECKS=1;

