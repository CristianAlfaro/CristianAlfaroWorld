package Guerreros;

import Edificaciones.centroMando;
import Edificaciones.edificacion;

public class SaiyajinClaseAlta implements Guerrero{
    int costo1= 175;
    int costo2= 225;
    int costo3= 20;

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
        Guerrero saiyan = new SaiyajinClaseAlta();
        System.out.println("has creado un saiyajin de clse alta");
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
        return 150;
    }

    @Override
    public void ataque(edificacion edif,int vida) {
        int at= ataque();
        edif.setVida(edif.getVida()-at);
    }

    @Override
    public int ataque() {
        return 125;
    }

    @Override
    public String nombre() {
        return "SAIYAJIN DE CLASE ALTA";
    }


}
