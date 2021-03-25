package operaciones;

public class Aritmetica {
    //Atributos de la clase
    int a;
    int b;

    //Metodo
    public void sumar(){
        int resultado = a + b;
        System.out.println("resultado = " + resultado);
    } 
     // metodo sumarConRetorno 
    public int sumarConRetorno(){
//        int resultado = a + b;
//        return resultado;
        return a + b;
    }    
    // metodo sumarConArgumentos()
    public int sumarConArgumentos(int arg1, int arg2){ // argumentos
        a = arg1;
        b = arg2;
        //return a+b;
        return sumarConRetorno();
    }
}
