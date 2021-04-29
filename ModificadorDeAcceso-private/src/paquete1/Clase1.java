/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

/*el atributo private no funciona en clases*/

class Clase1 {
    private String atributoDefault = "Valor Atributo private";
    
    private Clase1(){
        System.out.println("Constructor private");
    }
    
    public Clase1(String argumento){
        this();
        System.out.println("Constructor publico");
    }
     
    private void metodoprivate(){
        System.out.println("Metodo private");
    }
    /**/
    
    public String getAtributoDefault() {
        return atributoDefault;
    }

    public void setAtributoDefault(String atributoDefault) {
        this.atributoDefault = atributoDefault;
    }
    
    
    
}
