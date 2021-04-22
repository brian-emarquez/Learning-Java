package pe.com.empreda.mundopc;

public class Teclado extends DispositivoEntrada{
    
    private final int idTeclado;
    private static int contadorTeclado;
    
    public Raton(String tipoEntrada, String marca){
        super(tipoEntrada, marca);
        this.idTeclado = ++Raton.contadorRatones;
    }

    @Override
    public String toString() {
        return "Raton{" + "idRaton=" + idTeclado +", " + super.toString() +'}';
    }     
}
}
