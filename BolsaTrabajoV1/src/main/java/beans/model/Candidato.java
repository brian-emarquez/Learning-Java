package beans.model;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Named
@RequestScoped
public class Candidato {
    private String nombre;
    private String apellido;
    private String salarioDeseado;
    
    Logger log = LogManager.getRootLogger();
    
    public Candidato(){
        log.info("Creando el objeto candidato");
        this.setNombre("Introduce tu nombre");
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
        log.info("MOdificando la propiedad de nombre " + this.nombre);
    }
            
            
            
}
