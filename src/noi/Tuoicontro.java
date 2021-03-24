package noi;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class Tuoicontro {
    public void back() throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("chinh.fxml"));
        Main.mainStage.setTitle("Danh sách sinh viên");
        Main.mainStage.setScene(new Scene(root, 600, 700));
        Main.mainStage.show();
    }

}
