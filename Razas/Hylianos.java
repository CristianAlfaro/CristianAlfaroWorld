package Razas;

import Edificaciones.*;

public class Hylianos implements Raza{
    @Override
    public void recursos(int recuro1, int recurso2, int recurso3, int tope1, int top2, int top3){
        edificacion mineral1 = new MinaRupias();
        edificacion mineral2 = new MinaKronolito();
        edificacion mineral3 = new MinaMaterialMaestro();

        System.out.println(((MinaRupias) mineral1).recurso()+" "+recuro1+" / "+tope1+"   "+((MinaKronolito) mineral2).recurso()+" "+recurso2
                +" / "+top2+"   "+((MinaMaterialMaestro) mineral3).recurso()+" "+recurso3+" / "+top3);
    }

    @Override
    public void nombre() {
        System.out.println("Has elegido a los hylianos, Que la TRIFUERZA te acompañe\n");
    }

    public String nombre1(){
        return "HYLIANOS";
    }

    @Override
    public void descripcion() {
        System.out.println("2-HYLIANOS\nLa raza que tiene el tesoro de las tres diosas de hyrule, construyen como ninguna otra raza \n-Construyen mas rapido\n-su <recurso1> se llena rapido" +
                "\n-Su heroe es nivelado en todos los aspectos\n");
    }




}
