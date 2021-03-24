package s4;

public class Prime {
    int x=0;
    int y=0;
    int z=0;
    public void tangxy(){
        x++;
        y++;
    }
    public void inKetQua(){
        System.out.println(Thread.currentThread().getName()+"-----");
        System.out.println("x="+x);
        System.out.println("y="+y);
    }
    public synchronized void thaydoixy(){
        tangxy();
        inKetQua();
    }
    public synchronized void thaydoiz(){
        z++;
        System.out.println(Thread.currentThread().getName()+"-----");
        System.out.println("z="+z);
    }
}
