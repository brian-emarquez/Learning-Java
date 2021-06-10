### Introduccion a los JSPS

<table align="center" >
  <p align="center">Velocidad</p>
  <tr>
    <td align="center" style="padding=0;width=50%;">
      <img align="center" style="padding=0;" src="../images/jsp.jpg" />
    </td>
  </tr>
</table

- Java Server Pages

**Beneficios de los JSPS**

- Enfocados en escribir codigo HTML, haciendo mas facil el mantenimiento de la capa de presentacion

- Se pueden utilizar herramientas de diseño para crear visualmebnte las pagina HTML e incrustar las etiquetas dinamicas de los JSP's.

- Sepera el codigo de presentacion del codigo de java.

**Funciones de un JSP**

- JSP (Vista)
- Servlet (Controlador)
- JavaBean (Modelo)

**Ciclo de vida de un JSP**

1. Se traduce el JSP a un servlet
2. Se compila y se carga la classe del servlet
3. Se Crea un subproceso del servlet
4. Se ejecuta el metodo init()
5. Se ejecuta el metodo service()
6. Se ejecuta el metodo destroy()

