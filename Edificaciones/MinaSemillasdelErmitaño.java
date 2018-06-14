package Edificaciones;

import Guerreros.Guerrero;

public class MinaSemillasdelErmitaño implements edificacion {


    int costo1= 300;
    int costo2= 200;
    int costo3= 0;

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
        return "MINA DEL ERMITAÑO";
    }

    public String recurso(){
        return "Semillas";
    }
    @Override
    public int vida() {
        return 275;
    }

    @Override
    public void funcion(centroMando cm) {
        int recur = 25;
        cm.recurso3= cm.recurso3 + recur;

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
