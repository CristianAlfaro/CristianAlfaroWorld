package Guerreros;

import Edificaciones.centroMando;

public class SoldadoCrepuscular implements Guerrero{

    int costo1= 150;
    int costo2= 100;
    int costo3= 20;

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
    public Guerrero guerrero() {
        Guerrero soldado = new SoldadoCrepuscular();
        System.out.println("has creado un soldado del crepusculo");
        return soldado;
    }

    @Override
    public void costo(centroMando cm) {
        System.out.println(
                "\nRUPIAS: " + costo1 + "\nKRONOLITO: " + costo2 + "\nMETERIAL MAESTRO: " + costo3
        );
    }

    @Override
    public int vida() {
        return 100;
    }

    @Override
    public int ataque() {
        return 50;
    }

    @Override
    public String nombre() {
        return "SOLDADO CREPUSCULAR";
    }


}
