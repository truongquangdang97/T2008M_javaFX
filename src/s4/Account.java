package s4;

public class Account {
    int balace;

    public void napTien(int amount){
        balace+=amount;
        System.out.println("nap :"+amount+"Thanh cong");
        try {
            wait();

            //notify();
        }catch (Exception e){}
    }

    public void rutTien(int amount){
        if (balace<amount){
            System.out.println("cho ti me dang gui");
            try{
                notify();

                //wait();
            }catch (Exception e){}
        }
        balace -=amount;
        System.out.println("rut "+amount+"Thanh cong");
    }
}
