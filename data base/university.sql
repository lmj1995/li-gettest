create database tie;  --系
use tie;
create table user(
name varchar(64),--系名
department_head varchar(32),--系主任
nummber int--哪一级
);
insert into user(name,department_head,nummber)
values('computer','jack','2014');
insert into user(name,department_head,nummber)
values('art','mary','2014');
insert into user(name,department_head,nummber)
values('chinese','bob','2014');
insert into user(name,department_head,nummber)
values('electromechanical','rose','2014');
