create database student;  --班级
use student;
create table user(
  name varchar(64),--名字
  age int,  --年龄
  number int, --哪一级
  Student_ID int,--学号
  class varchar(46) --哪一班
);
insert into user(name,age,number，Student_ID，class)
values('mama','19','2014','2014111','java');
insert into user(name,age,number，Student_ID，class)
values('dddd','21','2014','2014112','dance');
insert into user(name,age,number，Student_ID，class)
values('yiiy','22','2014','2014113','read');
insert into user(name,age,number，Student_ID，class)
values('thth','23','2014','2014114','c');
