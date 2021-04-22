
package pe.com.empresa.ventas;

/**
 *
 * @author brian
 */
public class Producto {
    private final int idproducto;
    private String nombre;
    private double precio;
    private static int contadorProductos;
    
    private Producto(){
        this.idproducto = ++Producto.contadorProductos;
    }
    public Producto(String nombre, double precio){
        this(); /*llamada al constructor provado*/
        this.nombre = nombre;
        this.precio = precio;
    }

    public int getIdproducto() {
        return idproducto;
    }
       
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Producto{" + "idproducto=" + idproducto + ", nombre=" + nombre + ", precio=" + precio + '}';
    }
    
    
}
