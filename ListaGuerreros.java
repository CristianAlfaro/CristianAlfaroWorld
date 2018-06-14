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
        int i=1;
        for (Guerrero e : guerreros) {
            System.out.println(i+"- "+e.nombre()+" VIDA: "+e.vida()+" ATAQUE: "+e.ataque());
            i += 1;
        }
    }

    public boolean recorrer() {
        int cuantos = 0;
        for (Guerrero e : guerreros) {

            if (e != null) {
                cuantos += 1;
            }
        }
        if (cuantos == 0) {
            return false;
        } else {
            return true;
        }
    }

    public int longitud() {
        int cuantos = 0;
        for (Guerrero e : guerreros) {

            if (e != null) {
                cuantos += 1;
            }
        }
        if (cuantos == 0) {
            return 0;
        } else {
            return cuantos;
        }
    }

    public Guerrero buscar(String busca) {
        for (Guerrero e : guerreros) {
            if (e.nombre() == busca) {
                return e;
            }
        }return null;
    }

}