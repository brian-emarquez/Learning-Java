### Clave Primaria

Una clave primaria es un campo (o varios) que identifica un solo registro (fila) en una tabla.
Para un valor del campo clave existe solamente un registro.

```sql
 create table usuarios(
  nombre varchar2(20),
  clave varchar2(10),
  primary key(nombre)
 );
```