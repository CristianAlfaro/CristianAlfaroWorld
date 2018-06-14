import Edificaciones.centroMando;
import Edificaciones.edificacion;
import Guerreros.Guerrero;

import java.util.ArrayList;

public class ListaGuerreros {
    private ArrayList<Guerrero> guerreros;

    public ListaGuerreros() {
        guerreros = new ArrayList<>();
    }

    public void add(Guerrero war){

        guerreros.add(war);
    }

    public void mostrar() {
        for (Guerrero e : guerreros) {
            System.out.println(e.nombre());
        }
    }

}