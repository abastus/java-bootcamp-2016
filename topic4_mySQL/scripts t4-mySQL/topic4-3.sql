USE `high-school`;

SELECT s.first_name AS 'Name', s.last_name AS 'Last Name', t.last_name AS 'Teacher LName', t.first_name AS 'Teacher FName', c.name AS 'Course Name'
FROM `student` s, `teacher` t, `course` c, `inscription` i
WHERE
	(t.reg_number = c.assigned_teacher) AND
    (i.reg_number = s.reg_number) AND
    (i.id = c.id) AND
    (c.id = 3)
ORDER BY s.last_name;