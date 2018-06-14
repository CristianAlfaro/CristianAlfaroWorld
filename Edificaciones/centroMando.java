package Edificaciones;

import Guerreros.Guerrero;
import Jugadores.Jugadores;
import Razas.*;



public class centroMando implements edificacion {

    Raza raza1 = new Saiyajin();
    Raza raza2 = new Hylianos();
    Raza raza3 = new ElfosOscuros();
    public int vida=3000;
    public int recurso1 = 400;
    public int recurso2 = 400;
    public int recurso3 = 100;

    public int recurso1tope = 10000;
    public int recurso2tope = 5000;
    public int recurso3tope = 3000;

    public int recurso1mejora = 1000;
    public int recurso2mejora = 500;
    public int recurso3mejora = 300;

    public boolean juego = true;


    public void mostrartope(centroMando cm, Jugadores p1){
        if (p1.getRazaN() == raza1.nombre1()) {
            System.out.println("\nLOS RECURSOS MAXIMOS QUE TU CENTRO DE MANDO PUEDE TENER SON:\n");
            raza1.recursos(recurso1tope, recurso2tope, recurso3tope);
        } else if (p1.getRazaN() == raza2.nombre1()) {
            System.out.println("\nLOS RECURSOS MAXIMOS QUE TU CENTRO DE MANDO PUEDE TENER SON:\n");
            raza2.recursos(recurso1tope, recurso2tope, recurso3tope);
        } else if (p1.getRazaN() == raza3.nombre1()) {
            System.out.println("\nLOS RECURSOS MAXIMOS QUE TU CENTRO DE MANDO PUEDE TENER SON:\n");
            raza3.recursos(recurso1tope, recurso2tope, recurso3tope);

        }
    }

    public void mejorar(centroMando cm){
        cm.recurso1tope= cm.recurso1tope + 1000;
        cm.recurso2tope= cm.recurso2tope +500;
        cm.recurso3tope= cm.recurso3tope + 300;
        cm.vida = cm.vida +750;
    }

    @Override
    public boolean Sepuede(centroMando cm) {
        return false;
    }

    @Override
    public String nombre() {
        return "Centro de Mando";
    }

    @Override
    public int vida() {
        return vida;
    }

    @Override
    public void funcion(centroMando cm) {

    }

    @Override
    public Guerrero funcionWar(centroMando cm) {
        return null;
    }
    @Override
    public void costo(centroMando cm) {

    }


    public void Recursos(Jugadores p1) {
        if (p1.getRazaN() == raza1.nombre1()) {
            raza1.recursos(recurso1, recurso2, recurso3);
        } else if (p1.getRazaN() == raza2.nombre1()) {
            raza2.recursos(recurso1, recurso2, recurso3);
        } else if (p1.getRazaN() == raza3.nombre1()) {
            raza3.recursos(recurso1, recurso2, recurso3);

        }
    }
}