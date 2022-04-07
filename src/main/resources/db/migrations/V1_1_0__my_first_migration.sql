create schema if not exists project_data;
CREATE TABLE IF NOT EXISTS project_data.employee (
    `id` int NOT NULL AUTO_INCREMENT PRIMARY KEY,
    `name` varchar(20),
    `email` varchar(50),
    `date_of_birth` timestamp)
ENGINE=InnoDB DEFAULT CHARSET=UTF8;