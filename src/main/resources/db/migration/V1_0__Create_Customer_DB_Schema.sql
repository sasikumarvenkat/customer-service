-- MySQL Workbench Synchronization
-- Generated: 2022-11-04 09:10
-- Model: Customer
-- Version: 1.0
-- Project: Customer DB
-- Author: Sasikumar Venkatesh

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

CREATE SCHEMA IF NOT EXISTS `customer_db` DEFAULT CHARACTER SET utf8 ;

CREATE TABLE IF NOT EXISTS `customer_db`.`customer` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NULL DEFAULT NULL,
  `email` VARCHAR(100) NULL DEFAULT NULL,
  `phone` VARCHAR(45) NULL DEFAULT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

CREATE TABLE IF NOT EXISTS `customer_db`.`address` (
  `id` INT(11) NOT NULL,
  `street1` VARCHAR(45) NULL DEFAULT NULL,
  `street2` VARCHAR(45) NULL DEFAULT NULL,
  `city` VARCHAR(45) NULL DEFAULT NULL,
  `state` VARCHAR(45) NULL DEFAULT NULL,
  `zip` VARCHAR(45) NULL DEFAULT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

CREATE TABLE IF NOT EXISTS `customer_db`.`cusotmer_address` (
  `id` INT(11) NOT NULL,
  `address_type` VARCHAR(45) NULL DEFAULT NULL,
  `customer_id` INT(11) NOT NULL,
  `address_id` INT(11) NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_cusotmer_address_customer_idx` (`customer_id` ASC) VISIBLE,
  INDEX `fk_cusotmer_address_address1_idx` (`address_id` ASC) VISIBLE,
  CONSTRAINT `fk_cusotmer_address_customer`
    FOREIGN KEY (`customer_id`)
    REFERENCES `customer_db`.`customer` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_cusotmer_address_address1`
    FOREIGN KEY (`address_id`)
    REFERENCES `customer_db`.`address` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
