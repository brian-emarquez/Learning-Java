## Managed Beans JSF 2.0 Intoduccion

- Un managed Bean es una clase Java que sigue la nomenclatura de JavaBeans.
    * Los Maneged beans no estan obligados a extender de ningunaotra clase
-Aunque JSF no define una clasificacion para los Backing Beans, podemos defnir las sigueintes:

* Beans de Modelo: Representan el modelo en el patron MVC.
* Beans control representan el controlador en el patron MVC
* Beans de Soporte o Helpers: contiene codigo por ejemplo de convertidores
* Beans de Utilerias: Tareas genericas, como obtener el objeto request

**Uso de los Managed Beans**

Un ManegagedBean se puede declarar de distitas maneras:

* Con anatociones, antes del nombre de la clase:

* Como beans CDI(cContext and Dependency Inyection), antes de nombre de la clase:
    - @named
    - Agregar un archivo llamado beans.xml en la carpeta web/WEB-INF


* En el archivo faces-conf.xml

* En el archivo faces-config.xml:
    - <managed-bean> ... </managed-bean>


**Alcance de los Managed Beans**

<table>
<tr>
    <td>Application</td>
    <td> - Persiste durante toda la aplicacion</td>
</tr>
<tr>
    <td>Session</td>
    <td> - Persiste durante el tiempo de la sesion del usuario</td>
</tr>
<tr>
    <td>View</td>
    <td> - Persiste en la misma vista , utuil en AJAX</td>
</tr>
<tr>
    <td>Request</td>
    <td> - Persiste solo durante la peticion del usuario</td>
</tr>
</table>

## Managed Beans JSF Intoduccion

<table align="center" >
  <tr>
    <td align="center" style="padding=0;width=50%;">
      <img align="center" style="padding=0;" src="./images/JSF1.png" />
    </td>
  </tr>
</table>


Numeration  | File   |  Link       |    Folk     |  Code       | Version     | State       | Download    |  Go back    |
|:----------:|:------:|:-----------:|:-----------:|:-----------:|:-----------:|:-----------:|:-----------:|:-----------:|
|G4       | [Managed Beans JSF Ejercicio](https://github.com/BrianMarquez3/Learning-Java/tree/main/ManagedBeansJSF)  | <img src="https://media.giphy.com/media/9DaWtzJV7WZpxQVzNz/giphy.gif" width="17px">  | ✔️ | yes | yes | ✔️ | 💾 | [⬅️Atras](#JavaServlet-Faces) |
