## Navegacion en JSF (cont.)

- La navegacion en JSF permite movernos en tre paginas de las misma tecnologia.

- Existen varios tipos de Navegacion:
    * Navegacion Estatica
    * Navegacion Dinamica

- Existen varias formas de Confirmar la Navegacion:
* Navegacion implicita (JSF)
* Nevegacion explicita (en el archivo faces-config.xml)


## Navegacion Estatica

La navegacion estatica aplica lo siguiente:

- No se requiere ejecutar Java del lado del Servidor, sino unicamente dirigirse a otra pagina
- NO hay logica para determinar la pagina siguiente

_Ejemplo nevegacion estatica:_

- Pagina JSF que inicia la peticion:

```java
<h:com,amdButton label = "Entrar" action="login"/> 
```

- La Pagina se puede determianr de 2 formas:
a) outcome por default, busca directamente la pagina login.hhml
b)Busca el outcome en face-config.xml, en encontrando el caso que determian la sguiente pagina a mostrar

## Nevegacion Dinamica

la Navegacion dinamica utiliza un metodo action , el cual tiene la logica para detterminar el outcome.


Codigo pagina JSF (vista)

<h:commandButton label="Aceptar"

```java
action="#{loginBean.verificarUsuario }"/>} // Expression Language
```

## Creacion de reglas de Navegacion 

```java
<faces-config..>
    <navigation-rule>
        <from-view-id>inicio.xhtml</from-view-id>
```