package sample;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

//import functions.Context;
import javafx.event.ActionEvent;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class setup extends Main{	
	@FXML  ColorPicker bgColor;
	@FXML  ColorPicker wallColor;
	@FXML  Button btBack;
	@FXML  Button Back;
	static Color wall;
	static Color bg;
	
	public void back(ActionEvent event){
		
		btBack.setOnAction((ActionEvent e) -> {
				Stage now = (Stage) btBack.getScene().getWindow();
				now.close();
		        wall = wallColor.getValue();
		        bg = bgColor.getValue();
				game();    	
		});
	}
	public void toStart(ActionEvent event){
		Back.setOnAction((ActionEvent e) -> {
			Stage theStage = new Stage();
			AnchorPane root;

				try {
					root = (AnchorPane)FXMLLoader.load(getClass().getResource("sxcasd.fxml"));
				
				Scene scene = new Scene(root);
				theStage.setScene(scene);
		    	theStage.setTitle( "Setup" );
		        theStage.show();
		        Stage now = (Stage) Back.getScene().getWindow();
		        now.close();} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
		});
	}
	
	
	
}