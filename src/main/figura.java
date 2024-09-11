package main;

public abstract class figura {
    protected double x;
    protected double y;

    public figura() {}

    public figura(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public abstract double calcularArea();
}
