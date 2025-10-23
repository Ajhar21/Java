alter user postgres with password 'DatAEngineeR24';
commit;
--drop table student;
create table student
(
	sid integer,
	sname text,
	marks integer
);
insert into student values(1,'Navin',50);
insert into student values(2,'Anoy',54);
insert into student values(3,'Joy',56);
insert into student values(4,'Kadir',59);
insert into student values(5,'Noman',40);

select * from student;

select sname from student where sid=1;