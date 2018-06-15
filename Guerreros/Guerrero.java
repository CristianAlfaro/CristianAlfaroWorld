package Guerreros;

import Edificaciones.centroMando;
import Edificaciones.edificacion;

public interface Guerrero {
    public Guerrero guerrero();
    public int vida();
    public void ataque(edificacion edificacion,int i);
    public  String nombre();
    public boolean Sepuede(centroMando cm);
    public void costo(centroMando cm);
    public int ataque();

}
