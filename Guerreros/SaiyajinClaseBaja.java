package Guerreros;

import Edificaciones.centroMando;

public class SaiyajinClaseBaja implements Guerrero{

    int costo1= 100;
    int costo2= 150;
    int costo3= 10;

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
        Guerrero saiyan = new SaiyajinClaseBaja();
        System.out.println("has creado un saiyajin de clse baja");
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
        return 75;
    }

    @Override
    public int ataque() {
        return 75;
    }

    @Override
    public String nombre() {
        return "SAIYAJIN DE CLASE BAJA";
    }

}
