package main;

public class usuario {

    private int CC;
    private String name;
    private String telefono;

    public usuario(int CC, String name, String telefono) {
        this.CC = CC;
        this.name = name;
        this.telefono = telefono;
    }

    public usuario() {
    }

    public int getCC() {
        return CC;
    }

    public void setCC(int CC) {
        this.CC = CC;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
