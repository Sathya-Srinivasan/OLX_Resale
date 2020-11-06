####################### START OF SQL SCRIPT ######################																#
#                                                                #
# DAY #: 44                                                      #
#                                                                #
# THIS SCRIPT IS USED FOR OLX RESALE WHICH MAINTAINS THE DETAILS #
# ABOUT THE USER AND ROLE AND ALSO ABOUT THE DETAILS OF THE      #
# PRODUCT ITEMS AND BILL PAYMENT OF THE PRODUCTS                 #
#                                                                #
# AUTHOR : SATHYA S                                              #
#                                                                #
###################### END OF SQL SCRIPT #########################

CREATE DATABASE OLX_Resale;
SHOW DATABASES;
USE OLX_Resale;

/*Creating table user for olx resale*/
CREATE TABLE user(
Id int primary key not null, 
Name varchar(20) not null, 
EmailId varchar(20) not null,
Address varchar(40) not null,
Password varchar(15) not null,
RoleId int,
foreign key(Id) REFERENCES role(Id)
);
select * from user;
 /*create the role table*/
create table role(
Id int Primary key not null,
RoleName varchar(20) not null,
foreign key(Id) REFERENCES productItems(Id)
);

/*INSERT INTO role VALUES(1,"CUSTOMER");*/

select * from role;
create table productItems(
Id int not null primary key,
Model int not null,
Description varchar(100) not null,
Features varchar(100) not null,
Cost int not null,
BillId int,
foreign key(Id) REFERENCES billpayment(Id)
);
select * from ProductItems;
/*creating the bill_geneartion table for bill payment of product items*/

create table billpayment(
Id int not null primary key, 
CustomerName varchar(20) not null,
StartingDate varchar(12) not null, 
EndingDate varchar(17) not null,
Source varchar(15) not null,
Destination varchar(18) not null,
TotalCost int not null
);
select * from billpayment;

/*Creating the productItems table for Listing the Products*/


