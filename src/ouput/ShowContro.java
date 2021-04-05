package ouput;

import Menu.Main;
import Menu.model.SinhVien;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class ShowContro implements Initializable{
    public void Home() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("../Contro/Contro.fxml"));
        Main.mainStage.setScene(new Scene(root,600,400));
    }
    public void Add()throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("../input/Input.fxml"));
        Main.mainStage.setScene(new Scene(root,600,400));
    }

    public TableView<SinhVien> txttb;
    public TableColumn<SinhVien,String > Name;
    public TableColumn<SinhVien,Integer > Age;
    public TableColumn<SinhVien,Integer > Mark;
    ObservableList<SinhVien> ds = FXCollections.observableArrayList();
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        Name.setCellValueFactory(new PropertyValueFactory<SinhVien,String>("Name"));
        Age.setCellValueFactory(new PropertyValueFactory<SinhVien,Integer>("Age"));
        Mark.setCellValueFactory(new PropertyValueFactory<SinhVien,Integer>("Mark"));
        try{
            //lấy dữ liệu từ quang2. để in ra .input
            FileInputStream fis=new FileInputStream("vidu");
            DataInputStream dis= new DataInputStream(fis);
            int line =0;
            String[] ar = new String[3];
            String txt = dis.readLine();//lay tung dong ////khi gap \n thi moi dung
              while (txt!=null){
                ar[line] = txt;
                line++;
                txt= dis.readLine();
                if (line>=3){
                    SinhVien sv = new SinhVien(ar[0],Integer.parseInt(ar[1]),Integer.parseInt(ar[2]));
                    ds.add(sv);
                    line=0;
                }
            }
            txttb.setItems(ds);
        }catch (Exception e){
        }
    }
}
