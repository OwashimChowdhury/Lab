USE OWASHIMDB;
CREATE TABLE EMPLOYEE (
EMPLOYEE_ID NUMERIC (6),
LAST_NAME VARCHAR(25),
JOB_ID VARCHAR(10),
SALARY NUMERIC (8,2),
COMM_PCT NUMERIC (4,2),
MGR_ID NUMERIC (6),
DEPARTMENT_ID NUMERIC (4)
);
INSERT INTO EMPLOYEE VALUES
(198, 'Connell','SH_CLERK',2600,2,124,50),
(199,'Grant','SH_CLERK',2600,2.2,124,50),
(200,'Whalen','AD_ASST',4400,1.3,101,10),
(201,'Hartstein','IT_PROG',6000,null,100,20),
(202,'Fay','AC_MGR',6500,null,210,20),
(203,'Mavris','AD_VP',7500,null,101,40),
(204, 'Baer','AD_PRES',3500 ,1.5 ,101 ,90),
(205,'Higgins','AC_MGR',2300,null,101,60),
(206,' Gitz','IT_PROG',5000,null,103,60),
(100,'King','AD_ASST',8956,0.3,108,100),
(101,'Kochar','SH_CLERK',3400,1.3,118,30);

#3. Display last_name, job_id, employee_id for each employee with employee_id 
SELECT EMPLOYEE_ID,LAST_NAME,JOB_ID FROM EMPLOYEE ;
#4. Display the details of all employees of department 60.
select*from employee where DEPARTMENT_ID=60;
#5. Display the employee details of the employee who’s last_name is King.
select*from employee where LAST_NAME=' King';
#6. Display unique job_id from EMPLOYEE table. Give alias name to the column as JOB_TITLE.
select JOB_ID as job_title from employee group by JOB_ID;
#Display last_name, salary and salary increase of Rs300. Give the new column name as ‘Increased Salary’.
select last_name,salary,salary+300 as increased_salary from employee;
#8. Display last_name, salary and annual compensation of all employees, plus a onetime bonus of Rs 100. Give an alias name to the column displaying annual compensation.
select last_name,salary,(salary*comm_pct)+100 as annual_commppensation from employee;
#9. Display the details of those employees who get commission.
select*from employee where comm_pct !='null';
#10. Display the details of those employees who do not get commission.
select*from employee where comm_pct>0;
#11. Display the Employee_id, Department_id and Salary all employees whose salary is greater than 5000.
select Employee_Id,DEPARTMENT_ID,SALARY FROM EMPLOYEE WHERE SALARY>5000;
#12. Display the Last_Name and Salary of all employees whose salary is between 4000 AND7000
SELECT LAST_NAME,SALARY FROM EMPLOYEE WHERE SALARY BETWEEN 4000 AND 7000;
#13. Display the details of all employees whose salary is either 6000 or 6500 or 7000.
SELECT*FROM EMPLOYEE WHERE SALARY=6000 OR SALARY=6500 OR SALARY=7000;
#14. Display the details of all those employees who work either in department 10 or 20 OR30 OR 40
 SELECT * FROM employee WHERE DEPARTMENT_ID=10 OR DEPARTMENT_ID=20 OR DEPARTMENT_ID=30 OR DEPARTMENT_ID=50;
#15. Display the details of all employees whose salary is not equal to 5000.
SELECT * FROM EMPLOYEE WHERE SALARY !=5000;
#16. Display the details of all the CLERKS working in the organization.
SELECT * FROM EMPLOYEE WHERE JOB_ID='SH_CLERK';
#17. Update the job_id’s of the employees who earn more than 5000 to Grade_A.
UPDATE EMPLOYEE SET JOB_ID='GRADE_A' WHERE SALARY>5000;
SELECT * FROM EMPLOYEE;
#18. Display the details of all those employees who are either CLERK or PROGRAMMER or ASSISTANT.
SELECT * FROM EMPLOYEE WHERE JOB_ID='SH_CLERK' OR JOB_ID='IT_PROG' OR JOB_ID='AD_ASST';
#19. Display those employees from the EMPLOYEE table whose designation is CLERK and salary is less than 3000.
SELECT*FROM EMPLOYEE WHERE JOB_ID='SH_CLERK' AND SALARY<3000;
#20. Display those employees Last_Name, Mgr_id from the EMPLOYEE table whose salary is above 3000 and work under Manager 101.
SELECT LAST_NAME,MGR_ID FROM EMPLOYEE WHERE SALARY<3000 AND MGR_ID=101;

