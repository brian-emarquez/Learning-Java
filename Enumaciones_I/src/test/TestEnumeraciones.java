package test;
import enumacion.Dias;

public class TestEnumeraciones {
    public static void main(String[] args) {
        System.out.println("Dias1: " + Dias.LUNES);
        indicarDiaSemana(Dias.LUNES);
    }
    private static void indicarDiaSemana(Dias dias){
        switch(dias){
            case LUNES:
                System.out.println("Primer dia de la semana");
                break;
            case MARTES:
                System.out.println("Primer Segundo de la semana");
                break;
            case MIERCOLES:
                System.out.println("Primer tercer de la semana");
                break;
            case JUEVES:
                System.out.println("Primer Cuarto de la semana");
                break;
            case VIERNES:
                System.out.println("Primer quinto de la semana");
                break;                   
        }
    }
}
