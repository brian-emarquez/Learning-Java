 drop table usuarios;
 
  create table usuarios(
  nombre varchar2(20),
  clave varchar2(10),
  primary key (nombre)
 )
 
 insert into usuarios (nombre, clave)
  values ('juanperez','Boca');
 insert into usuarios (nombre, clave)
  values ('raulgarcia','River');
  
-- aparece un mensaje de error y la sentencia no se ejecuta.
  insert into usuarios (nombre, clave)
  values ('juanperez','payaso');
  
-- aparece un mensaje de error y la sentencia no se ejecuta.
  insert into usuarios (nombre, clave)
  values (null,'payaso');
  
  update usuarios set nombre='juanperez'
  where nombre='raulgarcia';
  
  select * from usuarios;