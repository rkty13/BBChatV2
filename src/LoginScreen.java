import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.Reflection;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class LoginScreen extends Application{
	
	Label label;
	Button button;
	
	@Override
    public void start(Stage stage) throws Exception {
	    
		DropShadow ds = new DropShadow();
		ds.setOffsetY(5.0);
		ds.setOffsetX(5.0);
		ds.setColor(Color.WHITE);
		
		Reflection reflection = new Reflection();
		reflection.setFraction(0.8);
		reflection.setTopOffset(-20);
		
		label = new Label("Test");
	    button = new Button("Click");
	    
	    button.setEffect(ds);
	    label.setEffect(reflection);
	    
	    label.getStyleClass().add("my_customlabel");
	    
	    button.setOnAction(new EventHandler<ActionEvent>(){
	    	@Override
	    	public void handle(ActionEvent args0){
	    		label.setText("Test 123456789");
	    	}
	    });
	    
	    VBox root = new VBox();
	    root.getChildren().addAll(label, button);
	    Scene scene = new Scene(root, 500, 500);
	    stage.setScene(scene);
	    
	    scene.getStylesheets().add("style.css");
	    
	    stage.show();
	    
    }
	
	public static void main(String[]args){
		launch(args);
	}
}
