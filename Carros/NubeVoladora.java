package Carros;

import Edificaciones.centroMando;
import Edificaciones.edificacion;

public class NubeVoladora implements Carro{

    int costo1= 200;
    int costo2= 300;
    int costo3= 20;

    @Override
    public Carro carro(){
        Carro carro = new NubeVoladora() {
        };
        System.out.println("has creado una nube voladora");
        return carro;
    }

    @Override
    public int vida() {
        return 300;
    }

    @Override
    public int ataque() {
        return 75;
    }

    @Override
    public void ataque(edificacion edif, int vida) {
        int at= ataque();
        edif.setVida(edif.getVida()-at);
    }

    @Override
    public String nombre() {
        return "NUBE VOLADORA";
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
                "\nARROZ: " + costo1 + "\nRAMEN: " + costo2 + "\nSEMILLAS DEL ERMITAÑO: " + costo3
        );
    }
}
