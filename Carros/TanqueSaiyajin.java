package Carros;

import Edificaciones.centroMando;

public class TanqueSaiyajin implements Carro{

    int costo1= 250;
    int costo2= 300;
    int costo3= 75;

    @Override
    public Carro carro(){
        Carro carro = new TanqueSaiyajin() {
        };
        System.out.println("has creado un tanque saiyajin");
        return carro;
    }

    @Override
    public int vida() {
        return 400;
    }

    @Override
    public int ataque() {
        return 250;
    }

    @Override
    public String nombre() {
        return "TANQUE SAIYAJIN";
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
