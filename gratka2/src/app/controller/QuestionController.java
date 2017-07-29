package app.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import app.model.LoginModel;


import app.database.DBConnector;

public class QuestionController {

    @FXML
    private BorderPane QV;

    @FXML
    private RadioButton rba;

    @FXML
    private RadioButton rbb;

    @FXML
    private RadioButton rbc;

    @FXML
    private RadioButton rbd;

    @FXML
    private Label lbla;

    @FXML
    private Label lblb;

    @FXML
    private Label lblc;

    @FXML
    private Label lbld;

    @FXML
    private Button btnnext;

    @FXML
    private Button btnend;

    @FXML
    private Label lblq;

    DBConnector db;
    
    @FXML
    void actionend(ActionEvent event) {

    }

    @FXML
    void actionnext(ActionEvent event) {
    	  LoginController login= new LoginController();
 	  	 System.out.println(login.db_S);
 	  	 System.out.println(login.db_J);
 	  	 System.out.println(login.db_FE);
 	  	 System.out.println(login.db_BD);
 	  	 System.out.println(login.db_P);
 	  	 
 	  	db= new DBConnector();
    	Connection conn= db.connection();
 	  	 String pytanie="select question_body from questions where category=?";
 	  	 preparedStatement=conn.prepareStatement(pytanie);
 	  	
    }
   public void initialize(){
	 
	  	 
	  	 
	  	 
	   
	/*   
	   public  isCbbazydanych(){
		   System.out.print("BD");
	   }
	 */  
    //	db= new DBConnector();
    	//Connection conn= db.connection();
    	//data= FXCollections.observableArrayList();
    	//java.sql.PreparedStatement preparedStatement=null;
    	//String sql="select question_body from questions where category=? or category=? or category=? or category=? or category=? and id_question=?";
    	//String sql="select question_body from questions where category=? or category=? or category=? or category=? or category=? and id_question=?";
    	
    	//preparedStatement=conn.prepareStatement(sql);
    	//if ()
    	//preparedStatement.setString(1, );
    	//preparedStatement.setInt(2, );
    	//ResultSet rs=preparedStatement.executeQuery();
    	    	/*for(){
    	    		
    	    	}*/
    	
		//rs.next();
		/*if(!rs.equals(null)){
    		System.out.println("poprawne");
    		Stage stageTable = new Stage();
    		Parent root= (Parent)FXMLLoader.load(getClass().getResource("/app/view/QuestionView.fxml"));
			Scene sceneTable= new Scene(root);
			stageTable.setScene(sceneTable);
			stageTable.setTitle("Table page");
			stageTable.show();
			
    	
    	}else{
    		lblWitaj.setText("Niepoprawne logowanie sprobuj ponownie!");
        	lblWitaj.setTextFill(Color.web("#FF0000"));
    		txtImie.setText("");
    		txtNazwisko.setText("");
    	}*/
    }
   }
    

