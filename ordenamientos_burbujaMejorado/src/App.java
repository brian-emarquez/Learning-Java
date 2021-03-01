import javax.swing.JOptionPane;

public class App {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //5,4,2,1,3
        String texto=JOptionPane.showInputDialog("Humano ingresa numero divididos por coma");
        String numerosEnTexto[]=texto.split(",");
        int cantidad=numerosEnTexto.length;

        int numeros[]=new int[cantidad],tem, bandera=1;
        for(int i=0;i<cantidad;i++){
                    numeros[i]=Integer.parseInt( numerosEnTexto[i]);
        }

        for(int i=0;i<(cantidad-1) && bandera == 1 ;i++){
            bandera =0;
            for(int j=0;j<(cantidad-1);j++){
                bandera =1;
                if(numeros[j]>numeros[j+1]){
                    tem=numeros[j];
                    numeros[j]=numeros[j+1];
                    numeros[j+1]=tem;
                }
            }
        }

        System.out.println("Humano aqui estan tus numeritos ordenados de forma acendente");
        for(int i=0;i<cantidad;i++){
            System.out.print(numeros[i]+",");
        }
    }
}

