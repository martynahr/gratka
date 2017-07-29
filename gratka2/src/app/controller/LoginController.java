package app.controller;

import app.model.LoginModel;

import java.io.IOException;
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
import app.model.LoginModel;

public class LoginController {
	boolean bd_ch;
	boolean p_ch;
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
    static String db_BD;
    @FXML
    private CheckBox cbPython;
    static String db_P;

    @FXML
    private CheckBox cbFrontEnd;
    static String db_FE;

    @FXML
    private CheckBox cbJava;
    static String db_J;

    @FXML
  private CheckBox cdSpring;
    static String db_S;

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
    void zaloguj(MouseEvent event) throws ClassNotFoundException, SQLException, IOException {
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
    		Stage stageTable = new Stage();
    		Parent root= (Parent)FXMLLoader.load(getClass().getResource("/app/view/QuestionView.fxml"));
			Scene sceneTable= new Scene(root);
			stageTable.setScene(sceneTable);
			stageTable.setTitle("Table page");
			stageTable.show();
			
			if(cbBazyDanych.isSelected()){
				db_BD = "BD";
			} else { 
				db_BD= null;}
			
			if(cbPython.isSelected()){
				db_P = "P";
			} else { 
				db_P= null;}
			
			if(cbFrontEnd.isSelected()){
				db_FE = "FE";
			} else { 
				db_FE= null;}
			
			if(cbJava.isSelected()){
				db_J = "J";
			} else { 
				db_J= null;}
			
			if(cdSpring.isSelected()){
				db_S = "S";
			} else { 
				db_S= null;}
		
			
			
			
			
			/*java.sql.PreparedStatement preparedStatement1=null;
	    	String sql1="select question_body from questions where category=?;";
	    	preparedStatement1=conn.prepareStatement(sql1);
	    	preparedStatement.setString(1, cbBazyDanych.getText());
	    	ResultSet rs1=preparedStatement1.executeQuery();
	    	
	    	System.out.println(rs1);
	    	//if (cbBazyDanych.is)
		
			bd_ch= cbBazyDanych.isSelected();
			System.out.println(bd_ch);
			p_ch= cbBazyDanych.isSelected();
			System.out.println(p_ch);*/
			
			
			
    	}else{
    		lblWitaj.setText("Niepoprawne logowanie sprobuj ponownie!");
        	lblWitaj.setTextFill(Color.web("#FF0000"));
    		txtImie.setText("");
    		txtNazwisko.setText("");
    	}
    }
  
    
    public void initialize(){
    	db= new DBConnector();
    }

}
