
-- Base de Datos : cibertec2023
-- Fecha : 25-Agosto-2023
-- Alumno : Stefano Gabriel Diaz Marcelo

-- -----------------------------------------

use cibertec2023;

drop table if exists Empleados;

create table Empleados(
	Id INT NOT NULL auto_increment,
    Apellidos VARCHAR(50) NOT NULL,
    Nombres VARCHAR(50) NOT NULL,
    Edad SMALLINT NOT NULL,
    Sexo CHAR(1) NOT NULL,
    Salario INT NOT NULL,
    PRIMARY KEY(Id)
);

insert into Empleados(Apellidos,Nombres,Edad,Sexo,Salario) 
values('LAGUNA OLIVAS','SAID CARLOS',22,'M',1500),
('BARCO URBANO','ADRIAN CARLOS',21,'M',1600),
('JALABA BROUS','JUANA DORIS',24,'F',2000),
('MARTINEZ MEZA','KENIA MAJU',23,'F',2400),
('SURRIGA LOPEZ','LORENA ESTEFANIA',21,'F',1700);

select * from Empleados;