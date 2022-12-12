package application;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Hello extends Application{
	    
	    public void start(Stage primaryStage) {
	    	try
	    	{
	    		primaryStage.setTitle("Hello World!");
		        Button btn = new Button();
		        btn.setText("Say 'Hello World'");
		        btn.setTextFill(Color.RED);
		        btn.setOnAction(new EventHandler<ActionEvent>() {
		            @Override
		            public void handle(ActionEvent event) {
		                System.out.println("Hello World!");
		            }
		        });
		        
		        StackPane root = new StackPane();
		        root.getChildren().add(btn);
		        primaryStage.setScene(new Scene(root, 500, 500));
		        primaryStage.show();
	    	}
	    	catch(Exception ex)
	    	{
	    		ex.printStackTrace();
	    	}
	        
	    }
	    public static void main(String[] args) {
	        launch(args);
	    }
}