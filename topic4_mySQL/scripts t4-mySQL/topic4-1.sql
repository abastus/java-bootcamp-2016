CREATE DATABASE `high-school` /*!40100 DEFAULT CHARACTER SET utf8 */;

CREATE TABLE `course` (
  `id` int(11) NOT NULL,
  `name` varchar(45) NOT NULL,
  `assigned_teacher` int(11) NOT NULL,
  `hours_week` float NOT NULL,
  PRIMARY KEY (`id`),
  KEY `reg_number_idx` (`assigned_teacher`),
  CONSTRAINT `reg_number` FOREIGN KEY (`assigned_teacher`) REFERENCES `teacher` (`reg_number`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `coursexschedule` (
  `id_course` int(11) NOT NULL,
  `id_schedule` int(11) NOT NULL,
  PRIMARY KEY (`id_course`,`id_schedule`),
  KEY `id_schedule_cxs_idx` (`id_schedule`),
  CONSTRAINT `id_course_cxs` FOREIGN KEY (`id_course`) REFERENCES `course` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `id_schedule_cxs` FOREIGN KEY (`id_schedule`) REFERENCES `schedule` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `inscription` (
  `reg_number` int(11) NOT NULL,
  `id` int(11) NOT NULL,
  `final_note` float NOT NULL,
  PRIMARY KEY (`reg_number`,`id`),
  KEY `id_idx` (`id`),
  CONSTRAINT `id_ins` FOREIGN KEY (`id`) REFERENCES `course` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `reg_number_ins` FOREIGN KEY (`reg_number`) REFERENCES `student` (`reg_number`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `partial` (
  `partialid` int(11) NOT NULL,
  `student_reg_number` int(11) NOT NULL,
  `course_id` int(11) NOT NULL,
  `grade` float NOT NULL,
  PRIMARY KEY (`partialid`,`student_reg_number`,`course_id`),
  KEY `student_reg_number_p_idx` (`student_reg_number`,`course_id`),
  CONSTRAINT `student_reg_number_p` FOREIGN KEY (`student_reg_number`, `course_id`) REFERENCES `inscription` (`reg_number`, `id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `schedule` (
  `id` int(11) NOT NULL,
  `day` varchar(45) NOT NULL,
  `time_start` time NOT NULL,
  `time_end` time NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `student` (
  `first_name` varchar(45) NOT NULL,
  `reg_number` int(11) NOT NULL,
  `last_name` varchar(45) NOT NULL,
  `date_birth` date NOT NULL,
  PRIMARY KEY (`reg_number`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `teacher` (
  `reg_number` int(11) NOT NULL,
  `first_name` varchar(45) NOT NULL,
  `last_name` varchar(45) NOT NULL,
  `date_birth` date NOT NULL,
  PRIMARY KEY (`reg_number`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
