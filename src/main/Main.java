package main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        System.out.println("HERENCIA Y POLIMORFISMO");
        afiliado afi = new afiliado();
        empleado emp = new empleado();

        afi.setName("juan");
        emp.setName("jose");

        System.out.println(afi.getName()+" "+emp.getName());

        System.out.println("CLASES ABSTRACTAS");
        cuadrado cu = new cuadrado();

        cu.setLado(2);
        System.out.println("area cuadrado: "+cu.calcularArea());
        cu.dibujar();
        circulo cir = new circulo();
        cir.setRadio(2);
        cir.rotar();
        cir.dibujar();
        System.out.println("area del circulo: "+ cir.calcularArea());
    }
}

