package sample;



import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;
public class Main {

    public static void game(){
       // Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));//
    	Stage theStage = new Stage();
        theStage.setTitle( "Pacman" );

        Group root = new Group();
        Scene theScene = new Scene( root,setup.bg );
        theStage.setScene( theScene );

        Canvas canvas = new Canvas( 1225, 600 );
        root.getChildren().add( canvas );
        GameManager gameManager = new GameManager(root);

        gameManager.drawBoard();

        theScene.addEventHandler(KeyEvent.KEY_PRESSED, event -> gameManager.movePacman(event));
        theScene.addEventHandler(KeyEvent.KEY_RELEASED, event -> gameManager.stopPacman(event));
        theScene.addEventHandler(KeyEvent.KEY_PRESSED, event -> gameManager.restartGame(event));
        theStage.show();
    }

    
  //  public static void main(String[] args) {
  //      launch(args);
  //  }
}