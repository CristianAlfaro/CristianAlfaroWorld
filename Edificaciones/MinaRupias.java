package Edificaciones;

import Guerreros.Guerrero;

public class MinaRupias implements edificacion {


    int costo1= 0;
    int costo2= 150;
    int costo3= 50;
    int vida = 200;

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
        return "MINA DE RUPIAS";
    }

    @Override
    public int vida() {
        return vida;
    }

    public String recurso(){
        return "Rupias";
    }

    @Override
    public void funcion(centroMando cm) {
        int recur = 100;
        cm.recurso1= cm.recurso1 + recur;

    }

    @Override
    public Guerrero funcionWar(centroMando cm) {
        return null;
    }

    @Override
    public void costo(centroMando cm) {
        System.out.println(
                "\nRUPIAS: " + costo1 + "\nKRONOLITO: " + costo2 + "\nMATERIAL MAESTRO: " + costo3
        );
    }

    @Override
    public int getVida() {
        return vida;
    }
    @Override
    public void setVida(int vida) {
        this.vida = vida;
    }
}
