package s3;

public class DemoThreadInterface {
    public static void main(String[] args){
        DemoThread2 dt2= new DemoThread2();
        Thread t = new Thread(dt2);
        t.start();

        int x =10 ;
        Runnable r =new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println("i =" + i);
                    try {
                        Thread.sleep(1000);
                    } catch (Exception e) {
                    }
                }
            }
        };
        Thread t2 = new Thread(r);
        t2.start();
    }
}
