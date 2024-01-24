CREATE TABLE Doctores (
    id SERIAL PRIMARY KEY,
    nombre VARCHAR(255) NOT NULL,
    apellido_paterno VARCHAR(255) NOT NULL,
    apellido_materno VARCHAR(255),
    especialidad VARCHAR(255) NOT NULL
);

INSERT INTO Doctores (nombre, apellido_paterno, apellido_materno, especialidad)
VALUES ('Juan', 'Pérez', 'García', 'Cardiología');
INSERT INTO Doctores (nombre, apellido_paterno, apellido_materno, especialidad)
VALUES ('María', 'Rodríguez', 'López', 'Pediatría');
INSERT INTO Doctores (nombre, apellido_paterno, apellido_materno,especialidad)
VALUES ('Luis', 'Gómez', 'Ramirez', 'General');

CREATE TABLE Consultorios (
    id SERIAL PRIMARY KEY,
    numero_consultorio INTEGER NOT NULL,
    piso INTEGER NOT NULL
);
INSERT INTO Consultorios (numero_consultorio, piso)
VALUES (101, 1);
INSERT INTO Consultorios (numero_consultorio, piso)
VALUES (202, 2);
INSERT INTO Consultorios (numero_consultorio, piso)
VALUES (301, 3);

CREATE TABLE Citas (
    id SERIAL PRIMARY KEY,
    consultorio_id INTEGER REFERENCES Consultorios(id),
    doctor_id INTEGER REFERENCES Doctores(id),
    horario_consulta TIMESTAMP NOT NULL,
    nombre_paciente VARCHAR(255) NOT NULL
);