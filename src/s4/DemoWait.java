package s4;

public class DemoWait {
    public static void main(String[] args){
            Account a= new Account();
            Thread t1 =new Thread(new Runnable() {
                @Override
                public void run() {
                    a.napTien(5000);
                }
            });

            Thread t2 =new Thread(new Runnable() {
            @Override
            public void run() {
                a.rutTien(10000);

            }
            });



        t2.start();
        t1.start();
    }

}
