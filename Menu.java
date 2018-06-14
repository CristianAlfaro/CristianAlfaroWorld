import Carros.Carro;
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
    Jugadores p1;
    Jugadores p2;
    int turno = 0;

//INSTANCIA EL OBJETO MENU ASI SOLO EXISTE UNO EN TODO EL PROGRAMA
    public static Menu getInstance() {
        if (menu == null) {
            menu = new Menu();
        }
        return menu;
    }
//TIENE LAS OPCIONES DE ELEGIR RAZA
    public void opciones() {
        System.out.println("CristianAlfaro World's");
        System.out.println("1- " + raza1.nombre1() + "\n2- " + raza2.nombre1() + "\n3- " + raza3.nombre1() + "\n");
    }
//OPCIONES DEL MENU DE JUEGO
    public void opcionesJuego(Jugadores p3, centroMando Cm1) {

        System.out.println("--------------------" + p3.getNombre() + "----------------------");
        Cm1.Recursos(p3);
        System.out.println("\n1-Construir Edificaciones\n2-Mostrar edificaciones\n3-Entrenar Guerreros\n4-Entrenar Carros\n5-Atacar\n6-Terminar turno");

    }
//PERMITE AL JUGADOR ELEGIR UNA RAZA Y VINCULARLA CON EL
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
//MUESTRA LA DESCRIPCION DE CADA RAZA
    public void Mostrar() {
        System.out.println("\nDebes elegir una de estas 3 razas, aqui estan sus fortalezas, escoje bien ya que no podras cambiarla una vez escogida\n");
        raza1.descripcion();
        raza2.descripcion();
        raza3.descripcion();
    }
//INICIALIZA A LOS JUGADORES Y LES AGREGA EL NOMBRE
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
//FUNCION QUE ELIJE QUIEN EMPIEZA ALEATORIAMENTE
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
//ELIJE UNA POCION DEL MENU DE JUEGO
    public void EleccionJugador(Jugadores p, centroMando cm, ListaEdificaciones LP, ListaGuerreros LG, ListaCarros LC,ListaEdificaciones LP2,ListaGuerreros LG2,ListaCarros LC2, centroMando cm2, Jugadores p2) {
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
                        //MANDAMOS A CONSTRUIR UNA EDIFICACION PARA UN DETERMINADO JUGADOR CON DETERMINADA RAZA
                        cons.EdifConstructor(p,LP,cm);
                        break;
                    case 2:
                        if(LP.recorrer()){
                            System.out.println("ESTAS SON TUS CONSTRUCCIONES Y TROPAS \n");
                            System.out.println("---------------EDIFICACIONES------------------");
                            LP.mostrar();
                            System.out.println("---------------GUERREROS------------------");
                            LG.mostrar();
                            System.out.println("---------------CARROS------------------");
                            LC.mostrar();
                            break;
                        }else {
                            System.out.println("AUN NO HAS CONSTRUIDO NADA");
                            break;
                        }
                    case 3:
                        System.out.println("QUIERES ENTRENAR ALGO\n");
                        //MANDAMOS A ENTRENAR UN GUERRERO PARA UN DETERMINADO JUGADOR CON DETERMINADA RAZA
                        cons.WarConstructor(p,LG,cm,LP);
                        break;
                    case 4:
                        System.out.println("QUIERES ENTRENAR ALGO\n");
                        //MANDAMOS A CONSTRUIR UN CARRO PARA UN DETERMINADO JUGADOR CON DETERMINADA RAZA
                        cons.CarConstructor(p,LC,cm,LP);
                        break;
                    case 5:
                        if(LG.recorrer() || LC.recorrer()) {
                            atacar(cm, p, LP2, LC, LG, cm2, p2);
                        }else{
                            System.out.println("NECESITAS ENTRENAR TROPAS O CARROS ANTES DE ATACAR");
                        }
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
//FUNCION QUE HACE QUE CADA TORPA ATAQUE UN EDIFICIO
    public void atacar(centroMando cm, Jugadores p1, ListaEdificaciones lp2, ListaCarros lc, ListaGuerreros lg, centroMando cm2, Jugadores p2){
        if(lp2.recorrer()) {
            if(lc.recorrer() || lg.recorrer()) {
                System.out.println("ESTAMOS PREPARANDONOS PARA EL ATAQUE, QUE TROPA QUIERES MANDAR AL CAMPO ENEMIGO\n1- SOLDADO\n2- CARRO DE BATALLA\n" +
                        "3- OLVIDENLO AUN NO ES TIEMPO\n---------------");
                int opc, log, opcwar;
                Scanner opc1 = new Scanner(System.in);
                Scanner opc2 = new Scanner(System.in);

                do {
                    opc = opc1.nextInt();
                    if (opc == 1) {
                        if (lg.recorrer()) {
                            System.out.println("AQUI ESTAN TUS SOLDADOS, ELIGE QUIENES ATACARAN\n-----------------------------------------");
                            lg.mostrar();
                            log = lg.longitud();
                            opcwar = opc2.nextInt();
                            if (opcwar <= log) {
                                Guerrero war;
                                war = lg.buscar(opcwar);
                                System.out.println(war.nombre() + " ESTA LISTO PARA EL ATAQUE JEFE\n ....DE CAMINO");
                                System.out.println("QUE EDIFICACION ENEMIGA DECEAS ATACAR?\n");
                                lp2.mostrar();
                                log= lp2.longitud();
                                opcwar = opc2.nextInt();
                                if (opcwar <= log) {
                                    edificacion edif;
                                    edif = lp2.buscar(opcwar);
                                    System.out.println(edif.nombre() + "SERE ATACADA POR " + war.nombre());
                                }else {
                                System.out.println("LO SINETO CAPI EL ENEMIGO NO TIENE ESA CONSTRUCCION");
                            }
                                return;
                            } else {
                                System.out.println("NO TIENES A ESE GUERRERO");
                                return;
                            }
                        } else {
                            System.out.println("AUN NO TIENES SOLDADOS ENTRENADOS");
                        }

                    } else if (opc == 2) {
                        if (lc.recorrer()) {
                            System.out.println("AQUI ESTAN TUS CARROS, ELIGE QUIENES ATACARAN\n-----------------------------------------");
                            lc.mostrar();
                            log = lc.longitud();
                            opcwar = opc2.nextInt();
                            if (opcwar <= log) {
                                Carro car;
                                car = lc.buscar(opcwar);
                                System.out.println(car.nombre() + " ESTA LISTO PARA EL ATAQUE JEFE\n ....DE CAMINO");
                                System.out.println("QUE EDIFICACION ENEMIGA DECEAS ATACAR?\n");
                                lp2.mostrar();
                                log= lp2.longitud();
                                opcwar = opc2.nextInt();
                                if (opcwar <= log) {
                                    edificacion edif;
                                    edif = lp2.buscar(opcwar);
                                    System.out.println(edif.nombre() + "SERE ATACADA POR " + car.nombre());
                                }else {
                                    System.out.println("LO SINETO CAPI EL ENEMIGO NO TIENE ESA CONSTRUCCION");
                                }
                                return;
                            } else {
                                System.out.println("AUN NO TIENES CARROS ENTRENADOS");
                                return;
                            }
                        } else if (opc == 3) {
                            System.out.println("ENTENDIDO JEFE, AVISENOS EN EL MOMENTO PERFECTO");
                            return;
                        } else {
                            System.out.println("INGRESE UNA DE LAS OPCIONES VALIDAS");
                            return;
                        }
                    }
                    while (opc != 3) ;

                }while(true);
            }else{
                System.out.println("DEBES CREAR TROPAS ANTES DE ATACAR");
            }
        }else{
            System.out.println("EL ENEMIGO NO TIENE NADA CONSTRUIDO AUN");
        }

    }
//INICIA TODAS LAS FUNCIONES
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
            EleccionJugador(p1, Cm1, LP1, LG1, LC1, LP2, LG2, LC2, Cm2,p2);
            EleccionJugador(p2, Cm2, LP2, LG2, LC2, LP1, LG1 ,LC1, Cm1, p1);
            turno= turno += 1;
            System.out.println("Turno: "+turno);
            LP1.RecogerRecursos(Cm1);
            LP2.RecogerRecursos(Cm2);


        }


    }
}