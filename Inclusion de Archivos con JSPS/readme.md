### Inclusion de Archivos en JSPS

- Inclusion Estatica (Translarion time):
    ><%@ inlude file="paginaRelativa.jsp" %>

- Inclusion Dinamica (Request time):
    ><jsp:inlude page="paginaRelativa.jsp" />   

---

_Inclusion Estatica_

* Sintaxis:

```java
<%@ inlude file="paginaRelativa.jsp" %>
```

* Objetivo:

- Reutilizar codigo en texto pano, HTML o JSPS
- En este cado el JSP que se inclure puede afectar al JSP incluyente

* Nota:
- En este caso no se delega el control al JSP incluido , sino que se incluye n archivo JSP enerando un unico JSP

- po lo anterior, se puedem tener variables o metodos que se comparten entre los JSPS
