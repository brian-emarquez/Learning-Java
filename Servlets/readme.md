### Servlets

- Es una clase de clase de java que permite profesar peticiones web mediente html

_Funciones_

- Controlar el flujo de una aplacion web
 
 <table align="center" >
  <tr>
    <td align="center" style="padding=0;width=50%;">
      <img align="center" style="padding=0;" src="../images/funcionesServlets.png" />
    </td>
  </tr>
</table>

_Metodos HTTP y Procesamiento con servlets_

En total son 8 los metodos soportados por el protocolo HTTP. los cuales son Options, Get, Head, Post, Put, Delete, Trace y Conect. lo metodos mas utilizados son GET Y POST.


-Ciclo de visa de un servlet_

1. Se compila y se carla la clase
2. Se crea un subproceso (hilo del servlet)
3. Se ejecuta el metodo init()
4. Se ejecuta el metodos de service()
5. Se ejecuta el metodo destroy()


