package Razas;

public abstract class RazaFactor implements Raza{

    private Raza raza;
    public RazaFactor(Raza raza){
        this.raza= raza;
    }

    protected Raza getRaza(){
        return raza;
    }
}
