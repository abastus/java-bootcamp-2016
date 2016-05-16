USE `high-school`;

SELECT t.first_name, t.last_name, c.name, s.day, s.time_start, s.time_end
FROM `teacher` t, `course` c, `schedule` s, `coursexschedule` cxs
WHERE
	(t.reg_number = c.assigned_teacher) AND
    (c.id = cxs.id_course) AND
    (cxs.id_schedule = s.id) AND
    (t.reg_number = 100);