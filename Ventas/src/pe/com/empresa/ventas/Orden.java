/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.com.empresa.ventas;

/**
 *
 * @author brian
 */
public class Orden {
    private int idOrden;
    private Producto productos[];
    private static int contadorOrdenenes;
    private int contadorPrductos; /*añadoido extra*/
    private static final int MAX_PRODUCTOS = 10;
    
    /*Construcotor*/
    public Orden(){
        this.idOrden = ++Orden.contadorOrdenenes;
        this.productos =  new Producto[Orden.MAX_PRODUCTOS];
        
    }
     public void agregarProducto(Producto producto){
         if(this.contadorPrductos<Orden.MAX_PRODUCTOS){
             productos[contadorPrductos++] = producto;
         }else{
             System.err.println("Se ha superado el maximo de productos: " + Orden.MAX_PRODUCTOS);
         }
     }
   
    public double calcularTotal(){
        double total = 0;
        for (int i = 0; i < contadorPrductos; i++) {
            Producto producto = this.productos[i];
            total+=producto.getPrecio();/* total = total + producto.getprcio()*/
            //total += this.productos[i].getPrecio(); /*simplificado a una linea de codigo*/
        } 
        return total;
    }
    
    public void mostrarOrden(){
        System.out.println("if Orden= " + this.idOrden); 
        double totalOrden  = this.calcularTotal();
        System.err.println("Total de la Orden : $" + totalOrden);
        System.err.println("Productos de la Orden:");
        for (int i = 0; i < this.contadorPrductos; i++) {
            System.out.println(this.productos[i]);
        }
            
        }
    }
}
