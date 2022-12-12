package application;

import java.util.Random;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class PastureGUIPane extends Application{
	static int rows;
	static int columns;
	public void buttonTextChange(Button button)
	{
		//change fences to spaces
		if(button.getText().equals("--F--"))
		button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
               button.setText("-- --");
            }
        });
		//change spaces to fences
		if(button.getText().equals("-- --"))
			button.setOnAction(new EventHandler<ActionEvent>() {
	            @Override
	            public void handle(ActionEvent event) {
	               button.setText("--F--");
	            }
	        });
	}
	public static int getRow(Coordinate coordinate)
	{
		rows=coordinate.rows;
		return rows;
	}
	public static int getColumn(Coordinate coordinate)
	{
		columns=coordinate.columns;
		return columns;
	}
	public void start(Stage primaryStage){
		try
		{
			int numberOfColumns=rows;
			int numberOfRows=columns;
			GridPane PastureGrid = new GridPane();
			PastureGrid.setHgap(10);
			PastureGrid.setVgap(10);
			Scene scene = new Scene(PastureGrid, 750, 750);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
	        primaryStage.setScene(scene);
	        primaryStage.show();
	        Button resetButton = new Button("Reset");
	        PastureGrid.add(resetButton, 0, numberOfRows+1);
	        //number generator for what edge column or row will be used
	        Random randomColumn = new Random();
			int randomColumnNumber= randomColumn.nextInt(columns);
			Random randomRow = new Random();
			int randomRowNumber= randomRow.nextInt(rows);
			
			//number generator for using putting start on the first or last row or column
			Random firstOrLastRowOrColumnRandom = new Random();
			int firstOrLastRowOrColumn= firstOrLastRowOrColumnRandom.nextInt(2);
			Random randomColumnExit = new Random();
			int randomColumnNumberExit= randomColumn.nextInt(columns);
			Random randomRowExit = new Random();
			int randomRowNumberExit= randomRowExit.nextInt(rows);
			
			
			Random firstOrLastRowOrColumnRandomExit = new Random();
			int firstOrLastRowOrColumnExit= firstOrLastRowOrColumnRandomExit.nextInt(2);
			//make edge labels
	        for (int i=0; i < numberOfColumns; i++)
			{
				for(int j=0; j<numberOfRows;j++)
				{
					if((j==0 || i==0) || j==rows || i==columns-2)
					{
						Label newLabel = new Label("----F----");
						newLabel.setPrefSize(150, 50);
						newLabel.setAlignment(Pos.CENTER);
						PastureGrid.add(newLabel, i, j);
						//to put start on either edge
						if(rows<columns && firstOrLastRowOrColumn==0)
						{
							Label openGateLabel = new Label("----S----");
							openGateLabel.setPrefSize(150, 50);
							openGateLabel.setAlignment(Pos.CENTER);
							
							PastureGrid.add(openGateLabel, 0, randomRowNumber-1);
						}
						if(rows<columns && firstOrLastRowOrColumn==1)
						{
							Label openGateLabel = new Label("----S----");
							openGateLabel.setPrefSize(150, 50);
							openGateLabel.setAlignment(Pos.CENTER);
							
							PastureGrid.add(openGateLabel, columns-1, randomRowNumber-1);
						}
						if(rows>columns && firstOrLastRowOrColumn==0)
						{
							Label openGateLabel = new Label("----S----");
							openGateLabel.setPrefSize(150, 50);
							openGateLabel.setAlignment(Pos.CENTER);
							PastureGrid.add(openGateLabel, randomColumnNumber-1, 0);
						}
						if(rows>columns && firstOrLastRowOrColumnExit==1)
						{
							Label openGateLabel = new Label("----S----");
							openGateLabel.setPrefSize(150, 50);
							openGateLabel.setAlignment(Pos.CENTER);
							PastureGrid.add(openGateLabel, randomColumnNumber-1, rows-1);
						}
						//to put exit on either edge
						if(rows<columns && firstOrLastRowOrColumnExit==0)
						{
							Label openGateLabel = new Label("----E----");
							openGateLabel.setPrefSize(150, 50);
							openGateLabel.setAlignment(Pos.CENTER);
							
							PastureGrid.add(openGateLabel, 0, randomRowNumberExit-1);
						}
						if(rows<columns && firstOrLastRowOrColumnExit==1)
						{
							Label openGateLabel = new Label("----E----");
							openGateLabel.setPrefSize(150, 50);
							openGateLabel.setAlignment(Pos.CENTER);
							
							PastureGrid.add(openGateLabel, columns-1, randomRowNumberExit-1);
						}
						if(rows>columns && firstOrLastRowOrColumnExit==0)
						{
							Label openGateLabel = new Label("----E----");
							openGateLabel.setPrefSize(150, 50);
							openGateLabel.setAlignment(Pos.CENTER);
							PastureGrid.add(openGateLabel, randomColumnNumberExit-1, 0);
						}
						if(rows>columns && firstOrLastRowOrColumnExit==1)
						{
							Label openGateLabel = new Label("----E----");
							openGateLabel.setPrefSize(150, 50);
							openGateLabel.setAlignment(Pos.CENTER);
							PastureGrid.add(openGateLabel, randomColumnNumberExit-1, rows-1);
						}
					}
					else
					{
						//make inside fences a 15% chance
						Random rand = new Random();
						int randomNum = rand.nextInt(100);
						if(randomNum<15)
						{
							Button fenceButton = new Button("--F--");
							fenceButton.setPrefSize(150, 50);
							buttonTextChange(fenceButton);
							PastureGrid.add(fenceButton, i, j);
						}
						else
						{
							Button fenceButton = new Button("-- --");
							fenceButton.setPrefSize(150, 50);
							buttonTextChange(fenceButton);
							PastureGrid.add(fenceButton, i, j);
						}
						
					}
					
				}
			}
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
		public static void main(String[] args) {
			Coordinate c = new Coordinate(8, 9);
			getRow(c);
			getColumn(c);
	        launch(args);
	        
	    }
}