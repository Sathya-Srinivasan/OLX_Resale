CREATE DATABASE OLX_Resale;
SHOW DATABASES;
USE OLX_Resale;
CREATE TABLE user(
UserId int primary key not null, 
Name varchar(20) not null, 
Email varchar(20) not null,
Address varchar(40) not null,
Password varchar(15) not null,
ConfirmPassword varchar(15) not null,
RoleId int,
foreign key(RoleId) REFERENCES role(RoleId)
);
create table role(
RoleId int Primary key not null,
RoleName varchar(20) not null
);
create table bill_Generation(
BillId int not null primary key, 
CustomerName varchar(20) not null,
StartingDate varchar(12) not null, 
EndingDate varchar(12) not null,
Source varchar(20) not null,
Destination varchar(20) not null,
TotalCost int not null
);
create table productItems(
ProductId int not null primary key,
Model int not null, Description varchar(100) not null,
Features varchar(100) not null,
Cost int not null,
BillId int,
foreign key(BillId) REFERENCES billpayment(BillId)
);

