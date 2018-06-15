package Carros;

import Edificaciones.centroMando;
import Edificaciones.edificacion;

public class CaballoReal implements Carro{

    int costo1= 300;
    int costo2= 200;
    int costo3= 40;

    @Override
    public Carro carro(){
        Carro carro = new CaballoReal() {
        };
        System.out.println("has creado un caballo real");
        return carro;
    }

    @Override
    public int vida() {
        return 400;
    }

    @Override
    public int ataque() {
        return 50;
    }

    @Override
    public void ataque(edificacion edif, int vida) {
        int at= ataque();
        edif.setVida(edif.getVida()-at);
    }

    @Override
    public String nombre() {
        return "CABALLO REAL";
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
