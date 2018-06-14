import Edificaciones.*;
import Jugadores.*;
import Razas.*;
import Guerreros.*;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Menu {

    private static Menu menu;

    private Menu() {
    }

    Raza raza1 = new Saiyajin();
    Raza raza2 = new Hylianos();
    Raza raza3 = new ElfosOscuros();
    Jugador1 jugador1 = Jugador1.getInstance();
    Jugador2 jugador2 = Jugador2.getInstance();
    Jugadores p1 = new Jugadores() {
        @Override
        public String getNombre() {
            return null;
        }

        @Override
        public String getRazaN() {
            return null;
        }
    };
    Jugadores p2 = new Jugadores() {
        @Override
        public String getNombre() {
            return null;
        }

        @Override
        public String getRazaN() {
            return null;
        }
    };
    int turno = 0;


    public static Menu getInstance() {
        if (menu == null) {
            menu = new Menu();
        }
        return menu;
    }

    public void opciones() {
        System.out.println("CristianAlfaro World's");
        System.out.println("1- " + raza1.nombre1() + "\n2- " + raza2.nombre1() + "\n3- " + raza3.nombre1() + "\n");
    }

    public void opcionesJuego(Jugadores p3, centroMando Cm1) {

        System.out.println("--------------------" + p3.getNombre() + "----------------------");
        Cm1.Recursos(p3);
        System.out.println("\n1-Construir Edificaciones\n2-Mostrar edificaciones\n3-Entrenar Guerreros\n4-Entrenar Carros\n5-Explorar\n6-Terminar turno");

    }

    public void elegirRaza() {
        System.out.println("PARA COMENZAR DEBES ELEGIR UNA RAZA " + "--" + jugador1.getNombre() + "--");
        opciones();
        int opcion1 = 0;
        Scanner razaOp = new Scanner(System.in);
        while (opcion1 >= 0) {
            try {
                opcion1 = razaOp.nextInt();
                switch (opcion1) {
                    case 1:
                        jugador1.setRazaP1(raza1);
                        raza1.nombre();
                        break;
                    case 2:
                        jugador1.setRazaP1(raza2);
                        raza2.nombre();
                        break;
                    case 3:
                        jugador1.setRazaP1(raza3);
                        raza3.nombre();
                        break;
                    default:
                        System.out.println("Por favor ingrese una opcion valida");
                }

            } catch (InputMismatchException e) {
                System.err.println("Por favor, Ingrese un número");
                razaOp.nextInt();
            }
            break;
        }

        System.out.println("PARA COMENZAR DEBES ELEGIR UNA RAZA " + "--" + jugador2.getNombre() + "--");
        opciones();
        int opcion2 = 0;
        Scanner razaOP = new Scanner(System.in);
        while (opcion2 >= 0) {
            try {
                opcion2 = razaOP.nextInt();
                switch (opcion2) {
                    case 1:
                        jugador2.setRazaP2(raza1);
                        raza1.nombre();
                        break;
                    case 2:
                        jugador2.setRazaP2(raza2);
                        raza2.nombre();
                        break;
                    case 3:
                        jugador2.setRazaP2(raza3);
                        raza3.nombre();
                        break;
                    default:
                        System.out.println("Por favor ingrese una opcion valida");
                }

            } catch (InputMismatchException e) {
                System.err.println("Por favor, Ingrese un número");
                razaOP.nextInt();
            }
            break;

        }

    }

    public void Mostrar() {
        System.out.println("\nDebes elegir una de estas 3 razas, aqui estan sus fortalezas, escoje bien ya que no podras cambiarla una vez escogida\n");
        raza1.descripcion();
        raza2.descripcion();
        raza3.descripcion();
    }

    public void InitJugadores() {
        String nombre1, nombre2;
        Scanner leer = new Scanner(System.in);
        System.out.println("BIENVENIDOS A CRISTIANALFARO WORLD'S\nJugador 1: ");
        nombre1 = leer.nextLine();
        jugador1.setNombre(nombre1);
        System.out.println("Jugador 2: ");
        nombre2 = leer.nextLine();
        jugador2.setNombre(nombre2);
        System.out.println("Despues de esto los nombres no podran ser cambiados\nESTAS SEGURO? (s/n)");
        String seguro;
        seguro = leer.nextLine();
        if ("n".equals(seguro)) {
            System.out.println("JUGADOR 1, ESTAS SEGURO? (s/n)");
            String seguro1;
            seguro1 = leer.nextLine();
            if ("n".equals(seguro1)) {
                System.out.println("Jugador 1: ");
                nombre1 = leer.nextLine();
                jugador1.setNombre(nombre1);
            }
            System.out.println("JUGADOR 2, ESTAS SEGURO? (s/n)");
            String seguro2;
            seguro2 = leer.nextLine();
            if ("n".equals(seguro2)) {
                System.out.println("Jugador 2: ");
                nombre2 = leer.nextLine();
                jugador2.setNombre(nombre2);
            }
        }
    }

    public Jugadores QuienEmpieza() {
        Random empieza = new Random();
        int n = empieza.nextInt(2) + 1;
        if (n == 1) {
            p2 = jugador2;
            return jugador1;
        } else {
            p2 = jugador1;
            return jugador2;
        }

    }

    public void EleccionJugador(Jugadores p, centroMando cm, ListaEdificaciones LP, ListaGuerreros LG, ListaCarros LC) {
        Scanner Hacer = new Scanner(System.in);
        int hola;
        do {
            opcionesJuego(p, cm);
            System.out.println("\n\n---");
            hola = Hacer.nextInt();
            Constructor cons = new Constructor();
            try {
                switch (hola) {
                    case 1:
                        System.out.println("QUE QUISIERAS CONSTRUIR\n");
                        cm.Recursos(p);
                        cons.EdifConstructor(p,LP,cm);
                        break;
                    case 2:
                        System.out.println("ESTAS SON TUS CONSTRUCCIONES \n");
                        LP.mostrar();
                        break;
                    case 3:
                        System.out.println("QUIERES ENTRENAR ALGO\n");
                        cons.WarConstructor(p,LG,cm,LP);
                        break;
                    case 4:
                        System.out.println("QUIERES ENTRENAR ALGO\n");
                        cons.CarConstructor(p,LC,cm,LP);
                        break;
                    case 5:
                        System.out.println("QUE HACEMOS GENERAL\n");
                        LG.mostrar();
                        LC.mostrar();
                        break;
                    case 6:
                        System.out.println("FIN DEL TURNO\n\n");
                        break;
                    default:
                        System.out.println("INGRESE OPCION VALIDA\n");
                }
            } catch (InputMismatchException e) {
                System.err.println("Por favor, Ingrese un número");
                Hacer.nextInt();
            }
        } while (cm != null && hola != 6);
        if (cm == null) {
            System.out.println("FIN DEL JUEGOOOO");
        }


    }

    public void MenuJuego() {
        p1 = QuienEmpieza();
        centroMando Cm1 = new centroMando();
        centroMando Cm2 = new centroMando();
        ListaEdificaciones LP1 = new ListaEdificaciones();
        ListaEdificaciones LP2 = new ListaEdificaciones();
        ListaGuerreros LG1 = new ListaGuerreros();
        ListaGuerreros LG2 = new ListaGuerreros();
        ListaCarros LC1 = new ListaCarros();
        ListaCarros LC2 = new ListaCarros();

        while (Cm1 != null && Cm2 != null) {
            Cm1.mostrartope(Cm1,p1);
            EleccionJugador(p1, Cm1, LP1, LG1, LC1);
            Cm2.mostrartope(Cm2,p2);
            EleccionJugador(p2, Cm2, LP2, LG2, LC2);
            turno= turno += 1;
            System.out.println("Turno: "+turno);
            LP1.RecogerRecursos(Cm1);
            LP2.RecogerRecursos(Cm2);
            Cm1.mejorar(Cm1);
            Cm1.mejorar(Cm1);
            Cm2.mejorar(Cm2);

        }


    }
}