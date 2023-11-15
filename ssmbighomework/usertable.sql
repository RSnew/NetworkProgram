create table ssmbighomework.usertable
(
    userID   int auto_increment
        primary key,
    userName varchar(255) null,
    password int          null,
    isAdmin  tinyint(1)   null
);

