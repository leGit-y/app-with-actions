CREATE SCHEMA IF NOT EXISTS `app`;
use app;

CREATE DATABASE IF NOT EXISTS `app`;

create table if not exists student
(
    id   int auto_increment
        primary key,
    name varchar(50) not null
);
