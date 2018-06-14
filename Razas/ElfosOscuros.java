package Razas;
import Edificaciones.*;

public class ElfosOscuros implements Raza {

    @Override
    public void recursos(int recuro1, int recurso2, int recurso3){
        edificacion mineral1 = new MinaElixir();
        edificacion mineral2 = new MinaElixirOscuro();
        edificacion mineral3 = new MinaAguaSagrada();

        System.out.println(((MinaElixir) mineral1).recurso()+" "+recuro1+"  "+((MinaElixirOscuro) mineral2).recurso()+" "+recurso2
                +"  "+((MinaAguaSagrada) mineral3).recurso()+" "+recurso3);
    }

    @Override
    public void nombre() {
        System.out.println("Has elegido a los elfos oscuros, que la Oscuridad sea tu alida\n");
    }

    public String nombre1(){
        return "ELFOS OSCUROS";
    }

    @Override
    public void descripcion() {
        System.out.println("3-ELFOS OSCUROS\nEsta raza es por mucho la mas rara, nadie sabe su orige pero si sabemos de su gran tecnologia\n-Sus edificaciones se construyen en un instante\n" +
                "su <recurso 2> se consigue rapido\n-su Jefe posee una armadura con tecnologia de punta, no es nada fragil\n\n");
    }
}
