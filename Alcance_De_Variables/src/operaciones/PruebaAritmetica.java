package operaciones;

public class PruebaAritmetica {
    public static void main(String[] args) {
        
        //- Existe dos tipos de Almacenamiento en Memerio Stack y Heeap:
        //* Stack : Variables Locales
        //* Heap: almacenar objetos
        
        // Variables Locales
        var a = 10;
        var b = 2;
        miMetodo();
        
        Aritmetica aritmetica1 = new Aritmetica();
         
        System.out.println("aritmetica1 a: = " + aritmetica1.a);
        System.out.println("aritmetica1 b: = " + aritmetica1.b);
        
        Aritmetica aritmetica2 = new Aritmetica(5, 8);
        System.out.println("aritmetica2 a: = " + aritmetica2.a);
        System.out.println("aritmetica2 b: = " + aritmetica2.b);
        
        // Limpiar memoria
        //aritmetica1 = null;
        //System.gc();
    }
    public static void miMetodo(){
        
        // la variable a esta fuera del alcance donde fue definido (a = 10)
        // a = 10
        System.out.println("otro metodo");
        
    }
    
}
