-- MySQL Script generated by MySQL Workbench
-- Tue Feb  7 21:20:01 2023
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema system-management
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema system-management
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `system-management` DEFAULT CHARACTER SET utf8 COLLATE utf8_bin ;
USE `system-management`;

-- -----------------------------------------------------
-- Table `system-management`.`customer`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `system-management`.`customer` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(65) NOT NULL,
  `phone` VARCHAR(20) NOT NULL,
  `email` VARCHAR(65) NOT NULL,
  `address` VARCHAR(145) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;

CREATE TABLE IF NOT EXISTS `system-management`.`employee` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(65) NOT NULL,
  `lastname` VARCHAR(65) NOT NULL,
  `phone` VARCHAR(20) NOT NULL,
  `email` VARCHAR(65) NOT NULL,
  `address` VARCHAR(145) NOT NULL,
  `salary` INT,
  `status` VARCHAR(25),
  PRIMARY KEY (`id`))
ENGINE = InnoDB;

CREATE TABLE IF NOT EXISTS `system-management`.`supplier` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `company` VARCHAR(65) NOT NULL,
  `phone` VARCHAR(20) NOT NULL,
  `email` VARCHAR(65) NOT NULL,
  `address` VARCHAR(145),
  `manager` VARCHAR(80),
  `contact` VARCHAR(80),
  PRIMARY KEY (`id`))
ENGINE = InnoDB;

SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;

INSERT INTO customer (name, phone, email, address) values ("Ruben Guzman Gonzalez","3177917132","rubendario981@gmail.com","Avenida siempre viva 842");
INSERT INTO customer (name, phone, email, address) values ("Scarleth Johanson","3135487796","scarlet@mail.com","Avenger - black widow");
INSERT INTO customer (name, phone, email, address) values ("Gal Gadot","3004786655","wonderwoman@dccomics.com","Cuartel general de los super amigos - propiedad de batman");
UPDATE customer SET phone = "6026621035" WHERE id = 3;

INSERT INTO employee (name, lastname, phone, email, address, status, salary) VALUES ("Tom ", "Cruise", "32145677", "tom@mi.com", "maverik", "active", 1000);
INSERT INTO employee (name, lastname, phone, email, address, status, salary) VALUES ("Leo ", "Messi", "325896554", "leomessi@psgsoccerclub.com", "In paris", "inactive", 1500);
INSERT INTO employee (name, lastname, phone, email, address, status, salary) VALUES ("Lucky ", "Torres", "30025433665", "luccky@gatito.com", "Torre's house", "active", 900);

INSERT INTO supplier (company, email, phone, address, manager, contact) VALUES ("Google", "google@gmail.com", "305448833", "mountain view california", "Larry Page", "Stefany");
INSERT INTO supplier (company, email, phone, address, manager, contact) VALUES ("Microsoft","office@excel.com", "3504456217","Palo alto california","Bill gates", "Steve Balmer");
INSERT INTO supplier (company, email, phone) VALUES ("Amazon", "amazon@aws.com","4015627799");
SELECT * FROM supplier ORDER BY company;