use owashimdb;
#CREATING EMP1 TABLE
create table emp1(
ID numeric(2),
emp_Name varchar(10),
Basic numeric(6,2),
Designation varchar(10),
Age numeric(2)
);
#2. Change the data type of the field Basic from float to integer with required size of the EMP1 TABLE
alter table emp1 modify Basic integer(6);
#3. Change the field size of Name column of the EMP1 table from 10 to 15. 
alter table emp1 modify EMP_Name varchar(15);
#CREATING ANOTHER TABLE
create table emp_trainee(
Emp_id numeric(2),
emp_Name varchar(10),
Basic numeric(6,2),
Designation varchar(10),
Age numeric(2)
);
#INSERTING VALUES
insert into emp1 values
(1,'rohit',6700,'Manager',24),
(2,'sunil',6200,'Engineer',27),
(3,'Payal',6300,'Engineer',25),
(4,'Kunal',6700,'Trainee',28),
(5,'Sunita',6230,'Trainee',26),
(6,'bimal',7000,'Trainee',25);
#6. Insert all rows with the designation ‘trainee’ from the EMP1 table to EMP_trainee table.
insert into emp_trainee select * from emp1 where Designation='Trainee';
#7. Display the structure of both the tables.
select * from emp1,emp_trainee;
#8. Add columns Skills (data type-varchar2 and size-10) and DOJ (data type-date) to the EMP1 table and add data for the Skills and DOJ columns according to your own wish. 
alter table emp1 add Skill varchar(15) after basic;
alter table emp1 add DOJ date after age;
update emp1 set Skill = 'EE' where ID = 1;
update emp1 set Skill = 'Python' where ID = 2;
update emp1 set Skill = 'java' where ID = 3;
update emp1 set Skill = 'SQL' where ID = 4;
update emp1 set Skill = 'sql' where ID = 5;
update emp1 set Skill = 'css' where ID = 6;

update emp1 set DOJ = '2022-06-09' where ID = 1;
update emp1 set DOJ = '2022-06-10' where ID = 2;
update emp1 set DOJ = '2022-06-11' where ID = 3;
update emp1 set DOJ = '2022-06-23' where ID = 4;
update emp1 set DOJ = '2022-06-07' where ID = 5;
update emp1 set DOJ = '2022-06-13' where ID = 6;

alter table emp_trainee modify Designation varchar(40);
#9. Change the designation of all trainees in EMP_trainee table to ‘Programmer _Trainee’.
update emp_trainee set Designation = 'Programmer_Trainee';
#10. Update more than one row in one query in EMP1 table.
update emp1 set Skill = 'Python' where Designation = 'Trainee';
#11.Change the data type of ID in EMP1 table to varchar2 and increase the data size to 5.
alter table emp1 modify ID varchar(5);
#.Display both the tables EMP1 and EMP_trainee.
select * from emp1,emp_trainee;
#.Rename the column Age of EMP1 table to Age_in_Years.
alter table emp1 rename column age to age_in_year;
#14.Delete the details of all the trainees from the EMP1 table.
delete from emp1 where Designation = 'Trainee'; 
#15.Drop the Age column from the EMP_trainee table.
alter table emp_trainee DROP COLUMN Age;
#17.Rename the table EMP to EMP_Mgr_Engr.
alter table emp1 rename EMP_Mgr_Engr;
#18.Drop the table EMP_Trainee. 
DROP table emp_trainee;
#19.Truncate EMP_Mgr_Engr table.
TRUNCATE TABLE EMP_Mgr_Engr;


