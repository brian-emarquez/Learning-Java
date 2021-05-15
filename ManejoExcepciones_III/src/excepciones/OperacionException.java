package excepciones;

public class OperacionException extends RuntimeException{
    public OperacionException (String mensaje){
        super(mensaje);
    }
}
