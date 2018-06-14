import Guerreros.*;
import Jugadores.Jugador1;
import Razas.Raza;

public class main {
    public static void main(String[] args){

        Menu menu = Menu.getInstance();

        menu.InitJugadores();
        menu.Mostrar();
        menu.elegirRaza();
        menu.MenuJuego();
    }
}
