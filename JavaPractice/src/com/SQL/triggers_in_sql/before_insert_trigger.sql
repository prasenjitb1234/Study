
-- create trigger : syntax trigger : 



DELIMITER //

CREATE TRIGGER before_insert_user
BEFORE INSERT
ON users FOR EACH ROW
BEGIN
    SET NEW.total_salary = NEW.per_hour_salary * NEW.working_hour;
END;
//

DELIMITER ;



















