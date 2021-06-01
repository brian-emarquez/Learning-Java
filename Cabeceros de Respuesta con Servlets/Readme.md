### Cabeceros de Respueta con Servlets

- Los Cabeceros de respuesta se utlizan para indcar al navegador Web como debe comportarse ante una respuesta de arte del servidor Web

- Un Ejemplo comun es generar hojas de Excel, PDF's Audio, Video, etc, en lugar de solamente responder con texto

- para indicar el tipo de respuesta que se utilizaran los tipos MIME (Multipursose Internet Mail Extensions)

- Los Tipos MIME son un conjunto de Especificaciones con objetico de intercambiar archovos a traves de internent como puede ser texto, audio , etc.

**Ejemplos Comunes de tipos MIME**

- application/msword  -> Microsoft Word Documents
- application/pdf -> Acrobat (.pdf)
- application/vnd.ms-excel -> Excel Spreadsheet
- application/vnd.ms-powerpoint -> Powerpoint presentation
- application/zip -> Zip archive
- audio/x-wav -> Micrisift Windons Sound file
- Otros

**API De servlets al utilizar cabeceros de respuesta**

Metodos para establecer valores de Headers:

```java
response.setHeader(String nombreCabecero, Sring valorCavecero), setDateHeader y setIntHeader ponen un cabecero, si ya exote lo renplaza
```

**Metodos mas comunes para establecer valores de lo Headers**

- setContentType(Se utiliza la Tabla MIME para difinir su valor)
- setConetentLenght
- addCookie
- sendRedirect

**Cabeceros de respuesta mas Comunes**

- Cache-controly Pragma: se usan para el control del cache
- Content-Encoding: Indicar la codificacion del documento
- Content-Lenght: Indicar el numero de bytes en la respuesta
- Content Type: Indica MIME a responder
- Expires: Indica el tiempo que el documento considera expirado
- Last - Modifield: Indica el tiempo es que el documento fue modificado
- Refresh: Indica los segundos en que el navegados recarga la pagina




