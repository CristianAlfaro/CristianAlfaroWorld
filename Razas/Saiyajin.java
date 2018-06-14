package Razas;

import Edificaciones.*;


public class Saiyajin implements Raza{

    @Override
    public void recursos(int recuro1, int recurso2, int recurso3){
        edificacion mineral1 = new MinaArroz();
        edificacion mineral2 = new MinaRamen();
        edificacion mineral3 = new MinaSemillasdelErmitaño();

        System.out.println(((MinaArroz) mineral1).recurso()+" "+recuro1+"  "+((MinaRamen) mineral2).recurso()+" "+recurso2
                +"  "+((MinaSemillasdelErmitaño) mineral3).recurso()+" "+recurso3);
    }

    @Override
    public void nombre() {
        System.out.println("Haz elegido a los saiyajines, saca tu ki legendario y preparate\n");
    }

    public String nombre1(){
        return "SAIYAJIN";
    }

    @Override
    public void descripcion() {
        System.out.printf("1-SAIYAJINES\nUna raza de extraterestres de lo mas poderosos que hay en el universo, un de ellos es capaz de mucho\n-sus edificaciones no son muy buenas\n-su <recurso3> se recoje rapido" +
                "\n-Su super saiyajin da miedo de tanto poder de ataque\n\n");
    }


}
