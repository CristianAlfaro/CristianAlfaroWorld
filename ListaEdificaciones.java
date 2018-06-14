import Edificaciones.centroMando;
import Edificaciones.edificacion;

import java.util.ArrayList;
import java.util.List;

public class ListaEdificaciones {
    private ArrayList<edificacion> edificacions;

    public ListaEdificaciones() {
        edificacions = new ArrayList<>();
    }

    public void add(edificacion edif){

        edificacions.add(edif);
    }

    public void mostrar() {
        for (edificacion e : edificacions) {
            System.out.println(e.nombre());
        }
    }

    public void RecogerRecursos (centroMando cm){
        for(edificacion e : edificacions){
            e.funcion(cm);
        }
    }

    public String buscar (String busca){
        for(edificacion e : edificacions){
            if(e.nombre() == busca){
                return  e.nombre();
            }
        }
         return null;
        }
    }


