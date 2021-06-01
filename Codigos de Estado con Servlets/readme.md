### Codigo de Estado con Servlets

- Los codigos de estado se utilizan para indicar el estado de la respuesta del servidor web hacia el cliente (Browser)

**API de servlets al usar codigo de estado**

Los Sifuentes metodos nos permitern ndicar el codigo de respuesta del servidor web al cliente

- response.setStatus(int codigo)
se utilizan nomalmente cosntantes , tales como SC_OK, SC_NOT_FOUND, etc

- response.send para mostar el error en un documento HTML, normalmente los navegadores

- response.sendRedirect(String url)
se utiliza para indicar un redeccionamiento  otr pagina. el codigo de esta es el 302

**Codigo de Estado HTTP mas Comunes**

- 200(OK) la respuesta fue correcta , el codigo de estado por default
- 204(Sin contenido): El navegador continua desplegando el documento previo
- 301(Movido permanentemente) El documento dolicitado ha cambiado la ubicacion y posiblemente  se indica la nueva ruta
- 302 (Encontrado) El documento se ha movido temporalmente y el navegador se mueve al nuevo URL de manera automatica.
- 401(Sin Autorizacion) No se tiene permiso para visualizar el contenido solicitado, debido a que se trato de acceder al un recurso protegido con contraseña son la autorizacon respectiva
404(No encontrado) el recuerso solicitado no se encuentra alojado en el servidor web
- 500(Error interno del servidot Web): El servidor Web lanzó uan excepcion irrecurable por lo tanto no se puede continuar procesando la peticion.




