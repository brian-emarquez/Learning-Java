### Patrones de Diseño y Buenas Practicas

<table>

<tr>
    <td>Capa de Presentacion</td>
    <td>Capa de Negocio</td>
    <td>Capa Datos</td>
</tr>
    <td>Administra el flujo y presentacion de las pantallas del sistema</td>
    <td>Procesar la logica del negocio y los servivios del sistema </td>
    <td>Obtiene y guarda infor,acion de las fuentes de datos como son Una BD archivo, etc</td>
</table>

### Cohesion y acoplamiento

- El Objetico del diseño es minimizar costos de desarrollo

- `La Cohesion` es la medida en la que un componente de software se dedida a realizar solo la tarea para la cual fue creado, delegando las tareas complementarias a otros componentes.

- `El acoplamiento` es la medida que los cambios de un componente tiende a necesita cambios de otro componente: clases

- El Objetivo del diseño de software es tener un alta coehsion y un bajo acoplamieto

### Patrones de Diseño

<table>
<tr>
    <td>Capa de Presentacion</td>
    <td>Capa de servicio</td>
    <td>Capa Acceso a Datos</td>
</tr>
    <td>MVC, Front Controller, DTO</td>
    <td>Business Delegate, Service Locator, DTOP</td>
    <td>DAO, DTO</td>
</table>

