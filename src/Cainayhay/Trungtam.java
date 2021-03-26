package Cainayhay;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.Collections;
import java.util.Comparator;
import java.util.ResourceBundle;

public class Trungtam implements Initializable {
    public TextField namethat;
    public TextField hightthat;
    public TextField bigthat;
    public Text alert;
    public TableView<Nguoi> bangao;
    public TableColumn<Nguoi,String> tengia;
    public TableColumn<Nguoi,Integer> chieucaogia;
    public TableColumn<Nguoi,Double> cannanggia;
    public Text ok;

    ObservableList<Nguoi> bangthat= FXCollections.observableArrayList();

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        tengia.setCellValueFactory(new PropertyValueFactory<Nguoi,String>("ten"));
        chieucaogia.setCellValueFactory(new PropertyValueFactory<Nguoi,Integer>("chieucao"));
        cannanggia.setCellValueFactory(new PropertyValueFactory<Nguoi,Double>("cannang"));
    }

    public void input(){
        try {
            String a= namethat.getText();
            Integer b = Integer.valueOf(hightthat.getText());
            double c = Double.parseDouble(bigthat.getText());
            if (!a.isEmpty()){
                bangthat.add(new Nguoi(a,b,c));
                namethat.setText("");
                hightthat.setText("");
                bigthat.setText("");
                alert.setText("");
                bangao.setItems(bangthat);
            }
            alert.setText("thu lai ");
            alert.setDisable(false);
        }catch (Exception e){}
        alert.setText("thu lai ");
        alert.setDisable(false);
    }




    public void up(){
        Collections.sort(bangthat, new Comparator<Nguoi>() {
            @Override
            public int compare(Nguoi o1, Nguoi o2) {
                return o1.getChieucao()-o2.getChieucao();
            }
        });
        ok.setText("tu cao den thap");
    }



    public void down(){
        Collections.sort(bangthat, new Comparator<Nguoi>() {
            @Override
            public int compare(Nguoi o1, Nguoi o2) {
                return o2.getChieucao()-o1.getChieucao();
            }
        });
        ok.setText("tu thap den cao ");
    }


}
