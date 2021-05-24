CREATE TABLE Customer (
	customer_id int AUTO_INCREMENT PRIMARY KEY,
    customer_name nvarchar(255)
);

CREATE TABLE Employee (
	employee_id int AUTO_INCREMENT PRIMARY KEY,
    employee_name nvarchar(255),
    salary double,
    supervisor_id int,
    FOREIGN KEY (supervisor_id) REFERENCES Employee(employee_id)
);

CREATE TABLE Product (
	product_id int AUTO_INCREMENT PRIMARY KEY,
    product_name nvarchar(255),
    list_price double
);

CREATE TABLE `Order` (
	order_id int AUTO_INCREMENT PRIMARY KEY,
    order_date datetime,
    customer_id int,
    employee_id int,
    total double,
    FOREIGN KEY (customer_id) REFERENCES Customer(customer_id),
    FOREIGN KEY (employee_id) REFERENCES Employee(employee_id)
);

CREATE TABLE LineItem (
	order_id int,
    product_id int,
    quantity int,
    price double,
    PRIMARY KEY (order_id,product_id),
    FOREIGN KEY (order_id) REFERENCES `Order`(order_id),
    FOREIGN KEY (product_id) REFERENCES Product(product_id)
);

