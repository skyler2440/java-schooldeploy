DELETE
FROM studcourses;

DELETE
FROM course;

DELETE
FROM student;

DELETE
FROM instructor;

DELETE
FROM roles;

DELETE
FROM users;

DELETE
FROM userroles;

INSERT INTO roles (roleid, name)
    VALUES(1, 'admin'),
          (2, 'user'),
          (3, 'data');

INSERT INTO users (userid, username, password)
    VALUES(4, 'admin', 'password'),
          (5, 'cinnamon', 'password'),
          (6, 'barnbarn', 'password'),
          (7, 'bob', 'password'),
          (8, 'jane', 'password');

INSERT INTO userroles (userid, roleid)
    VALUES(4, 1),
          (4, 2),
          (4, 3),
          (5, 3),
          (5, 2),
          (6, 2),
          (7, 2),
          (8, 2);

INSERT INTO instructor (instructid, instructname)
    VALUES(1, 'Sally'),
          (2, 'Lucy'),
          (3, 'Charlie');

INSERT INTO course (courseid, coursename, instructid)
	VALUES (1, 'Data Science', 1),
           (2, 'JavaScript', 1),
           (3, 'Node.js',  1),
           (4, 'Java Back End', 2),
           (5, 'Mobile IOS', 2),
           (6, 'Mobile Android',  3);

INSERT INTO student (studid, studname)
    VALUES (1, 'John'),
           (2, 'Julian'),
           (3, 'Mary'),
           (4, 'Julian'),
           (5, 'Tyler'),
           (6, 'Kim'),
           (7, 'Juan'),
           (8, 'Robby'),
           (9, 'Roberto'),
           (10, 'Bob'),
           (11, 'Liz'),
           (12, 'June'),
           (13, 'April');

INSERT INTO studcourses (studid, courseid)
    VALUES (1, 1),
           (1, 4),
           (2, 2),
           (3, 3),
           (3, 1),
           (3, 6);

alter sequence hibernate_sequence restart with 20;