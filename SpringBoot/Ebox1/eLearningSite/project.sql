CREATE TABLE STUDENT
(
	STUDENT_ID		NUMBER(3),
	STUDENT_NAME		VARCHAR2(100),
	EMAIL			VARCHAR2(100),
	MOBILE_NUMBER		NUMBER(10,2),
	CONSTRAINT STUDENT_CONS PRIMARY KEY(STUDENT_ID)
);

CREATE SEQUENCE STUDENT_SEQ START WITH 100 INCREMENT BY 1;

DESC STUDENT;

CREATE TABLE USERS
(
	USER_ID			NUMBER(3),
	STUDENT_ID		NUMBER(3),
	USERNAME		VARCHAR2(100),
	PASSWORD		VARCHAR2(100),
	CONSTRAINT USER_CONS PRIMARY KEY(USER_ID),
	CONSTRAINT FK_USERS FOREIGN KEY(STUDENT_ID) REFERENCES STUDENT(STUDENT_ID)
);

CREATE SEQUENCE USERS_SEQ START WITH 100 INCREMENT BY 1;

DESC USERS;

CREATE TABLE RESOURCES
(
	RESOURCE_ID		NUMBER(3),
	STUDENT_ID		NUMBER(3),
	RESOURCE_NAME		VARCHAR2(100),
	CONSTRAINT RESOURCE_CONS PRIMARY KEY(RESOURCE_ID),
	CONSTRAINT FK_RES FOREIGN KEY(STUDENT_ID) REFERENCES STUDENT(STUDENT_ID)
);

CREATE SEQUENCE RESOURCES_SEQ START WITH 100 INCREMENT BY 1;

DESC RESOURCES;
