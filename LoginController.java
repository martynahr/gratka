package app.controller;

import app.model.LoginModel;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import app.database.DBConnector;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class LoginController {

    @FXML
    private Label lblWitaj;

    @FXML
    private TextField txtImie;

    @FXML
    private TextField txtNazwisko;

    @FXML
    private Label lblImie;

    @FXML
    private Label lblNazwisko;

    @FXML
    private Label lblKategoria;

    @FXML
    private CheckBox cbBazyDanych;

    @FXML
    private CheckBox cbPython;

    @FXML
    private CheckBox cbFrontEnd;

    @FXML
    private CheckBox cbJava;

    @FXML
    private CheckBox cdSpring;

    @FXML
    private CheckBox cdCross;

    @FXML
    private TextField txtLiczbaPytan;

    @FXML
    private Label lblLiczbaPytan;

    @FXML
    private Button btnZaloguj;

    
    
    DBConnector db;
    @FXML
    void zaloguj(MouseEvent event) throws ClassNotFoundException, SQLException {
    	Connection conn= db.connection();
    	//data= FXCollections.observableArrayList();
    	java.sql.PreparedStatement preparedStatement=null;
    	String sql="select first_name, last_name from students where first_name=? and last_name=?";
    	preparedStatement=conn.prepareStatement(sql);
    	preparedStatement.setString(1, txtImie.getText());
    	preparedStatement.setString(2, txtNazwisko.getText());
    	ResultSet rs=preparedStatement.executeQuery();
    	    	/*for(){
    	    		
    	    	}*/
    	
		rs.next();
		if(!rs.equals(null)){
    		System.out.println("poprawne");
    		/*Stage stageTable = new Stage();
    		Parent root= (Parent)FXMLLoader.load(getClass().getResource("/app/view/QuestionView.fxml"));
			Scene sceneTable= new Scene(root);
			stageTable.setScene(sceneTable);
			stageTable.setTitle("Table page");
			stageTable.show();*/
			
    	
    	}else{
    		lblWitaj.setText("Niepoprawne logowanie spróbuj ponownie!");
        	lblWitaj.setTextFill(Color.web("#FF0000"));
    		txtImie.setText("");
    		txtNazwisko.setText("");
    	}
    }
  
    
    public void initialize(){
    	db= new DBConnector();
    }

}
