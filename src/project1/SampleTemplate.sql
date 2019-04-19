create table login(uname varchar(30) primary key, pwd varchar(100)); 

insert into login values('dev','$2a$10$qyjKefhGuVdggeC0GgoAM.QSryoF7bIkvfu.vPG4GAhrrFu0jpmfK');

create table details( uname varchar(30), pp varchar(60), name varchar(50), email varchar(50), 
points int default 0, level int default 0, foreign key (uname) references login(uname) on delete cascade);

