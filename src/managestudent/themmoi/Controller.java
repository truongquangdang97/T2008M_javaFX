package managestudent.themmoi;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import managestudent.Main;

import java.io.*;
import java.util.ArrayList;


public class Controller  {
    public TextField inName;
    public TextField inAge;
    public TextField inMark;
    public void trangchu() throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("../home/home.fxml"));
        Main.mainStage.setScene(new Scene(root,600,400));
    }
    public void add(){
        try {
            FileInputStream fis = new FileInputStream("studen.bin");
            DataInputStream dis = new DataInputStream(fis);
            String txt = dis.readLine();
            ArrayList<String> ar =new ArrayList<>();
            while (txt !=null){
                ar.add(txt);
                txt=dis.readLine();
            }
            FileOutputStream fos = new FileOutputStream("Studen.bin");
            DataOutputStream dos = new DataOutputStream(fos);
            if (!inName.getText().isEmpty()){
                ar.add(inName.getText());
                ar.add(inAge.getText());
                ar.add(inMark.getText());
            }
            for (String a:ar){
                dos.writeBytes(a+"\n");
            }
            inName.setText("");
            inAge.setText("");
            inMark.setText("");

        }catch (IOException io){

        }
    }
}
