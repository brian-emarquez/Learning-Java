### Manejo de Cookies

**Manejo de Sesiones con servlets**

- Una sesion en una aplicacion Web permite adminitrar varias peticiones de un mismo usuario

- La necesidad surge debido a que el protocilo HTTP es un protocolo sin estado, esto significa que entre peticion y peticion no guarda ninguna informacion del usuario que realizo dicha peticion.

- las Sesiones en lo Servlets se pueden manejar por medios de dos mecanismos:

> Cookies
>URL Rewritting

El Api de lo servlets abtrae estos conceptos en una clase llamado HTTPSession.

**Concepto y Uso de Coolies**

Una cookie es un archivo que contiene  informacion n orma de nombre, valor, el cual se almacena en el navegador web.

El Objetivo de un Cookie es almacenar informacion del Usuario cada ves que accede a un mismo sitio, como puede ser el lenguaje preferido colores preferidos y en general las preferencias de usuario.

Las Cookies no de deben utilizar para almacernar informcion sensible como passwords, tarjetas de credito, etc., debido a que la informacion almacenada es tecto plano sin ningun tipo de encriptacion.


**API de las Cookies en los Servlets**

Una Cokkie se puede ller en un peticion HHTP (se itera el areglo de Cookies) y se puede escribir esn una respuesta HTTP

- Creacion de un objeto Cookie

```Java
Cookie c= new Cookie("usuario", "Juan");
c.getName();
c.getName();
```

- Metodos para ller todas las cookies es un peticion Http:

```Java
Cookie[] cookies = request.getCookies();
```
