package Guerreros;

import Edificaciones.centroMando;
import Edificaciones.edificacion;

public class SoldadoReal implements Guerrero{

    int costo1= 200;
    int costo2= 150;
    int costo3= 40;

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
        Guerrero soldado = new SoldadoReal();
        System.out.println("has creado un soldado Real");
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
        return 200;
    }

    @Override
    public void ataque(edificacion edificacion) {

    }

    public int ataque() {
        return 75;
    }

    @Override
    public String nombre() {
        return "SOLDADO REAL";
    }


}
