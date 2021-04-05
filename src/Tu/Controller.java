package Tu;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.net.URL;
import java.util.Collections;
import java.util.Comparator;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    public TextField name;
    public TextField age;
    public TextField mark;
    public TableView<SinhVien> ds;
    public Text validate;
    public Button sort;
    public TableColumn<SinhVien, String> tenSV;
    public TableColumn<SinhVien, Integer> tuoiSV;
    public TableColumn<SinhVien, Integer> diemSV;

    public static Integer identity = 0;
    public static SinhVien editSinhVien;
    static ObservableList<SinhVien> dsSinhVien = FXCollections.observableArrayList();
    static boolean sortType = true;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        tenSV.setCellValueFactory(new PropertyValueFactory<SinhVien, String>("name"));
        tuoiSV.setCellValueFactory(new PropertyValueFactory<SinhVien, Integer>("age"));
        diemSV.setCellValueFactory(new PropertyValueFactory<SinhVien, Integer>("mark"));
    }

    public void add(){
        try {
            String n = this.name.getText();
            int a = Integer.parseInt(age.getText());
            int m = Integer.parseInt(mark.getText());
            if (!n.isEmpty()) {
                if (editSinhVien != null){
                    editSinhVien.setName(n);
                    editSinhVien.setAge(a);
                    editSinhVien.setMark(m);
                    for (SinhVien s:dsSinhVien) {
                        if (s.getId() == editSinhVien.getId()){
                            s = editSinhVien;
                            break;
                        }
                    }
                    ds.refresh();
                }else {
                    identity++;
                    SinhVien s = new SinhVien(identity ,n, a, m);
                    dsSinhVien.add(s);
                    ds.setItems(dsSinhVien);
                }
                editSinhVien = null;
                validate.setText("");
                name.setText("");
                age.setText("");
                mark.setText("");
            } else {
                validate.setText("Vui lòng nhập Name, Age và Mark");
                validate.setDisable(false);
            }
        }catch (Exception e){
            validate.setText("Vui lòng nhập Name, Age và Mark");
            validate.setDisable(false);
        }
    }

    public void sort(){
        sortType = !sortType;
        if (sortType){
            Collections.sort(dsSinhVien, new Comparator<SinhVien>() {
                @Override
                public int compare(SinhVien o1, SinhVien o2) {
                    return o2.getMark() - o1.getMark();
                }
            });
            sort.setText("Cao đến thấp");
        }else {
            Collections.sort(dsSinhVien, new Comparator<SinhVien>() {
                @Override
                public int compare(SinhVien o1, SinhVien o2) {
                    return o1.getMark() - o2.getMark();
                }
            });
            sort.setText("Thấp đến cao");
        }
        String txt = "";
        for (SinhVien d : dsSinhVien) {
            txt += d.getName() + " -- " + d.getAge() + " -- " +d.getMark() +"\n";
        }
        ds.setItems(dsSinhVien);
    }



    public void update(){
        SinhVien s = ds.getSelectionModel().getSelectedItem();
        name.setText(s.getName());
        age.setText(s.getAge().toString());
        mark.setText(s.getMark().toString());
        editSinhVien = s;
    }

    public void back() throws Exception{
        Stage primaryStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("../assignment3/home.fxml"));
        Main.mainStage.setTitle("Home");

    }
}