set autocommit on;

create user ims identified by rays
/
grant dba to ims
/
conn ims/rays

create table branch_details
(
 bcode           varchar(15),
 bname           varchar(30),
 bcont_person    varchar(30),
 bcont_no        varchar(15),
 bemail_id       varchar(30),
 baddress        varchar(100),
 phno            varchar(10)
)
/

create table member_details
(
 eno             varchar(15),
 ename           varchar(30),
 epost           varchar(15),
 equali          varchar(30),
 eexp            varchar(10),
 etype           varchar(17),
 edoj            varchar(30),
 especiality     varchar(30),
 erespo          varchar(30),
 econt_no        varchar(15),
 eemail_id       varchar(30),
 esalary         number(8),
 estatus         varchar(10),
 edob            varchar(15),
 eaddress        varchar(100),
 mphoto          blob
)
/

create table working_details
(
 eno             varchar(15),
 ename           varchar(16),
 intime          varchar(20),
 outtime         varchar(20) 
)
/

create table payment_details
(
 eno             varchar(15),
 pdate           varchar(16),
 pamt            number(8),
 rest_amt        number(8),
 pmode           varchar(20),
 month           varchar(100) 
)
/

create table services
(
 eno             varchar(15),
 cont_name       varchar(20),
 servicetype     varchar(15),
 facility        varchar(20)
)
/ 

create table course_details
(
 ccode          varchar(15),
 cname          varchar(20),
 short_duration varchar(10), 
 long_duration  varchar(10),
 fee            number(8) 
)
/

create table development
(
 project_title   varchar(20),
 client_no       varchar(15),
 client_name     varchar(10),
 organisation    varchar(30),
 platform        varchar(20),
 dcont_no        varchar(15),
 dcost           number(8),
 acceptance_date varchar(15),
 dead_line_date  varchar(16) 
 )
/

create table client_payment
(
 client_no      varchar(15),
 pdate          varchar(15),
 pamt           number(8),
 dues           number(8),
 cpdate          varchar(15)
)
/
  
create table student_details
(
 reg_no          varchar(15),
 sname           varchar(20),
 fname           varchar(20),
 sdob            varchar(20),
 date_of_reg     varchar(20),
 scont_no        varchar(15),
 semal_id        varchar(30),
 gender          varchar(10),
 saddress        varchar(100),
 sphoto          blob
)
/

create table admission
(
 reg_no         varchar(15),
 adm_form_no    varchar(15),
 course         varchar(15),
 adm_date       varchar(10) ,
 total_fee      number(8),
 photo          blob
)
/

create table fee_details
(
 reciept_no      varchar(15),
 reg_no          varchar(15),
 adm_form_no     varchar(15),
 pform_no        varchar(15),
 pmode           varchar(15),
 pdate           varchar(15),
 ptype           varchar(15),
 installment_date varchar(15),
 total_fee       varchar(20),
 back_dues       varchar(15),
 discount        varchar(15),
 net_fee         varchar(15),
 pamt            varchar(15),
 dues            varchar(15)
)
/

create table certificate
(
 reg_no         varchar(15),
 name           varchar(20),
 fname          varchar(20),
 dob            varchar(15),
 subject        varchar(15),
 duration       varchar(15)
)
/
 
create table enquiry
(
 name           varchar(20),
 fname          varchar(20),
 college        varchar(100),
 course         varchar(20),
 cont_no        varchar(15),
 email_id       varchar(30),
 desired_time   varchar(10),
 reference      varchar(20),
 address        varchar(100)
)
/
 
create table automatic_reg
(aregno number(3),ch char(1))
/

insert into automatic_reg
values(0,'A')
/

create table automatic_fno
(aregno number(3),ch char(1))
/

insert into automatic_fno
values(0,'A')
/

create table automatic_rec
(aregno number(3),ch char(1))
/

insert into automatic_rec
values(0,'A')
/
 
create table users
(username varchar(15),
 password varchar(10)
)
/ 
 
create table admin
(adminname varchar(15),
 pass varchar(10)
)
/ 

insert into admin
values('HRISHIKESH',8084001001)
/

create table eautomatic
(eno    number(3),
 bno    number(3)
)
/

insert into eautomatic
values(0,0)
/ 
 
create table automatic
(aregno varchar(10), 
 ch varchar(10)
)
/

insert into automatic
values(0,'A')
/
 
create table etype
(type varchar(15)
)
/

insert into etype
values('MANAGEMENT')
/
insert into etype
values('ACADEMIC')
/
 
create table academic
(atype varchar(15)
)
/

create table management
(mtype varchar(15)
)
/

insert into academic
values('faculty')
/
insert into academic
values('developer')
/
insert into academic
values('trainer')
/


insert into management
values('MD')
/
insert into management
values('DIRECTOR')
/
insert into management
values('CA')
/