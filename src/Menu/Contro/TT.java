package Menu.Contro;

import Menu.Main;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

import java.io.IOException;

public class TT {
    public void input() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("../input/input.fxml"));
        Main.mainStage.setScene(new Scene(root,600,400));
    }
    public void ouput() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("../ouput/ouput.fxml"));
        Main.mainStage.setScene(new Scene(root,600,400));
    }
}
