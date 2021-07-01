package modelo;

public class Rectangulo {
    private int base;
    private int altura;
    
    public Rectangulo(){}
    
    public Rectangulo(int base, int altura){
        this.base = base;
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    public int getArea(){
        return this.base * this.altura;
    }
}
