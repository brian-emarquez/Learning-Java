## Managed Beans JSF Intoduccion

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


