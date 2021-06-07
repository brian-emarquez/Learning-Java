### Sesion HTTP

- El objeto Sesion HTTP sessionse optiene partir de onjeto HTTP Servlet request.

### Manejo de sesiones con Servlets

-`request.getSession()`: se utiliza para obtener la sesion que se creo a partir de la peticion del cliente.

-`sesion.getAtribute()`: Permite obtener un atributo preciamente agregado a la sesion del cliente.

-`sesion.setAttrbute()`: Permite eliminar un atributo agregado a la sesion

-`sesion.invalidate()`: Invalida la sesion actual del cliente.

-`sesion.isNew()`: Permite saber si la sesion ha sio recien creada

-`sesion.getCreationTime(): Permite conocer en la fecha y hora cuando se creo la sesion

-`sesion.getLastAccedesTime()`: Permite conocer la ultima ves en que la sesion fue accedisa por el cliente

- `sesion.getMaxInactiveInterval()`: Primite conocer el tiempo de inactividad(en segundos) necesaio  para wu ela sesion se destruya sino recibe una peticion

- sesion.setMaxInactiveInterval(): Permite modificar el valor mencionado en funcion anterior. Este valor tambien se puede modificar en el archovo web.xml

