package Trungtamjava;
public class TestThread implements Runnable {
    public int tong;
    public TestThread(){
        this.tong=1000;
    }
    public void ruttien() throws InterruptedException {
        if (tong>0){
            Thread.sleep(1000);
            tong=tong-1000;
            System.out.println(tong);
        }else {
            System.out.println("k du tien rut");
        }
    }
    @Override
    public void run() {
        try {
            ruttien();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args){
        TestThread t=new TestThread();
        Thread t1=new Thread(t);
        Thread t2 = new Thread(t);
        t1.start();t2.start();
    }
}
