import Carros.Carro;
import Carros.Carro;
import Edificaciones.centroMando;
import Guerreros.Guerrero;

import java.util.ArrayList;

public class ListaCarros {
    private ArrayList<Carro> carros;

    public ListaCarros() {
        carros = new ArrayList<>();
    }

    public void add(Carro car){

        carros.add(car);
    }

    public void mostrar() {
        int i=1;
        for (Carro e : carros) {
            System.out.println(i+"- "+e.nombre()+" VIDA: "+e.vida()+" ATAQUE: "+e.ataque());
            i += 1;
        }
    }

    public boolean recorrer() {
        int cuantos = 0;
        for (Carro e : carros) {

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

    public Carro buscar(String busca) {
        for (Carro e : carros) {
            if (e.nombre() == busca) {
                return e;
            }
        }
        return null;
    }
    }


