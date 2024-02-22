### JSP Standard Tag Library (JSTL)

- JSTL etiende los tags de los JSPS agregando principalmente las siguiente librerias

- Core: Permite ller y manipular datos, asi como iterar, agregar condiciones y otras funciones basicas

- xml: Permite la manipulacion y transfomacion de documentos XML

-SQL: Permite ejecutar consultas a una bade da datos, asi como crear conexiones a las mismas

- fmt: Permite dar formato a las cadenas, apoyando de concepts como internacionalizaicion (Locale)

### Configuracion de JSTL

- Agregar las siguentes librerias al classpath

standar.jar
stsl.jar

**Configuracion de la directiuva JSP**

* JSP clasico:

```java
<%@ taglib url="http://java.sun.com/jsp/core" prefix="c" %>
```

*  Documentos JSP(JSPX)

```java
<html
    xmlns:c = "http://java,sun.com/jsp/jstl/core">
    xmlns:c = "http://java,sun.com/JSP/Page">
```

### Libreria Core de JSTL

- Tags de Despliegue de informacion

```java
   <c:out value=${persona.nombre}>
```

- Tag de cracion y manipulacion de variables:

```java
   <c:set var="nombre" value="Carlos" scape="page/>
```

- Tags de Elementos condicionales

```java
   <c:text="${i>0}"/> y <c:choose> <c:when text="a">...
```

- Tags de iteeracion de elementos

```java
   <c:forEach var="persona" item=${persnas}>...
```



Numeration  | File   |  Link       |    Folk     |  Code       | Version     | State       | Download    |  Go back    |
|:----------:|:------:|:-----------:|:-----------:|:-----------:|:-----------:|:-----------:|:-----------:|:-----------:|
|F38        | [Ejemplo JSP Standard Tag Libary](https://github.com/brian-emarquez/Learning-Java/tree/main/EjemploJSTL)  | <img src="https://media.giphy.com/media/YIW8ZTQHpcWjaDzyAr/giphy.gif" width="17px">  | ✔️ | yes | yes | ✔️ | 💾 | [⬅️Atras](#https://github.com/brian-emarquez/Learning-Java) |




