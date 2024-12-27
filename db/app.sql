create schema `app`;
create database `app`;

use app;
create table if not exists student
(
    id   int auto_increment
        primary key,
    name varchar(50) not null
);
