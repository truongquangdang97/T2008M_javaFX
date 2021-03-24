package noi;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class Controller {
    public void Ten() throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("ten.fxml"));
        Main.mainStage.setScene(new Scene(root, 600, 700));
    }
    public void Tuoi() throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("tuoi.fxml"));
        Main.mainStage.setScene(new Scene(root, 600, 700));
    }

}
