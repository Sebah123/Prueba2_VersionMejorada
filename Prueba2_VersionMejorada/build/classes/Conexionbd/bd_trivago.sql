CREATE DATABASE bd_trivago;

USE bd_trivago;

CREATE TABLE hotel(
	id INT AUTO_INCREMENT,
    nombre VARCHAR(100),
    ciudad VARCHAR(100),
    precio_por_noche INT,
    PRIMARY KEY(id)
);

INSERT INTO hotel VALUES(NULL, 'Hilton','Rengo',35659);
INSERT INTO hotel VALUES(NULL, 'Diego de Almagro','Rengo',80801);
INSERT INTO hotel VALUES(NULL, 'El Parrón','Rancagua',184122);
INSERT INTO hotel VALUES(NULL, 'Hospedaje Santiago','Santiago',69059);
INSERT INTO hotel VALUES(NULL, 'Mar Andino','Santiago',68366);

SELECT * FROM hotel ORDER BY precio_por_noche DESC;

SELECT COUNT(0) FROM hotel;

SELECT AVG(precio_por_noche) FROM hotel;