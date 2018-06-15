package Carros;

import Edificaciones.centroMando;
import Edificaciones.edificacion;


public interface Carro {
    public Carro carro();
    public int vida();
    public int ataque();
    public  String nombre();
    public boolean Sepuede(centroMando cm);
    public void costo(centroMando cm);
    public void ataque(edificacion edif, int vida);


}
