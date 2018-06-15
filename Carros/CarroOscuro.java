package Carros;

import Edificaciones.centroMando;
import Edificaciones.edificacion;

public class CarroOscuro implements Carro{

    int costo1= 200;
    int costo2= 260;
    int costo3= 60;

    @Override
    public Carro carro(){
        Carro carro = new CarroOscuro() {
        };
        System.out.println("has creado un carro oscuro");
        return carro;
    }

    @Override
    public int vida() {
        return 600;
    }

    @Override
    public int ataque() {
        return 25;
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
        return "CARRO OSCURO";
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
