
-- create update trigger : syntax trigger : 
-- update total salary ko ,, based on salary and working hour 


DELIMITER //

CREATE TRIGGER before_update_user
BEFORE UPDATE
ON users FOR EACH ROW
BEGIN
	set NEW.total_salary = NEW.per_hour_salary * NEW.working_hour;
END;
//

DELIMITER  ;