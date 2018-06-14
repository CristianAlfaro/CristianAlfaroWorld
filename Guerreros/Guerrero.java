package Guerreros;

import Edificaciones.centroMando;

public interface Guerrero {
    public Guerrero guerrero();
    public int vida();
    public int ataque();
    public  String nombre();
    public boolean Sepuede(centroMando cm);
    public void costo(centroMando cm);

}
