DROP DATABASE IF EXISTS dept8002 ;
CREATE DATABASE dept8002 CHARACTER SET UTF8 ;
USE dept8002 ;
CREATE TABLE dept(
     deptno    bigint  auto_increment ,
     dname     varchar(50) ,
     loc       varchar(50) ,
     constraint pk_deptno primary key(deptno)
) engine=innodb ;
INSERT INTO dept(dname,loc) VALUES ('财务部-8002','北京') ;
INSERT INTO dept(dname,loc) VALUES ('开发部-8002','石家庄') ;
INSERT INTO dept(dname,loc) VALUES ('销售部-8002','上海') ;
INSERT INTO dept(dname,loc) VALUES ('产品部-8002','广州') ;
INSERT INTO dept(dname,loc) VALUES ('人事部-8002','深圳') ;