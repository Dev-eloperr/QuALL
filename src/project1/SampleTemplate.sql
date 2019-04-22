use project;

create table login(uname varchar(30) primary key, pwd varchar(100)); 

select * from login;

create table details( uname varchar(30), pp varchar(60), name varchar(50), email varchar(50), 
points int default 0, level int default 0, foreign key (uname) references login(uname) on delete cascade);

create table questions (ind int primary key, ques varchar(200), ansC varchar(50), ans2 varchar(50), ans3 varchar(50), ans4 varchar(50), diff varchar(6));

create table noq(level int primary key, easy int, med int, hard int);

create table useQ(uname varchar(30) references details(uname), ind int references questions(ind), Qused int default 0, primary key(uname, ind));

insert into questions values (1, "Who was the author of the famous storybook 'Alice's Adventures in Wonderland'?", 'Lewis Carroll','Rudyard Kipling','John Keats', 'H G Wells','easy');
insert into questions values (2, " Who wrote the famous 1855 poem 'The Charge of the Light Brigade'?", 'Lord Alfred Tennyson','Christopher Marlowe','Johannes Gutenberg', 'René Descartes','medium');
insert into questions values (3, "Who wrote 'Where ignorance is bliss, it is folly to be wise'?", 'Shakespeare','Browning','Marx', 'Kipling','easy');
insert into questions values (4, " Name the book which opens with the line 'All children, except one grew up'?", 'Peter Pan','Jungle book','Winnie the Poo', 'The Railway Children','easy');
insert into questions values (5, "  Which is the first Harry Potter book?", 'HP and the Philosopher’s Stone','HP and the Goblet of Fire','HP and the Chamber of Secrets', 'HP and the God of small Things','medium');
insert into questions values (6, " In which century were Geoffrey Chaucer's Canterbury Tales written?", '13th – 14th','14th – 15th','15th -16th', '16th – 17th','hard');
insert into questions values (7, " What was the nationality of Robert Louis Stevenson, writer of 'Treasure Island'?", 'Scottish','Welsh','Irish', 'French','medium');
insert into questions values (8, " 'Jane Eyre' was written by which Bronte sister?", 'Charlotte','Anne','Emily', 'None of the above','easy');
insert into questions values (9, " What is the book 'Lord of the Flies' about?", 'Schoolboys on the desert island','A round trip around the USA','A swarm of killer flies', 'None of the above','easy');
insert into questions values (10, " In the book ‘the Lord of the Rings ‘, who or what is Bilbo?", 'Hobbit','Troll',' Wizard', 'Dwarf','easy');

insert into noq values (1, 8, 2, 0);
insert into noq values (2, 5, 4, 1);
insert into noq values (3, 3, 5, 2);
insert into noq values (4, 1, 6, 3);
insert into noq values (5, 0, 7, 3);

insert into questions values (11, " IC chips used in computers are usually made of", 'Silicon','Lead',' Chromium', 'Gold','easy');
insert into questions values (12, " One kilobyte is equal to", '1024 bytes','1000 bytes',' 100 bytes', '1056 bytes','easy');
insert into questions values (13, " Which of the following is not an example of Operating System?", 'Microsoft Office XP','Windows 98',' BSD Unix', 'Red Hat Linux','easy');
insert into questions values (14, " Which supercomputer is developed by the Indian Scientists?", 'Param','Super 301','Compaq Presario', 'CRAY YMP','medium');
insert into questions values (15, " What kind of errors can be pointed out by the compiler?", 'Syntax error','Symantic error','Logical error', ' Internal error','easy');
insert into questions values (16, "What do you use to create a chart?", 'Chart Wizard','Data Wizard','Excel Wizard', 'Pie Wizard','medium');

