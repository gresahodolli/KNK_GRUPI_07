CREATE DATABASE sistemiautobuseve;
use sistemiautobuseve;


CREATE TABLE `sistemiautobuseve`.`roles` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `role_name` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`));

CREATE TABLE `sistemiautobuseve`.`cities` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`));

CREATE TABLE `sistemiautobuseve`.`users` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `firstname` VARCHAR(45) NOT NULL,
  `lastname` VARCHAR(45) NOT NULL,
  `username` VARCHAR(45) NOT NULL,
  `password` VARCHAR(45) NOT NULL,
  `role_id` INT NULL,
  PRIMARY KEY (`id`),
  INDEX `role_id_idx` (`role_id` ASC),
  CONSTRAINT `role_id`
    FOREIGN KEY (`role_id`)
    REFERENCES `sistemiautobuseve`.`roles` (`id`)
    ON DELETE SET NULL
    ON UPDATE NO ACTION);
    
    CREATE TABLE `sistemiautobuseve`.`timetable` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `time` TIME NOT NULL,
  PRIMARY KEY (`id`));


CREATE TABLE `sistemiautobuseve`.`companies` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  `no_buses` INT NULL,
  `manager_id` INT NULL,
  PRIMARY KEY (`id`),
  INDEX `manager_id_idx` (`manager_id` ASC),
  CONSTRAINT `manager_id`
    FOREIGN KEY (`manager_id`)
    REFERENCES `sistemiautobuseve`.`users` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);
    