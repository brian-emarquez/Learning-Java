### JavaServer Faces

- Es tecnologoia que fue diseñada para simplificar la construccion de interfas de usuario para apliaciones web Java Enterprices Edition(JAVA EE)

- Al Ser un estandar de java, la tecnologias cuenta con el apoyo de la industria muy solida.

- La tecnologia ha crecido en su suio a nivel mundial

- Se cuenta con un fuerte apoyo de IDe`s de java asi como servidores de aplicaciones para su despiegue.


### Catacteristicas JSF

- MVC
- RAD
- Componentes de interfaz de usuario
- Render-Kits
- Extensibilidad
- Internacionalizacion

_Alguna de las caracteristicas nuevas son:_

- Manejo de condiciones por default mas inteligentes
- Manejo de anotaciones para varias confuguraciones
- Soporte nativo para AJAX
- soporte por default para facelets

### Arquitectura JavaServer Faces

Capa del cliente -> Capa Web (JSF) -> Capa de Negocio -> Capa Datos - JDBC


### Patron de diseño MVC con JSF

<table>
    <caption>.:Patron de diseño MVC con JSF:.</caption>
<tr>
    <td colspan="3" align="center">Modelo (ManagedBean de MOdelo)</td>
</tr>

<tr>
    <td>Vista (Facelets o JSPs)</td>
    <td>Controlador (ManagedBean COntrolador)</td>
</tr>
</table>

### Tecnologias de lo Facelets

- Los Facelets son la tecnologia estandar de despliegue de JSF
- Los Facelets puede ser hasta un 30% mas rapidos en el analissi y alboracion de paginas
- Los facelets fueron creados tomando en cuenta el cliclo de vida de JSF
- Al Ejecutar un Facelet, toos lo componentes JSF se converten a instancias Java y son adminitradas por un component TRee


_Modificaciones antes de empesar un proyecto_

```java
   <dependencies>
        <dependency>
            <groupId>javax</groupId>
            <artifactId>javaee-api</artifactId>
            <version>8.0.1</version>
            <scope>provided</scope>
        </dependency>
    </dependencies>
```









