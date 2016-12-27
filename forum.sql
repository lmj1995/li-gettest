create database forum;
use forum;
create table f_board(
  ID int primary  key not null,
  name varchar(32),
  date  datetime,
  description varchar(64)
);
insert into user(ID,name,date,description)
values(1,'青葱',now(),'运动');

create table f_forum(
  FID int primary  key not null,
  forum_name varchar(32),
  forum_describe varchar(128)
);
insert into user(FID,forum_name,forum_describe)
values(1,'美食','我爱美食');
insert into user(FID,forum_name,forum_describe)
values(2,'运动','我爱运动');

create table f_article(
  AID int primary key not null,
  theme varchar(64),
  Post_time  datetime,
  Browsing_times int,
  Countent varchar(128),                   -- 内容
  UID int,
  LastReplayDate timestamp
  LastReplayUID  int
);
insert into user(AID,theme,Post_time,Browsing_times,Countent,UID,LastReplayDate,LastReplayUID)
values(1,'运动',now(),'1','运动介绍','1',now(),'1');
insert into user(AID,theme,Post_time,Browsing_times,Countent,UID,LastReplayDate,LastReplayUID)
values(1,'美食',now(),'1','美食介绍','1',now(),'1');

create table f_reply(
  time datetime primary key not null,
  Countent varchar(64),
  Title varchar(32),
  UID int,
  replydate timestamp
);
insert into user(time,Countent,Title,UID,replydate)
values(now(),'美食介绍','陕菜','1',now());
insert into user(time,Countent,Title,UID,replydate)
values(now(),'美食介绍','湘菜','2',now());

create table f_moderator(
  FID int  not null,
  UID int  not null,
  OperUID int,
  Operdate datetime
);
insert into user(FID,UID,OperUID,Operdate)
values('1','1','11',now());
insert into user(FID,UID,OperUID,Operdate)
values('2','2','22',now());

create table f_userdesc(
  UID int  not null,

  desci varchar(68),
  name varchar(68),
  sex varchar(68),
  birthday datetime
);
insert into user(UID,desci,name,sex,birthday)
values('1''爱美食','jack','男','1995-1-4');
insert into user(UID,desci,name,sex,birthday)
values('2','爱美食','mary','女','1995-1-5');

create table f_user(
  UID int primary key not null,
  user_name varchar(64),
  password varchar(64)
);
insert into user(UID,user_name,password)
values('1','lmj','123456l');
insert into user(UID,user_name,password)
values('2','lmj','123456l');

create table f_entity7(
  FID int not null,
  UID int  not null,

);
insert into user(FID,UID)
values('1','1');
insert into user(FID,UID)
values('2','2');


create table f_role(
  RoleID int primary key not null,
  RoleName varchar(64)
);
insert into user(RoleID,RoleName)
values('1','rose');
insert into user(RoleID,RoleName)
values('2','mark');

create table f_entity9(
  FID int  not null,
  UID int  not null,

);
insert into user(FID,UID)
values('1','1');
insert into user(FID,UID)
values('2','2');

create table f_authority(
  RoleID int primary key not null,
  RightName varchar(64)
);
insert into user(RoleID,RightName)
values('1','rose');
insert into user(RoleID,RightName)
values('2','mark');
;
