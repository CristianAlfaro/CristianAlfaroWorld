package Carros;

import Edificaciones.centroMando;

public class TanquedeMagiaOscura implements Carro{

    int costo1= 200;
    int costo2= 200;
    int costo3= 100;

    @Override
    public Carro carro(){
        Carro carro = new TanquedeMagiaOscura() {
        };
        System.out.println("has creado un tanque de magia oscura");
        return carro;
    }

    @Override
    public int vida() {
        return 200;
    }

    @Override
    public int ataque() {
        return 50;
    }

    @Override
    public String nombre() {
        return "TANQUE DE MAGIA OSCURA";
    }

    @Override
    public boolean Sepuede(centroMando cm) {
        if (costo1 <= cm.recurso1 && costo2 <= cm.recurso2 && costo3 <= cm.recurso3) {
            cm.recurso1 = cm.recurso1 - costo1;
            cm.recurso2 = cm.recurso2 - costo2;
            cm.recurso3 = cm.recurso3 - costo3;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void costo(centroMando cm) {
        System.out.println(
                "\nELIXIR: " + costo1 + "\nELIXIR OSCURO: " + costo2 + "\nAGUA SAGRADA: " + costo3
        );
    }
}
