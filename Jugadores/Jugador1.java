package Jugadores;

import Razas.Raza;

public class Jugador1 implements Jugadores{

    private String nombre;
    public Raza razaP1;

    private static Jugador1 jugador1;

    public Jugador1(){}

    //INICIA EL JUGADOR
    public static Jugador1 getInstance(){
        if(jugador1 == null){
            jugador1 = new Jugador1();
        }
        return jugador1;
    }

    //OBTIENE EL NOMBRE QUE EL USUARIO USARA
    public String getNombre() {
        return nombre;
    }

    //PERMITE DAR UN NOMBRE AL JUGADOR
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //OBTIENE LA RAZA DEL JUGADOR
    public Raza getRazaP1() {
        razaP1.nombre1();
        System.out.println(razaP1.nombre1());
        return razaP1;
    }

    //NOMBRE DE LA RAZA ELEGIDA
    public String getRazaN(){
        return razaP1.nombre1();
    }

    //SE LE AGREGA UNA RAZA AL JUGADOR
    public void setRazaP1(Raza razaP1) {
        this.razaP1 = razaP1;
    }
}
