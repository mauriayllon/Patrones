package singleton.mauri;

public class Cliente {
    public static void main (String []args){
        Banco banco = new Banco();
        banco.setAmount(10000);
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                Cajeros c1 = new Cajeros("Vivienda");
                c1.getDinero(100);
            }
        });


        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                Cajeros c2 = new Cajeros("Financiamiento");
                c2.getDinero(300);
            }
        });


        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                Cajeros c3 = new Cajeros("Creditos");
                c3.getDinero(500);
            }
        });

        Thread thread4 = new Thread(new Runnable() {
            @Override
            public void run() {
                Cajeros c4 = new Cajeros("Negocios");
                c4.getDinero(100);
            }
        });
        thread.start();
        thread1.start();
        thread3.start();
        thread4.start();
    }
}

