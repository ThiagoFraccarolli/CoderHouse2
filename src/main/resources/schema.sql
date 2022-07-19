DROP TABLE CLIENTES IF EXISTS;
DROP TABLE PRODUCTO IF EXISTS;
DROP TABLE COMPROBANTE IF EXISTS;

CREATE TABLE CLIENTES(
IDCLIENTE INT NOT NULL AUTO_INCREMENT,
DNI INT NOT NULL,
NOMBRE VARCHAR(100) NOT NULL,
APELLIDO VARCHAR(100) NOT NULL,
FECHANACIMIENTO DATE NOT NULL,
PRIMARY KEY(IDCLIENTE)
);
CREATE TABLE PRODUCTO(
IDPRODUCTO INT NOT NULL AUTO_INCREMENT,
DESCRIPCION VARCHAR(100) NOT NULL,
PRECIO FLOAT NOT NULL,
STOCK INT NOT NULL,
PRIMARY KEY (IDPRODUCTO)
);
CREATE TABLE COMPROBANTE(
IDCOMPROBANTE INT NOT NULL AUTO_INCREMENT,
IDCLIENTE INT NOT NULL,
CANTIDAD INT NOT NULL,
FECHA DATE NOT NULL,
TOTAL INT NOT NULL,
PRIMARY KEY (IDCOMPROBANTE)
);