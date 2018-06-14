package Edificaciones;

import Guerreros.Guerrero;
import Jugadores.Jugadores;

public interface edificacion {
    public boolean Sepuede(centroMando cm);
    public String nombre();
    public int vida();
    public void funcion(centroMando cm);
    public Guerrero funcionWar(centroMando cm);
    public void costo(centroMando cm);
    //public void Tope(int r1,int r2, int r3);
}
