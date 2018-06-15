package Guerreros;

import Edificaciones.centroMando;
import Edificaciones.edificacion;

public class ElfoDeCaza implements Guerrero{

    int costo1= 100;
    int costo2= 130;
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
        return 150;
    }

    @Override
    public void ataque(edificacion edif,int vida) {
        int at= ataque();
        edif.setVida(edif.getVida()-at);
    }

    @Override
    public int ataque() {
        return 250;
    }

    @Override
    public String nombre() {
        return "ELFO DE CAZA";
    }

}
