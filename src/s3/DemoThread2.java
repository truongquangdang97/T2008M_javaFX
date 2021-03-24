package s3;

public class DemoThread2 implements Runnable{

    @Override
    public void run() {
        for (int i=10;i>0;i--){
            System.out.println("chay ="+i);
            try {
                Thread.sleep(1000);
            }catch (Exception e){ }
        }
    }
}

