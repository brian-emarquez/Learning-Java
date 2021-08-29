## Validadores en JSF

- Procesamiento de validaciones en JSF

Veremos dos maneras de ejecutar la validacion en nuestros componentes:

- Validacion individual por campo
- Validacion de campo interpendientes

Podemos Lograr la validacion individual de varias maneras por ejeemplo:

- Agregando un Atrburos requered al Tag JSF
- Agregando un atriburo validador al tag JSF
- Agregando un calidador como un tag interno
- El tag h:message se utilza para mostrar errores de un componentes


Validacion interpendiente se ejecuta dentro de los metios actions

- El tag : h:messages se uiliza para mostrar varios errores a la vez


## Ejmeplo de uso de Validadores

Ejemplo de un validador estandar

```java
<h:inputText id="edadId"> required ="true" value="#{persona.edad}" />
    <f:validateLongRaNge mininum="18" maximun="50" />
```


_Ejemplo de un validador personalizado:_

```java
<h:inputText id="ipID" required="true" value="#{ipBean.ipValor}>
    <f:validador validadorId="validadorIP" />
</h:inputText> 
```






