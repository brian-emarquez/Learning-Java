package operaciones;

public class Aritmetica {
    //Atributos de la clase
    int a;
    int b;
    
    // Creacion de un contructor Vacio
    public Aritmetica(){ // lo primero que se ejecuta
        System.out.println("Ejecutando Constructor");
    }
    
    //Metodo
    public void sumar(){
        int resultado = a + b;
        System.out.println("resultado = " + resultado);
    } 
     // metodo sumarConRetorno 
    public int sumarConRetorno(){
//        int resultado = a + b;
//        return resultado;
        return this.a + this.b;
    }    
    // metodo sumarConArgumentos()
    public int sumarConArgumentos(int a, int b){ // argumentos
        //Uso opcional es un apractica comun, , hace referecia a un atributo de la clase
        // Al ver this nos dice que hace refereciia un atributo de la clases
        this.a = a; // El argumento a sse asigna al atributo this.a
        this.b = b;
        //return a+b;
        return this.sumarConRetorno();
    }
}
