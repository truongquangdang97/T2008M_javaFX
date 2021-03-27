package Menu.input;

import Menu.Main;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;

import java.io.*;
import java.util.ArrayList;

public class InContro {
    public TextField inName;
    public TextField inAge;
    public TextField inMark;
    public void Add(){
        try {
            FileInputStream fis = new FileInputStream("quang2");
            DataInputStream dis = new DataInputStream(fis);

            String txt = dis.readLine();
            ArrayList<String> ar =new ArrayList<>();
            while (txt !=null){
                ar.add(txt);
                txt=dis.readLine();
            }
            FileOutputStream fos = new FileOutputStream("quang2");
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


    public void Home() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("../Contro/Contro.fxml"));
        Main.mainStage.setScene(new Scene(root,600,400));
    }
    public void Danhsach() throws  IOException{
        Parent root = FXMLLoader.load(getClass().getResource("../ouput/Ouput.fxml"));
        Main.mainStage.setScene(new Scene(root,600,400));
    }



}
