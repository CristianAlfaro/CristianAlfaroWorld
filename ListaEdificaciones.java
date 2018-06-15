import Edificaciones.centroMando;
import Edificaciones.edificacion;

import java.util.ArrayList;
import java.util.List;

public class ListaEdificaciones {
    private ArrayList<edificacion> edificacions;

    public ListaEdificaciones() {
        edificacions = new ArrayList<>();
    }

    public void add(edificacion edif) {

        edificacions.add(edif);
    }

    public void mostrar() {
        for (edificacion e : edificacions) {
            System.out.println(e.nombre() + " VIDA: " + e.vida());
        }
    }

    public void RecogerRecursos(centroMando cm) {
        for (edificacion e : edificacions) {
            e.funcion(cm);
        }
    }

    public String buscar(String busca) {
        for (edificacion e : edificacions) {
            if (e.nombre() == busca) {
                return e.nombre();
            }
        }
        return null;
    }

    public boolean recorrer() {
        int cuantos = 0;
        for (edificacion e : edificacions) {

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

    public edificacion buscar(int buscar) {
        edificacion edif;
        for (int buscado = 1; buscado <= buscar; buscado++) {
            if (buscado == buscar) {
                edif = edificacions.get(buscar - 1);
                return edif;
            }
        }
        return null;
    }

    public int longitud() {
        int cuantos = 0;
        for (edificacion e : edificacions) {

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

    public void podar(int cero){
        for (edificacion e : edificacions){
            if(e.getVida() <= cero){
                edificacions.remove(e);
            }

        }

    }
}


