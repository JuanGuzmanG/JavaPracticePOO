package main;

//hereda de main.usuario
public class afiliado extends usuario{

    private String nivel;

    public afiliado(int CC, String name, String telefono, String nivel) {
        super(CC, name, telefono);
        this.nivel = nivel;
    }

    public afiliado(){

    }

    public afiliado(String nivel) {
        this.nivel = nivel;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    @Override
    public String toString() {
        return "afiliado{ "+ getName() + " " + getCC() +
                " nivel='" + nivel + '\'' +
                '}';
    }
}
