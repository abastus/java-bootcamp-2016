USE `high-school`;

SELECT (SELECT COUNT(*) 
		FROM `course` c2, `inscription` pass 
        WHERE (pass.id = c2.id) AND 
        (c2.id = 3) AND 
        (pass.final_note >= 4))
        /COUNT(*)*100 AS 'Percentage'
FROM `course` c, `inscription` i
WHERE
	(i.id = c.id) AND
	(c.id = 3);