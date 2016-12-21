create database class;  --班级
use class;
create table user(
  name varchar(64),--班名
  teacher varchar(32),--班主任
  nummber int--哪一级
);
insert into user(name,teacher,nummber)
values('java','lili','2014');
insert into user(name,teacher,nummber)
values('c','nini','2014');
insert into user(name,teacher,nummber)
values('php','hehe','2014');
insert into user(name,teacher,nummber)
values('c++','haha','2014');
