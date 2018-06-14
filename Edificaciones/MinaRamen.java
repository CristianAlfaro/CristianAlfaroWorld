package Edificaciones;

import Guerreros.Guerrero;

public class MinaRamen implements edificacion {


    int costo1= 200;
    int costo2= 100;
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
    public String nombre() {
        return "MINA DE RAMEN";
    }

    @Override
    public int vida() {
        return 0;
    }

    public String recurso(){
        return "Ramen";
    }

    @Override
    public void funcion(centroMando cm) {
        int recur = 50;
        cm.recurso2= cm.recurso2 + recur;

    }

    @Override
    public Guerrero funcionWar(centroMando cm) {
        return null;
    }

    @Override
    public void costo(centroMando cm) {
        System.out.println(
                "\nARROZ: " + costo1 + "\nRAMEN: " + costo2 + "\nSEMILLAS DEL ERMITAÑO: " + costo3
        );
    }
}
