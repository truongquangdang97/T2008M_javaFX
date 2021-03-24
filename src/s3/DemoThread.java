package s3;

public class DemoThread extends Thread{

    public void run2(){
        for (int i=10;i<20;i++){
            System.out.println(Thread.currentThread().getName()+"run2="+i);
        }
        try{
            Thread.sleep(1000);
        }catch(Exception e){
        }
    }
    public void run(){
        for (int i=0;i<10;i++){
            System.out.println(Thread.currentThread().getName()+" i ="+i);
            try{
                Thread.sleep(1000);
            }catch (Exception e){}
        }
    }



}
