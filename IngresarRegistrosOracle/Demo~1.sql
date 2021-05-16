create table usuarios(
    nombre varchar2 (20),
    clave varchar(20)
);

insert into usuarios (nombre, clave) values ('brian', '123');
select * from usuarios;


create table agenda(
   apellido varchar2(30),
   nombre varchar2(30),
   domicilio varchar2(20),
   telefono varchar2(20)
);

insert into agenda (apellido, nombre, domicilio, telefono) values ('Marquez', 'Brian', 'los Angeles 10', 999999);
select * from agenda;

