package Guerreros;

import Edificaciones.centroMando;

public class ElfoNoble implements Guerrero{

    int costo1= 150;
    int costo2= 200;
    int costo3= 30;

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
        Guerrero elfo = new ElfoNoble();
        System.out.println("has creado un elfo noble");
        return elfo;
    }

    @Override
    public void costo(centroMando cm) {
        System.out.println(
                "\nELIXIR: " + costo1 + "\nELIXIR OSCURO: " + costo2 + "\nAGUA SAGRADA: " + costo3
        );
    }

    @Override
    public int vida() {
        return 300;
    }

    @Override
    public int ataque() {
        return 50;
    }

    @Override
    public String nombre() {
        return "ELFO NOBLE";
    }

}
