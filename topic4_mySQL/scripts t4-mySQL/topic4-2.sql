USE `high-school`;

INSERT INTO `student` (first_name,last_name, reg_number, date_birth) VALUES 
('Agustin', 'Bastus', 1, '1992-04-27'),
('Agustin', 'Bastus', 2, '1992-04-27'),
('Agustin', 'Bastus', 3, '1992-04-27'),
('Agustin', 'Bastus', 4, '1992-04-27'),
('Agustin', 'Bastus', 5, '1992-04-27'),
('Agustin', 'Bastus', 6, '1992-04-27'),
('Agustin', 'Bastus', 7, '1992-04-27'),
('Agustin', 'Bastus', 8, '1992-04-27'),
('Agustin', 'Bastus', 9, '1992-04-27'),
('Agustin', 'Bastus', 10, '1992-04-27');

INSERT INTO `teacher` (first_name, last_name, date_birth, reg_number) VALUES
('Agustin', 'Bastus', '1992-04-27', 100),
('Agustin', 'Bastus', '1992-04-27', 101),
('Agustin', 'Bastus', '1992-04-27', 102);

INSERT INTO `course` (id, name, assigned_teacher, hours_week) VALUES
(1, 'Matematica', 100, 4),
(2, 'Lengua', 101, 4),
(3, 'Ingles', 102, 4);

INSERT INTO `inscription` (reg_number, id, final_note) VALUES
(1, 1, 8.5),
(1, 2, 6),
(1, 3, 10),
(2, 2, 0),
(3, 2, 0),
(4, 2, 0),
(5, 2, 0),
(6, 3, 0),
(7, 3, 0),
(8, 3, 0),
(9, 3, 0),
(10, 1, 0);

INSERT INTO `schedule` (id, day, time_start, time_end) VALUES
(1, 'Monday', '08:00', '10:00'),
(2, 'Monday', '10:00', '12:00'),
(3, 'Monday', '12:00', '14:00'),
(4, 'Tuesday', '08:00', '10:00'),
(5, 'Tuesday', '10:00', '12:00'),
(6, 'Tuesday', '12:00', '14:00'),
(7, 'Wednesday', '08:00', '10:00'),
(8, 'Wednesday', '10:00', '12:00'),
(9, 'Wednesday', '12:00', '14:00'),
(10, 'Thursday', '08:00', '10:00'),
(11, 'Thursday', '10:00', '12:00'),
(12, 'Thursday', '12:00', '14:00'),
(13, 'Friday', '08:00', '10:00'),
(14, 'Friday', '10:00', '12:00'),
(15, 'Friday', '12:00', '14:00');

INSERT INTO `coursexschedule` (id_course, id_schedule) VALUES
(1, 1),
(1, 4),
(1, 7),
(1, 10),
(1, 13),
(2, 2),
(2, 5),
(2, 8),
(2, 11),
(2, 14),
(3, 3),
(3, 6),
(3, 9),
(3, 12),
(3, 15);
