package s4;

public class Main {
    public static void main(String[] args){
        Prime p=new Prime();


        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i=0;i<20;i++){
                        p.thaydoixy();
                    try {
                        Thread.sleep(1000);
                    }catch (Exception e){}
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i=0;i<20;i++){
                    p.thaydoixy();
                    try {
                        Thread.sleep(1000);
                    }catch (Exception e){}
                }
            }
        });
        Thread t3= new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i=0;i<20;i++){
                    p.thaydoiz();
                    try {
                        Thread.sleep(50);
                    }catch (Exception e){}
                }
            }
        });

        t1.start();
        t2.start();
        t3.start();
    }

}
