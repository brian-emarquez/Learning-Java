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

* Notas:
- En este caso no se delega el control al JSP incluido , sino que se incluye n archivo JSP enerando un unico JSP

- po lo anterior, se puedem tener variables o metodos que se comparten entre los JSPS

- Parar tener la version mas reciente , se recomieda compilar y contruir el proyecto


<table align="center" >
  <tr>
    <td align="center" style="padding=0;width=50%;">
      <img align="center" style="padding=0;" src="./images/inclusionEstatica.png" />
    </td>
  </tr>
</table>


inclusionDinamica.png

___

_Inclusion Dinamica_

* Sintaxis:

<jsp:inlude page="paginaRelativa.jsp" />  

* Objetivo:

- Reutilizar codigo en texto pano, HTML o JSPS
- Permite actualizar el contenido sin alterar al JSP que incluye el contenido a reutilizar

* Notas

- El JSP perincipal, delega el control al JSP incluido y la salida del JSP se agrega a l JSP principal
La Pagian debe ser relativa a la aplicacion Web (USO de /)
Se puede incluir archivos provados (desde la carpeta WEB.INF)

<table align="center" >
  <tr>
    <td align="center" style="padding=0;width=50%;">
      <img align="center" style="padding=0;" src="./images/inclusionDinamica.png" />
    </td>
  </tr>
</table>