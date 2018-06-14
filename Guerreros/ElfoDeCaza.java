package Guerreros;

import Edificaciones.centroMando;

public class ElfoDeCaza implements Guerrero{

    int costo1= 200;
    int costo2= 200;
    int costo3= 100;

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
        Guerrero elfo = new ElfoDeCaza();
        System.out.println("has creado un elfo de caza");
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
        return 200;
    }

    @Override
    public int ataque() {
        return 10;
    }

    @Override
    public String nombre() {
        return "ELFA DE CAZA";
    }

}
