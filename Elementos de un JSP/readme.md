### Elementos de un JSP

- Expressios:

    > Sintaxis: <%= expresion%>
    > La expresion se evalua y se inserta en la salida del servlet
    > Es quivalewnte a out.print(expresion)

- Scriptlets:

    > Sintaxis <% codigoJava %>
    > El codigo Java se inserta en el metodo service() delñ servlet generado
    > Puede ser cualquier Codigo java valido.

- Declaraciones:

    > Sintaxis <%! codigoJava %>
    > Se utiliza para agregar codigo a la clase del servlet generado
    > Se pueden declarar variables o metodos que pertenecen a la clase

- Sintaxis XML:

    > Cada elemento JSP tiene su equivalente en sistaxis XML
    > esta sintaxis se tuliza para tener mayor compatibilidad , por ejemplo con herramientas visuales



### Variables Impicitas en los JSPs

- request
    - Es el objeto HTTPServletRequest

- response:
    - Es el objeto HTPPServletRepsonse  

- out:
    - Es el objeto HttpSersion asociado con el objeto request

- session:
    - Es el objeto HTTPSesion asiaciso con el objeto request