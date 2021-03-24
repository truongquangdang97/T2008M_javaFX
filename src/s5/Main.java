package s5;

import java.io.*;

public class Main {
    public static void main(String[] args){
        try {
            //
            FileOutputStream fos= new FileOutputStream("data");
            DataOutputStream dos= new DataOutputStream(fos);
            dos.writeBytes("anh yeu em ");
            dos.writeBytes("toi cung vay  ");


            FileInputStream fis =new FileInputStream("data1");
            DataInputStream dis = new DataInputStream(fis);


            String txt ="";
       while (txt!=null){
                System.out.println(txt);
                txt = dis.readLine();
            }
        }catch (FileNotFoundException f){
            System.out.println("FILE NOT FOUND");
        }
        catch (IOException io){
            System.out.println("FILE not Error");
        }
    }
}
