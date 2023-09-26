
-- Base de Datos : cibertec2023
-- Fecha : 29-Septiembre-2023
-- Alumno : Stefano Gabriel Diaz Marcelo
-- -----------------------------------------
create database cibertec2023;

use cibertec2023;

drop table if exists Empleados;

create table Empleados(
	Id INT NOT NULL auto_increment,
    Apellidos VARCHAR(50) NOT NULL,
    Nombres VARCHAR(50) NOT NULL,
    Edad SMALLINT NOT NULL,
    Sexo CHAR(1) NOT NULL,
    PRIMARY KEY(Id)
);

insert into Empleados(Apellidos,Nombres,Edad,Sexo) 
values('RIOS FLORES','ANA MARIA',22,'F'),
('BALLON URBANO','JOSE CARLOS',21,'M'),
('ALVA BERRIOS','CLAUDIA DORIS',24,'F'),
('PALACIOS MEZA','MATHIAS ALEJANDRO',23,'M'),
('ZEGARRA LOPEZ','LORENA ESTEFANIA',21,'F');

select * from Empleados;
