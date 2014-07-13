import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.Reflection;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class LoginScreen extends Application{
	

	@Override
    public void start(Stage stage) throws Exception {
		
	
	    
	    BorderPane border = new BorderPane();
	    
	    
	
	
	    
	    Scene scene = new Scene(border);
	    
	    stage.setTitle("BBChat V2.0");
	    //stage.getIcons().add(new Image (""));
	    stage.setScene(scene);
	    
	    scene.getStylesheets().add("style.css");
	    
	    stage.show();
	    
    }
	
	public static void main(String[]args){
		launch(args);
	}
}
