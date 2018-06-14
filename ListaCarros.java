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

    public int longitud() {
        int cuantos = 0;
        for (Carro e : carros) {

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

    public Carro buscar(int buscar) {
        Carro car;
        for (int buscado = 1;buscado <= buscar; buscado++){
            if(buscado == buscar){
                car = carros.get(buscar-1);
                return car;
            }
        }
        return null;
    }
    }


