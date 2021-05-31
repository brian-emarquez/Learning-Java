## Cabeceros de peticion

**Request Headers (Cabeceros de peticion)**

los Cabeceros de peticion permiten obtener metadatos de la peticion HTTO.Ej

- El metodos HTTP utilizado en la peticion (GE, POST, etc)
- La IP del equipo que realizo la peticion(192.168.1.1)
- El domino del equipo que realizo la peticion(www.mydomain.com)
- El recurso solicitado(http.//mydomain.com/recurso)
- El navegador que se utilizo en la peticion (MOzila, MSIE, etc)

**Metodos de la clase la clase HttpServletRequest**

- getHeader()
- getHeaders()
- getHeaderNames()

**Algunos metodos mas especializados:**

- getCookies()
- getAuthType() y getRemoteUser()
- getContentLength()
- getContentType()
- getDateHeaders()
- getIntHeader()

