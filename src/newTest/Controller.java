package newTest;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    public TextField name;
    public TextField hight;
    public TextField big;
    public TableView<Nguoi> bangao;
    public TableColumn<Nguoi,String> tenao;
    public TableColumn<Nguoi,Integer> chieucaoao;
    public TableColumn<Nguoi, Integer> cannangao;




    @Override
    public void initialize(URL location, ResourceBundle resources) {
        tenao.setCellValueFactory(new PropertyValueFactory<Nguoi, String>("ten"));
        chieucaoao.setCellValueFactory(new PropertyValueFactory<Nguoi, Integer>("chieucao"));
        cannangao.setCellValueFactory(new PropertyValueFactory<Nguoi, Integer>("cannang"));
    }
    ObservableList<Nguoi>Table= FXCollections.observableArrayList();

    public void add(){
        try{
            String a= name.getText();
            Integer b = Integer.parseInt(hight.getText());
            Integer c = Integer.parseInt(big.getText());
            if (!a.isEmpty()){
                Table.add(new Nguoi(a,b,c));
                name.setText("");
                hight.setText("");
                big.setText("");
                bangao.setItems(Table);

            }

        }catch (Exception e){

        }
    }

}
