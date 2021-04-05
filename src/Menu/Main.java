package Menu;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main  extends Application {

    public static void main(String[] args) {
        launch(args);
    }
    public static Stage mainStage;

    @Override
    public void start(Stage primaryStage) throws IOException {
        mainStage=primaryStage;
        Parent root = FXMLLoader.load(getClass().getResource("Contro/Contro.fxml"));
        primaryStage.setTitle("Danh sach quan ly");
        primaryStage.setScene(new Scene(root, 600, 250));
        primaryStage.show();
    }
}