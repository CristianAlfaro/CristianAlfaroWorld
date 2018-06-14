import Carros.*;
import Edificaciones.*;
import Guerreros.*;
import Jugadores.Jugadores;
import java.util.Scanner;

public class Constructor {

    public edificacion ed1;
    public edificacion ed2;
    public edificacion ed3;
    public edificacion ed4;
    public edificacion ed5;
    public Guerrero war1;
    public Guerrero war2;
    public Guerrero war3;
    public Carro car1;
    public Carro car2;


    public void EdifConstructor(Jugadores p, ListaEdificaciones lp, centroMando cm) {
        if (p.getRazaN() == "SAIYAJIN") {
            ed1 = new MinaArroz();
            ed2 = new MinaRamen();
            ed3 = new MinaSemillasdelErmitaño();
            ed4 = new TallerSaiyan();
            ed5 = new SalaEntrenamiento();
            System.out.println("1-" + ed1.nombre() + "\n2-" + ed2.nombre() + "\n3-" + ed3.nombre() + "\n4-" + ed4.nombre() + "\n5-" + ed5.nombre() + "\n\n");
            ed1.costo(cm);
            ed2.costo(cm);
            ed3.costo(cm);
            ed4.costo(cm);
            ed5.costo(cm);
        } else if (p.getRazaN() == "HYLIANOS") {
            ed1 = new MinaRupias();
            ed2 = new MinaKronolito();
            ed3 = new MinaMaterialMaestro();
            ed4 = new TallerSheika();
            ed5 = new CuartelGuardia();
            System.out.println("1-" + ed1.nombre() + "\n2-" + ed2.nombre() + "\n3-" + ed3.nombre() + "\n4-" + ed4.nombre() + "\n5-" + ed5.nombre() + "\n\n");
            ed1.costo(cm);
            ed2.costo(cm);
            ed3.costo(cm);
            ed4.costo(cm);
            ed5.costo(cm);
        } else if (p.getRazaN() == "ELFOS OSCUROS") {
            ed1 = new MinaElixir();
            ed2 = new MinaElixirOscuro();
            ed3 = new MinaAguaSagrada();
            ed4 = new TallerElfico();
            ed5 = new LaboratorioElfico();
            System.out.println("1-" + ed1.nombre() + "\n2-" + ed2.nombre() + "\n3-" + ed3.nombre() + "\n4-" + ed4.nombre() + "\n5-" + ed5.nombre() + "\n\n");
            ed1.costo(cm);
            ed2.costo(cm);
            ed3.costo(cm);
            ed4.costo(cm);
            ed5.costo(cm);
        }

        Scanner Hacer = new Scanner(System.in);
        int hola = 0;

        while (hola >= 0) {
            System.out.println("---");
            hola = Hacer.nextInt();
            Constructor cons = new Constructor();
            switch (hola) {
                case 1:
                    ConstruirEdif(hola, lp, cm);
                    hola = -1;
                    break;
                case 2:
                    ConstruirEdif(hola, lp, cm);
                    hola = -1;
                    break;
                case 3:
                    ConstruirEdif(hola, lp, cm);
                    hola = -1;
                    break;
                case 4:
                    ConstruirEdif(hola, lp, cm);
                    hola = -1;
                    break;
                case 5:
                    ConstruirEdif(hola, lp, cm);
                    hola = -1;
                    break;
                default:
                    System.out.println("INGRESE OPCION VALIDA");
            }

        }
    }

    public void ConstruirEdif(int opcion, ListaEdificaciones LP1, centroMando cm) {
        if (opcion == 1) {
            if (ed1.Sepuede(cm)) {
                System.out.println("SE A CREADO UNA " + ed1.nombre() + "\n");
                LP1.add(ed1);
            } else {
                System.out.println("Te faltan recursos para crearlo");
            }
        } else if (opcion == 2) {
            if (ed2.Sepuede(cm)) {
                System.out.println("SE A CREADO UNA " + ed2.nombre() + "\n");
                LP1.add(ed2);
            } else {
                System.out.println("Te faltan recursos para crearlo");
            }
        } else if (opcion == 3) {
            if (ed3.Sepuede(cm)) {
                System.out.println("SE A CREADO UNA " + ed3.nombre() + "\n");
                LP1.add(ed3);
            } else {
                System.out.println("Te faltan recursos para crearlo");
            }
        } else if (opcion == 4) {
            if (ed4.Sepuede(cm)) {
                System.out.println("SE A CREADO UNA " + ed4.nombre() + "\n");
                LP1.add(ed4);
            } else {
                System.out.println("Te faltan recursos para crearlo");
            }
        } else if (opcion == 5) {
            if (ed5.Sepuede(cm)) {
                System.out.println("SE A CREADO UNA " + ed5.nombre() + "\n");
                LP1.add(ed5);
            } else {
                System.out.println("Te faltan recursos para crearlo");
            }
        }

    }

    public void WarConstructor(Jugadores p, ListaGuerreros lg, centroMando cm, ListaEdificaciones lp) {
        if (p.getRazaN() == "SAIYAJIN") {
            war1 = new SaiyajinClaseBaja();
            war2 = new SaiyajinClaseAlta();
            war3 = new SuperSaiyajin();
            ed5 = new SalaEntrenamiento();
            if (lp.buscar(ed5.nombre()) == ed5.nombre()) {
                System.out.println("1-" + war1.nombre() + "\n2-" + war2.nombre() + "\n3-" + war3.nombre() + "\n");
                cm.Recursos(p);
                war1.costo(cm);
                war2.costo(cm);
                war3.costo(cm);
            } else {
                System.out.println("DEBES CONSTRUIR UN CUARTEL ANTES");
                return;
            }

        } else if (p.getRazaN() == "HYLIANOS") {
            war1 = new SoldadoCrepuscular();
            war2 = new SoldadoReal();
            war3 = new HeroeElegido();
            ed5 = new CuartelGuardia();
            if (lp.buscar(ed5.nombre()) == ed5.nombre()) {
                System.out.println("1-" + war1.nombre() + "\n2-" + war2.nombre() + "\n3-" + war3.nombre() + "\n");
                cm.Recursos(p);
                war1.costo(cm);
                war2.costo(cm);
                war3.costo(cm);
            } else {
                System.out.println("DEBES CONSTRUIR UN CUARTEL ANTES");
                return;
            }
        } else if (p.getRazaN() == "ELFOS OSCUROS") {
            war1 = new ElfoDeCaza();
            war2 = new ElfoNoble();
            war3 = new ReyElfo();
            ed5 = new LaboratorioElfico();
            if (lp.buscar(ed5.nombre()) == ed5.nombre()) {
                System.out.println("1-" + war1.nombre() + "\n2-" + war2.nombre() + "\n3-" + war3.nombre() + "\n");
                cm.Recursos(p);
                war1.costo(cm);
                war2.costo(cm);
                war3.costo(cm);
            } else {
                System.out.println("DEBES CONSTRUIR UN CUARTEL ANTES");
                return;
            }
        }

        Scanner Hacer = new Scanner(System.in);
        int hola = 0;

        while (hola >= 0) {
            System.out.println("---");
            hola = Hacer.nextInt();
            Constructor cons = new Constructor();
            switch (hola) {
                case 1:
                    ConstruirWar(hola, lg, cm, lp);
                    hola = -1;
                    break;
                case 2:
                    ConstruirWar(hola, lg, cm, lp);
                    hola = -1;
                    break;
                case 3:
                    ConstruirWar(hola, lg, cm, lp);
                    hola = -1;
                    break;
                default:
                    System.out.println("INGRESE OPCION VALIDA");
            }

        }
    }

    public void ConstruirWar(int opcion, ListaGuerreros LG1, centroMando cm, ListaEdificaciones LP) {
        if (opcion == 1) {
            if (LP.buscar(ed5.nombre()) == ed5.nombre()) {
                if (war1.Sepuede(cm)) {
                    System.out.println("SE A CREADO UN " + war1.nombre() + "\n");
                    LG1.add(war1);
                } else {
                    System.out.println("Te faltan recursos para crearlo");
                }
            } else {
                System.out.println("DEBES CREAR ANTES UN CUARTEL");
            }

        } else if (opcion == 2) {
            if (LP.buscar(ed5.nombre()) == ed5.nombre()) {
                if (war2.Sepuede(cm)) {
                    System.out.println("SE A CREADO UN " + war2.nombre() + "\n");
                    LG1.add(war2);
                } else {
                    System.out.println("Te faltan recursos para crearlo");
                }
            } else {
                System.out.println("DEBES CREAR ANTES UN CUARTEL");
            }

        } else if (opcion == 3) {
            if (LP.buscar(ed5.nombre()) == ed5.nombre()) {
                if (war3.Sepuede(cm)) {
                    System.out.println("SE A CREADO UN " + war3.nombre() + "\n");
                    LG1.add(war3);
                } else {
                    System.out.println("Te faltan recursos para crearlo");
                }
            } else {
                System.out.println("DEBES CREAR ANTES UN CUARTEL");
            }

        }



    }

    public void CarConstructor(Jugadores p, ListaCarros lc, centroMando cm, ListaEdificaciones lp) {
        if (p.getRazaN() == "SAIYAJIN") {
            car1 = new NubeVoladora();
            car2 = new TanqueSaiyajin();
            ed4 = new TallerSaiyan();
            if (lp.buscar(ed4.nombre()) == ed4.nombre()) {
                System.out.println("1-" + car1.nombre() + "\n2-" + car2.nombre() + "\n");
                cm.Recursos(p);
                car1.costo(cm);
                car2.costo(cm);
            } else {
                System.out.println("DEBES CONSTRUIR UN TALLER ANTES");
                return;
            }

        } else if (p.getRazaN() == "HYLIANOS") {
            car1 = new CaballoReal();
            car2 = new GuardianSheika();
            ed4 = new TallerSheika();
            if (lp.buscar(ed4.nombre()) == ed4.nombre()) {
                System.out.println("1-" + car1.nombre() + "\n2-" + car2.nombre() + "\n");
                cm.Recursos(p);
                car1.costo(cm);
                car2.costo(cm);
            } else {
                System.out.println("DEBES CONSTRUIR UN TALLER ANTES");
                return;
            }
        } else if (p.getRazaN() == "ELFOS OSCUROS") {
            car1 = new CarroOscuro();
            car2 = new TanquedeMagiaOscura();
            ed4 = new TallerElfico();
            if (lp.buscar(ed4.nombre()) == ed4.nombre()) {
                System.out.println("1-" + car1.nombre() + "\n2-" + car2.nombre() + "\n");
                cm.Recursos(p);
                car1.costo(cm);
                car2.costo(cm);
            } else {
                System.out.println("DEBES CONSTRUIR UN TALLER ANTES");
                return;
            }

            Scanner Hacer = new Scanner(System.in);
            int hola = 0;

            while (hola >= 0) {
                System.out.println("---");
                hola = Hacer.nextInt();
                Constructor cons = new Constructor();
                switch (hola) {
                    case 1:
                        ConstruirCar(hola, lc, cm, lp);
                        hola = -1;
                        break;
                    case 2:
                        ConstruirCar(hola, lc, cm, lp);
                        hola = -1;
                        break;
                    default:
                        System.out.println("INGRESE OPCION VALIDA");
                }

            }
        }
    }

    public void ConstruirCar(int opcion, ListaCarros LC1, centroMando cm, ListaEdificaciones LP) {
        if (opcion == 1) {
            if (LP.buscar(ed4.nombre()) == ed4.nombre()) {
                if (car1.Sepuede(cm)) {
                    System.out.println("SE A CREADO UN " + car1.nombre() + "\n");
                    LC1.add(car1);
                } else {
                    System.out.println("Te faltan recursos para crearlo");
                }
            } else {
                System.out.println("DEBES CREAR ANTES UN CUARTEL");
            }

        } else if (opcion == 2) {
            if (LP.buscar(ed4.nombre()) == ed4.nombre()) {
                if (car2.Sepuede(cm)) {
                    System.out.println("SE A CREADO UN " + car2.nombre() + "\n");
                    LC1.add(car2);
                } else {
                    System.out.println("Te faltan recursos para crearlo");
                }
            } else {
                System.out.println("DEBES CREAR ANTES UN CUARTEL");
            }


        }
    }
}
