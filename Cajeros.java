package singleton.mauri;

public class Cajeros {

    String TipoPrestamo;

    public Cajeros(String TipoPrestamo){
        this.TipoPrestamo=TipoPrestamo;
    }

    public void getDinero(int amount){ Banco.getInstance().getDinero(amount);
    }
}
