package product.Home;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import product.Main;

public class HomeController {
    public void list() throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("../ListProduct/Listproduct.fxml"));
        Main.mainStage.setScene(new Scene(root,600,450));
    }
    public void input() throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("../InputProduct/Inputproduct.fxml"));
        Main.mainStage.setScene(new Scene(root,600,400));
    }

    public void output() throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("../OutputProduct/outputproduct.fxml"));
        Main.mainStage.setScene(new Scene(root,600,439));
    }
}
