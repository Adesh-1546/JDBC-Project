show databases;

create database BankManagementSystem;

use BankManagementSystem;

create table signup (Form_no varchar(20), Name varchar(20), Father_name varchar(20), DOB  varchar(20),Gender  varchar(20),email varchar(50), Maritial  varchar(20), Address  varchar(50), City varchar(20));

show tables;

desc signup;

select * from signup;

truncate table signup;

drop table signup;

create table signuptwo (Form_no varchar(20), Religion varchar(20), Category varchar(20), Income varchar(20),Qualification  varchar(20),Occupation varchar(50), Account_Type  varchar(20), PAN  varchar(50), ADHAR varchar(20));

show tables;

select * from signuptwo;

truncate table signuptwo;

create table signupthree(form_no varchar(20), account_type varchar(20), card_no varchar(20), pin varchar(20), facility varchar(20) );


select * from signupthree;

