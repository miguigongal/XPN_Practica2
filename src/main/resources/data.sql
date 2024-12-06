-- Insertar datos en la tabla MUEBLE
INSERT INTO MUEBLE (nombre) VALUES 
('Mesa'),
('Silla'),
('Armario'),
('Sofa'),
('Estantería');

-- Insertar datos en la tabla ALMACEN
INSERT INTO ALMACEN (nombre) VALUES 
('Coruna'),
('Lugo'),
('Ourense'),
('Pontevedra'),
('Santiago'),
('Vigo');

-- Insertar datos en la tabla STOCK
INSERT INTO STOCK (id_mueble, id_almacen, max_stock, min_stock, actual_stock) VALUES 
(1, 1, 500, 50, 200), -- Mesa en Coruña
(1, 2, 300, 30, 100), -- Mesa en Lugo
(1, 3, 350, 101, 100), -- Mesa en Ourense
(1, 4, 350, 101, 100), -- Mesa en Pontevedra
(1, 5, 400, 40, 150), -- Mesa en Antártida
(2, 1, 400, 40, 150), -- Silla en Coruña
(2, 2, 500, 50, 250), -- Silla en Lugo
(2, 3, 300, 30, 120), -- Silla en Ourense
(2, 4, 200, 20, 80),  -- Silla en Pontevedra
(2, 5, 600, 60, 300), -- Silla en Antártida
(3, 1, 500, 50, 200), -- Armario en Coruña
(3, 2, 300, 30, 100), -- Armario en Lugo
(3, 3, 350, 101, 100), -- Armario en Ourense
(3, 4, 350, 101, 100), -- Armario en Pontevedra
(3, 5, 400, 40, 150), -- Armario en Antártida
(4, 1, 400, 40, 150), -- Sofá en Coruña
(4, 2, 500, 50, 250), -- Sofá en Lugo
(4, 3, 300, 30, 120), -- Sofá en Ourense
(4, 4, 200, 20, 80),  -- Sofá en Pontevedra
(4, 5, 600, 60, 300), -- Sofá en Antártida
(5, 1, 100, 10, 50),  -- Estantería en Coruña
(5, 2, 300, 30, 100), -- Estantería en Lugo
(5, 3, 350, 101, 100), -- Estantería en Ourense
(5, 4, 350, 101, 100), -- Estantería en Pontevedra
(5, 5, 400, 40, 150); -- Estantería en Antártida
(1, 6, 500, 50, 200), -- Mesa en Vigo
(2, 6, 400, 40, 150), -- Silla en Vigo
(3, 6, 500, 50, 200), -- Armario en Vigo
(4, 6, 400, 40, 150), -- Sofá en Vigo
(5, 6, 100, 10, 50);  -- Estantería en Vigo

