package Carros;

import Edificaciones.centroMando;
import Edificaciones.edificacion;

public class GuardianSheika implements Carro{

    int costo1= 300;
    int costo2= 250;
    int costo3= 100;

    @Override
    public Carro carro(){
        Carro carro = new GuardianSheika() {
        };
        System.out.println("has creado un guardian shieka");
        return carro;
    }

    @Override
    public int vida() {
        return 600;
    }

    @Override
    public int ataque() {
        return 150;
    }

    @Override
    public void ataque(edificacion edif, int vida) {
        int at= ataque();
        if(edif.vida() >= at){
            edif.setVida(edif.getVida()-at);

        }
    }

    @Override
    public String nombre() {
        return "GUARDIAN SHEIKA";
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
                "\nRUPIAS: " + costo1 + "\nKRONOLITO: " + costo2 + "\nMETERIAL MAESTRO: " + costo3
        );
    }
}
