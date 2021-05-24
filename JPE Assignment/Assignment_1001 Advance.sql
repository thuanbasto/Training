DELIMITER $$

CREATE FUNCTION computeOrderTotal (order_id int)
RETURNS double READS SQL DATA
BEGIN
	DECLARE total double;
    SET total = 0;
    SELECT SUM(price * quantity) 'total_price' INTO total FROM lineitem WHERE lineitem.order_id = order_id;
    RETURN total;
END $$
DELIMITER ;

SELECT computeOrderTotal(1);

DELIMITER $$
DROP PROCEDURE IF EXISTS `sms`.`addCustomer`;
CREATE PROCEDURE addCustomer (customerName nvarchar(255), OUT addStatus boolean)
MODIFIES SQL DATA
BEGIN
	INSERT INTO Customer (customer_name) VALUES (customerName);
    IF (ROW_COUNT() > 0) THEN
		SET addStatus = true;
	ELSE
		SET addStatus = false;
	END IF;
END $$
DELIMITER ;
call addCustomer('thuan', @addStatus);
SELECT @addStatus;
 --  DELETE FROM `Order` WHERE customer_id = customerId;
 
DROP PROCEDURE IF EXISTS `sms`.`deleteCustomer`;
DELIMITER $$
CREATE PROCEDURE deleteCustomer (customerId int, OUT addStatus boolean)
MODIFIES SQL DATA
BEGIN
	DECLARE EXIT HANDLER FOR SQLEXCEPTION
    BEGIN
		SET addStatus = false;
        ROLLBACK;
    END;
	START TRANSACTION;
	DELETE FROM LineItem WHERE order_Id IN (SELECT order_Id FROM `Order` WHERE customer_id = customerId);
    DELETE FROM `Order` WHERE customer_id = customerId;
    DELETE FROM Customer WHERE customer_id = customerId;
	SET addStatus = true;
    COMMIT;
END $$
DELIMITER ;

call deleteCustomer(3, @addStatus);
SELECT @addStatus;