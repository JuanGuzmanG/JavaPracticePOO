package main;

public class cuadrado extends figura{
    double  lado;

    public cuadrado() {
    }

    public cuadrado(double lado) {
        this.lado = lado;
    }

    public cuadrado(double x, double y, double lado) {
        super(x, y);
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return lado * lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
}
