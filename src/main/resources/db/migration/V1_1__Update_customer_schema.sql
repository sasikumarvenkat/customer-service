ALTER TABLE `customer_db`.`customer` 
ADD COLUMN `ssn` VARCHAR(10) NULL DEFAULT NULL AFTER `phone`;