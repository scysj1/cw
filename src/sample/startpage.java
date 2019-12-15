package sample;
import java.io.IOException;


import javafx.event.ActionEvent;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class startpage extends Main{
	@FXML  Button btStart;
	@FXML
	public void toStart(ActionEvent event){
		btStart.setOnAction((ActionEvent e) -> {
			Stage theStage = new Stage();
			AnchorPane root;

				try {
					root = (AnchorPane)FXMLLoader.load(getClass().getResource("color.fxml"));
				
				Scene scene = new Scene(root);
				theStage.setScene(scene);
		    	theStage.setTitle( "Setup" );
		        theStage.show();
		        Stage now = (Stage) btStart.getScene().getWindow();
		        now.close();} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
		});
	}
}