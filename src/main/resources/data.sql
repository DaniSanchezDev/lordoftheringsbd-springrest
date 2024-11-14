INSERT INTO Personajes (nombre, raza, alianza)
VALUES  ("Aragorn", "Humano", "LA_COMUNIDAD"),
        ("Gandal", "Maia", "LA_COMUNIDAD"),
        ("Frodo", "Hobbit", "LA_COMUNIDAD"),
        ("Sauron", "Maia", "Mordor"),
        ("Legolas", "Elfo", "LA_COMUNIDAD"),
        ("Bilbo", "Hobbit", "Aventurero");

INSERT INTO artefactos (nombre, tipo) VALUES 
('Anillo Unico', 'Anillo'),
('Espada Anduril', 'Espada'),
('Baculo de Gandalf', 'Baculo'),
('Dardo', 'Espada'),
('Manto Elfico', 'Armadura');

-- Inserción de datos en la tabla Posesion
INSERT INTO posesion (idPersonaje, idArtefacto, fechaInicio, fechaFin) VALUES 
( 3, 1, '3018-09-23', '3021-09-29'),  -- Frodo posee el Anillo Único
( 6, 1, '2941-01-01', '3001-09-22'),  -- Bilbo posee el Anillo Único
( 1, 2, '3019-03-15', NULL),          -- Aragorn posee la Espada Andúril (sin fecha fin, aún la posee)
( 2, 3, '3018-12-25', NULL),          -- Gandalf posee su báculo (sin fecha fin)
( 6, 4, '2941-01-01', '3001-09-22'),  -- Bilbo posee Dardo hasta que se lo pasa a Frodo
( 3, 4, '3001-09-22', '3021-09-29'),  -- Frodo posee Dardo
( 5, 5, '3018-10-25', NULL);          -- Legolas posee el Manto Élfico