package Edificaciones;

import Guerreros.Guerrero;
import Jugadores.Jugadores;
import Razas.*;



public class centroMando implements edificacion {

    Raza raza1 = new Saiyajin();
    Raza raza2 = new Hylianos();
    Raza raza3 = new ElfosOscuros();
    public int vida=3000;
    public int recurso1 = 500;
    public int recurso2 = 500;
    public int recurso3 = 150;

    public int recurso1tope = 10000;
    public int recurso2tope = 5000;
    public int recurso3tope = 3000;

    public int recurso1mejora = 2000;
    public int recurso2mejora = 1500;
    public int recurso3mejora = 800;

    public boolean juego = true;

    public void mostrar(centroMando cm, Jugadores P){
        System.out.println("LOS LIMITES DE RECURSOS SE ELEVARAN:\n"
                +"\t\t\n"+"RECURSO 1: "+cm.recurso1tope+"---->"+(cm.recurso1tope+1000)
                +"\t\t\n"+"RECURSO 2: "+cm.recurso2tope+"---->"+(cm.recurso2tope+500)
                +"\t\t\n"+"RECURSO 3: "+cm.recurso3tope+"---->"+(cm.recurso3tope+300)
                +"\t\t\n"+"VIDA: "+cm.vida+"---->"+(vida+900)+"\n"+
                "LOS LIMITES DE VIDA SE ELEVARAN:\n"+
                "PARA MEJORARLO DEBES DAR ESTA CANTIDAD DE RECURSOS:\n");

        if (P.getRazaN() == raza1.nombre1()) {
            raza1.recursos(recurso1, recurso2, recurso3,recurso1mejora,recurso2mejora,recurso3mejora);
        } else if (P.getRazaN() == raza2.nombre1()) {
            raza2.recursos(recurso1, recurso2, recurso3,recurso1mejora,recurso2mejora,recurso3mejora);
        } else if (P.getRazaN() == raza3.nombre1()) {
            raza3.recursos(recurso1, recurso2, recurso3,recurso1mejora,recurso2mejora,recurso3mejora);

        }
    }

    public void mejorar(centroMando cm){
        if(cm.recurso1 >= cm.recurso1mejora && cm.recurso2 >= cm.recurso2mejora && cm.recurso2 >= cm.recurso2mejora){
            cm.recurso2mejora = cm.recurso2mejora + 700;
            cm.recurso3mejora = cm.recurso3mejora + 600;
            cm.recurso1 = cm.recurso1-cm.recurso1mejora;
            cm.recurso2 = cm.recurso2-cm.recurso2mejora;
            cm.recurso3 = cm.recurso3-cm.recurso3mejora;
            cm.recurso1tope= cm.recurso1tope + 1000;
            cm.recurso2tope= cm.recurso2tope +500;
            cm.recurso3tope= cm.recurso3tope + 300;
            cm.vida = cm.vida +900;
            cm.recurso1mejora = cm.recurso1mejora + 800;
            System.out.println("EL CENTRO DE MANDO SE HA MEJORADO!!!!");

        }else {
            System.out.println("TE HACEN FALTA ALGUNOS RECURSOS PARA HACERLO");
        }

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

    @Override
    public int getVida() {
        return 0;
    }

    @Override
    public void setVida(int vida) {

    }

    public void Recursos(Jugadores p1) {
        if (p1.getRazaN() == raza1.nombre1()) {
            raza1.recursos(recurso1, recurso2, recurso3,recurso1tope,recurso2tope,recurso3tope);
        } else if (p1.getRazaN() == raza2.nombre1()) {
            raza2.recursos(recurso1, recurso2, recurso3,recurso1tope,recurso2tope,recurso3tope);
        } else if (p1.getRazaN() == raza3.nombre1()) {
            raza3.recursos(recurso1, recurso2, recurso3,recurso1tope,recurso2tope,recurso3tope);

        }
    }
}