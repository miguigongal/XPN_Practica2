-- Eliminar tablas si existen
DROP TABLE IF EXISTS MUEBLE CASCADE;
DROP TABLE IF EXISTS ALMACEN CASCADE;
DROP TABLE IF EXISTS STOCK CASCADE;

-- Crear la tabla MUEBLE
CREATE TABLE MUEBLE (
    id BIGSERIAL PRIMARY KEY,  -- BIGSERIAL para autoincremento
    nombre VARCHAR(50) NOT NULL
);

-- Crear la tabla ALMACEN
CREATE TABLE ALMACEN (
    id BIGSERIAL PRIMARY KEY,  -- BIGSERIAL para autoincremento
    nombre VARCHAR(50) NOT NULL
);

-- Crear la tabla STOCK con claves foráneas
CREATE TABLE STOCK (
    id BIGSERIAL PRIMARY KEY,         -- Clave primaria autoincremental
    id_mueble BIGINT NOT NULL,         -- Referencia a la tabla MUEBLE
    id_almacen BIGINT NOT NULL,        -- Referencia a la tabla ALMACEN
    max_stock INTEGER NOT NULL,        -- Máximo stock permitido
    min_stock INTEGER NOT NULL,        -- Mínimo stock permitido
    actual_stock INTEGER NOT NULL,     -- Stock actual disponible
    CONSTRAINT fk_mueble FOREIGN KEY (id_mueble) REFERENCES MUEBLE(id) ON DELETE CASCADE,  -- Relación con MUEBLE
    CONSTRAINT fk_almacen FOREIGN KEY (id_almacen) REFERENCES ALMACEN(id) ON DELETE CASCADE  -- Relación con ALMACEN
);



