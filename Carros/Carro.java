package Carros;

import Edificaciones.centroMando;


public interface Carro {
    public Carro carro();
    public int vida();
    public int ataque();
    public  String nombre();
    public boolean Sepuede(centroMando cm);
    public void costo(centroMando cm);


}
