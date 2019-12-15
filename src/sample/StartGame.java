package sample;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.Button;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;

public class StartGame extends Application {
    @Override
    public void start(Stage theStage) throws Exception{

    	AnchorPane root = (AnchorPane)FXMLLoader.load(getClass().getResource("sxcasd.fxml"));
    	Scene scene = new Scene(root);
    	//Button btStart = stp.getButton();
    	theStage.setScene(scene);
    	theStage.setTitle( "Pacman" );
        theStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}