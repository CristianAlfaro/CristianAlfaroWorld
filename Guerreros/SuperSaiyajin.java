package Guerreros;

import Edificaciones.centroMando;
import Edificaciones.edificacion;

public class SuperSaiyajin implements Guerrero{

    int costo1= 450;
    int costo2= 400;
    int costo3= 180;

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
        Guerrero saiyan = new SuperSaiyajin();
        System.out.println("has creado un Super saiyajin");
        return saiyan;
    }

    @Override
    public void costo(centroMando cm) {
        System.out.println(
                "\nARROZ: " + costo1 + "\nRAMEN: " + costo2 + "\nSEMILLAS DEL ERMITAÑO: " + costo3
        );
    }

    @Override
    public int vida() {
        return 600;
    }

    @Override
    public void ataque(edificacion edif,int vida) {
        int at= ataque();
        edif.setVida(edif.getVida()-at);

    }

    @Override
    public int ataque() {
        return 600;
    }

    @Override
    public String nombre() {
        return "SUPER SAIYAJIN";
    }


}
