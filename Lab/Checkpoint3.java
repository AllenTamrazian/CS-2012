package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


public class Checkpoint3 extends Application{
	
	public void start(Stage primaryStage){
		try
		{
			Parent root = FXMLLoader.load(getClass().getResource("Main.fxml"));
			Scene sc = new Scene(root);
			sc.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			int numberOfRows = 8;
			int numberOfColumns=9;
			GridPane grid = new GridPane();
	        primaryStage.setScene(new Scene(grid, 500, 500));
	        primaryStage.show();
	        
			for (int i=0; i < numberOfColumns; i++)
			{
				for(int j=0; j<numberOfRows;j++)
				{
					int sum=i+j+2;
					Label newLabel = new Label("   "+sum);
					grid.add(newLabel, i, j);
				}
			}
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