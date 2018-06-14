package Jugadores;

import Razas.Raza;

public class Jugador2 implements Jugadores{
    private String nombre;
    public Raza razaP2;

    private static Jugador2 jugador2;

    public Jugador2() {
    }

    public static Jugador2 getInstance() {
        if (jugador2 == null) {
            jugador2 = new Jugador2();
        }
        return jugador2;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Raza getRazaP1() {
        razaP2.nombre1();
        System.out.println(razaP2.nombre1());
        return razaP2;
    }

    public String getRazaN(){
        return razaP2.nombre1();
    }

    public void setRazaP2(Raza razaP2) {
        this.razaP2 = razaP2;
    }
}
