
CREATE TABLE cars (
                      id int NOT NULL AUTO_INCREMENT,
                      brand varchar(40),
                      model varchar(40),
                      country varchar(30),
                      price int,
                      PRIMARY KEY (id)
) ;

INSERT INTO my_db.cars (brand, model, country, price)
VALUES
('Toyota', 'Corolla', 'Japan', 500000),
('VAZ', '2106', 'Russia', 300000),
('Ford', 'Navigator', 'USA', 1000000);