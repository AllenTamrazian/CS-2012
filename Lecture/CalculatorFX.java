package application;


import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class CalculatorFX extends Application{

	@Override
	public void start(Stage primaryStage){
		try
		{
			GridPane grid = new GridPane();
	        primaryStage.setScene(new Scene(grid, 500, 500));
	        primaryStage.show();
	        Button divideButton = new Button("/");
	        divideButton.setPrefSize(150, 50);
	        Button multiplyButton= new Button("*");
	        multiplyButton.setPrefSize(150, 50);
	        Button addButton= new Button("+");
	        addButton.setPrefSize(150, 50);
	        Button subtractButton= new Button("-");
	        subtractButton.setPrefSize(150, 50);
	        Button clearButton= new Button("clear");
	        clearButton.setPrefSize(150, 50);
	        TextField number1 = new TextField("");
	        number1.setPrefSize(150, 50);
	        TextField number2 = new TextField("");
	        number2.setPrefSize(150, 50);
	        Label result = new Label("?");
//	        grid.addRow(0,divideButton, multiplyButton);
	        grid.add(divideButton, 0, 0);
	        grid.add(multiplyButton, 3, 0);
//	        grid.addRow(1,addButton, subtractButton);
	        grid.add(addButton, 0, 1);
	        grid.add(subtractButton, 3, 1);
	        grid.add(number1, 0, 2);
	        grid.add(number2, 3, 2);
	        grid.add(result, 2, 3);
	        grid.add(clearButton, 2, 4);
	        result.setFont(new Font(20));
	        grid.setAlignment(Pos.CENTER);
	        addButton.setOnAction(new EventHandler<ActionEvent>() {
	            @Override
	            public void handle(ActionEvent event) {
	            	double answer=Double.parseDouble(number1.getText())+Double.parseDouble(number2.getText());
	               result.setText(""+answer);
	            }
	        });
	        subtractButton.setOnAction(new EventHandler<ActionEvent>() {
	            @Override
	            public void handle(ActionEvent event) {
	            	double answer=Double.parseDouble(number1.getText())-Double.parseDouble(number2.getText());
		               result.setText(""+answer);
	            }
	        });
	        multiplyButton.setOnAction(new EventHandler<ActionEvent>() {
	            @Override
	            public void handle(ActionEvent event) {
	            	double answer=Double.parseDouble(number1.getText())*Double.parseDouble(number2.getText());
		               result.setText(""+answer);
	            }
	        });
	        divideButton.setOnAction(new EventHandler<ActionEvent>() {
	            @Override
	            public void handle(ActionEvent event) {
	            	double answer=Double.parseDouble(number1.getText())/Double.parseDouble(number2.getText());
		               result.setText(""+answer);
	            }
	        });
	        clearButton.setOnAction(new EventHandler<ActionEvent>() {
	            @Override
	            public void handle(ActionEvent event) {
		               result.setText("?");
		               number1.setText("");
		               number2.setText("");
	            }
	        });
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
