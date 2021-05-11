//Java benas debe cuemplir todos los requisitos:
// contructorr, vacio
// get y set
// serealizacion: el objeto se combiarte a bits

package domain;

import java.io.Serializable;

public class Person implements Serializable{
    private String nombre;
    private String apellido;
    
    /* PARA JAVA BEANS ES obligartoria tener el comtrucor vacio 
    */
    public Person(){
     /*vacio*/
    }
    public Person(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return "Person{" + "nombre=" + nombre + ", apellido=" + apellido + '}';
    }
}

