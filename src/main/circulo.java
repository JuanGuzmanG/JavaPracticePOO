package main;

public class circulo extends figura {

    private double radio;

    public circulo() {}

    public circulo(double x, double y, double lado) {
        super(x, y);
        this.radio = radio;
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
