package main;

public class circulo implements figura, Dibujable,Rotable {

    private double radio;

    public circulo() {}
/*
    public circulo(double x, double y, double lado) {
        super(x, y);
        this.radio = radio;
    }*/

    public circulo(double radio) {
        this.radio = radio;
    }

    public void dibujar(){
        System.out.println("Dibujando circulo");
    }
    public void rotar(){
        System.out.println("Rotando circulo");
    }

    @Override
    public double calcularArea() {
        return 3.14 * (radio*radio);
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
}
