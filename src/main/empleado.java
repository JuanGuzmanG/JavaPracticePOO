package main;

//hereda de main.usuario
public class empleado extends usuario{

    String cargo;

    public empleado(int CC, String name, String telefono, String cargo) {
        super(CC, name, telefono);
        this.cargo = cargo;
    }

    public empleado(){}

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}
