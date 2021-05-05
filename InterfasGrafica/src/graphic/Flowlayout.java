/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphic;
import java.awt.*;

public class Flowlayout extends Frame{
    
    private Button b1, b2, b3;
    
    public Flowlayout(){
       super("Esta es la ventan 1");
       setLayout(new FlowLayout());
       
       b1= new Button("Boton 1");
       add(b1);
       
       b2= new Button("Boton 2");
       add(b2);
       
       b3= new Button("Boton 3");
       add(b3);
       
        setSize(400, 300);
        setVisible(true);
        
    }
    public static void main(String[] args) {
        Flowlayout v1= new Flowlayout();
    }
    
}
