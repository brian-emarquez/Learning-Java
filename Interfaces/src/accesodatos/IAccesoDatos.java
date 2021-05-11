package accesodatos;

public interface IAccesoDatos {
    int MAX_REGISTRO = 10;
    
    /* metodo abstracto , definido automaticamente*/
    void insertar();
    void listar();
    void actualizar();
    void eliminar();
}
