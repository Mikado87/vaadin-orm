alter table roles drop foreign key FKnrseuwsqebnfcjnv2dy3yb03d;
alter table users drop foreign key FKr4t8kljvjhh3rbvfvj1rou7xu;
alter table users drop foreign key FKilrmffdo060hy749en2fi55wy;
alter table ways drop foreign key FKcfo24h9o3rq7p8auld9b6rqo2;
drop table if exists roles;
drop table if exists users;
drop table if exists ways;
create table roles (id bigint not null auto_increment, enabled bit, modificationDate datetime, name integer, lastModificationBy_id bigint, primary key (id));
create table users (id bigint not null auto_increment, enabled bit, fio varchar(255), login varchar(255), modificationDate datetime, pass varchar(255), lastModificationBy_id bigint, userRole_id bigint, primary key (id));
create table ways (id bigint not null auto_increment, enabled bit, finish datetime, modificationDate datetime, name varchar(255), start datetime, lastModificationBy_id bigint, primary key (id));
alter table roles add constraint FKnrseuwsqebnfcjnv2dy3yb03d foreign key (lastModificationBy_id) references users (id);
alter table users add constraint FKr4t8kljvjhh3rbvfvj1rou7xu foreign key (lastModificationBy_id) references users (id);
alter table users add constraint FKilrmffdo060hy749en2fi55wy foreign key (userRole_id) references roles (id);
alter table ways add constraint FKcfo24h9o3rq7p8auld9b6rqo2 foreign key (lastModificationBy_id) references users (id);
alter table roles drop foreign key FK7scww5tkt1x4mjonunps0mxdf;
alter table users drop foreign key FK5bcaqloljfqlwy5gricnwprk1;
alter table users drop foreign key FKaj52mhgwnasjbldn7ce61bwbk;
alter table ways drop foreign key FK3367pobn633vh1o0phi29qo9l;
drop table if exists roles;
drop table if exists users;
drop table if exists ways;
create table roles (id bigint not null auto_increment, enabled bit, modificationDate datetime, name integer, lastModificationBy bigint, primary key (id));
create table users (id bigint not null auto_increment, enabled bit, fio varchar(255), login varchar(255), modificationDate datetime, pass varchar(255), lastModificationBy bigint, userRole bigint, primary key (id));
create table ways (id bigint not null auto_increment, enabled bit, finish datetime, modificationDate datetime, name varchar(255), start datetime, lastModificationBy bigint, primary key (id));
alter table roles add constraint FK7scww5tkt1x4mjonunps0mxdf foreign key (lastModificationBy) references users (id);
alter table users add constraint FK5bcaqloljfqlwy5gricnwprk1 foreign key (lastModificationBy) references users (id);
alter table users add constraint FKaj52mhgwnasjbldn7ce61bwbk foreign key (userRole) references roles (id);
alter table ways add constraint FK3367pobn633vh1o0phi29qo9l foreign key (lastModificationBy) references users (id);
alter table roles drop foreign key FK7scww5tkt1x4mjonunps0mxdf;
alter table users drop foreign key FK5bcaqloljfqlwy5gricnwprk1;
alter table users drop foreign key FKaj52mhgwnasjbldn7ce61bwbk;
alter table ways drop foreign key FK3367pobn633vh1o0phi29qo9l;
drop table if exists roles;
drop table if exists users;
drop table if exists ways;
create table roles (id bigint not null auto_increment, enabled bit, modificationDate datetime, name integer, lastModificationBy bigint, primary key (id));
create table users (id bigint not null auto_increment, enabled bit, fio varchar(255), login varchar(255), modificationDate datetime, pass varchar(255), lastModificationBy bigint, userRole bigint, primary key (id));
create table ways (id bigint not null auto_increment, enabled bit, finish datetime, modificationDate datetime, name varchar(255), start datetime, lastModificationBy bigint, primary key (id));
alter table roles add constraint FK7scww5tkt1x4mjonunps0mxdf foreign key (lastModificationBy) references users (id);
alter table users add constraint FK5bcaqloljfqlwy5gricnwprk1 foreign key (lastModificationBy) references users (id);
alter table users add constraint FKaj52mhgwnasjbldn7ce61bwbk foreign key (userRole) references roles (id);
alter table ways add constraint FK3367pobn633vh1o0phi29qo9l foreign key (lastModificationBy) references users (id);