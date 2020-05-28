package singleton.mauri;

public class Banco {

    private static Banco instance=null;
    private int amount;

    public void setAmount(int amount) {
        this.amount = amount;
        System.out.println("Monto a principio de mes " + amount);

    }
    private synchronized static void makeInstance(){
        if (instance==null)
            instance = new Banco();
    }

    public static Banco getInstance(){
        if (instance==null)
            makeInstance();

        return instance;
    }

    public void getDinero(int cantidad){
        if (cantidad <= amount) {
            amount=amount-cantidad;
            System.out.println("Sacando Dinero " + cantidad + " saldo :" + amount);
        }else{
            System.out.println("No existe esa cantidad: " + cantidad + " saldo :" + amount);
        }
    }
}