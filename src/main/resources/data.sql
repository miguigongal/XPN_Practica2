-- Insertar datos en la tabla MUEBLE
INSERT INTO MUEBLE (nombre) VALUES 
('Mesa'),
('Silla'),
('Armario'),
('Sofá'),
('Estantería');

-- Insertar datos en la tabla ALMACEN
INSERT INTO ALMACEN (nombre) VALUES 
('Coruña'),
('Lugo'),
('Ourense'),
('Pontevedra'),
('Antártida');

-- Insertar datos en la tabla STOCK
INSERT INTO STOCK (idMueble, idAlmacen, maxStock, minStock, actualStock) VALUES 
(1, 1, 500, 50, 200), -- Mesa en Coruña
(1, 2, 300, 30, 100), -- Mesa en Coruña
(2, 3, 400, 40, 150), -- Silla en Lugo
(3, 4, 200, 20, 80),  -- Armario en Ourense
(4, 5, 600, 60, 300), -- Sofá en Pontevedra
(5, 1, 100, 10, 50),  -- Estantería en Antártida
(2, 2, 500, 50, 250), -- Silla en Lugo
(4, 3, 300, 30, 120); -- Sofá en Pontevedra
