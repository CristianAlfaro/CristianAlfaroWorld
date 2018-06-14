package Edificaciones;

import Guerreros.Guerrero;

public class MinaArroz implements edificacion {


    int costo1 = 0;
    int costo2 = 170;
    int costo3 = 20;

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
        return "MINA DE ARROZ";
    }

    @Override
    public int vida() {
        return 0;
    }

    public String recurso() {
        return "Arroz";
    }

    @Override
    public void funcion(centroMando cm) {
        int recur = 75;
        cm.recurso1 = cm.recurso1 + recur;

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
