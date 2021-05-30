## Spring MVC

-Un controlador (Controller) es Spring MVC) es una clase normal a la cual se le arega la anotacion `@controller` a novel de la clase.
- En Una aplicacion web estos metodos principalmente esta marcados con las anotaciones `@GetMapping`, `@PostMapping`, `@ResquestMapping`(Action Controller)
- Los Metodos pueden tener cualquier nombre y deben regresar un String (nombre de la vista)
- Los metodos son ejecutados al ser invocados por medio de la URL espefifica como parametro en las anotaciones `@GetMapping`, etc.

## Inversion Of Control

- Invierte el flujo de control del programa, externalizando(agente externo: framework) la contruccion y manejo de objetos

_Ventajas_

- Proporciona modularidad
- Permite amplair la funcionalidad de nuestras aplicaciones son modificar las clases
- Evita la dependencia entre clases
- Flexibiliza nustras aplicaciones haciendolas mas configurables

