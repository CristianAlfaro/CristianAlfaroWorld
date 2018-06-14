package Edificaciones;

import Guerreros.Guerrero;

public class MinaElixirOscuro implements edificacion {


    int costo1= 200;
    int costo2= 50;
    int costo3= 150;

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
        return "MINA DE ELIXIR OSCURO";
    }

    @Override
    public int vida() {
        return 0;
    }

    public String recurso(){
        return "Elixir Oscuro";
    }

    @Override
    public void funcion(centroMando cm) {
        int recur = 75;
        cm.recurso3= cm.recurso3 + recur;

    }

    @Override
    public Guerrero funcionWar(centroMando cm) {
        return null;
    }

    @Override
    public void costo(centroMando cm) {
        System.out.println(
                "\nELIXIR: " + costo1 + "\nELIXIR OSCURO: " + costo2 + "\nAGUA SAGRADA: " + costo3
        );
    }
}
