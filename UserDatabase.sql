Create database login;
use login;
create table user(
id int primary key auto_increment,
uname varchar(50),
uemail varchar(50),
upwd varchar(20),
umobile varchar(10));
desc user;
Select * from user;

