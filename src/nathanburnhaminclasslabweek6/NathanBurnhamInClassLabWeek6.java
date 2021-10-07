//Nathan Burnham BCS345 In Class Lab Week 6 10/6/21

package nathanburnhaminclasslabweek6;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;

public class NathanBurnhamInClassLabWeek6 extends Application
{
    
    public static void main(String args[])
    {
        
      launch(args);
      
    }
    
   @Override 
   public void start(Stage stage) 
   {
       
      //Labels created and placed      
      Label prompt1 = new Label("Number 1:");
      Label prompt2 = new Label("Number 2:");      
      Label output = new Label("Result");      
      output.setTranslateX(50);
      output.setTranslateY(200);
       
      //Creating TextFields for program       
      TextField input1 = new TextField();
      TextField input2 = new TextField();
      
      //Button created and placed      
      Button button = new Button("Add");
      button.setTranslateX(50);
      button.setTranslateY(150);
      
      button.setOnAction(event -> 
      {
          
        //converting user inputted strings into ints
        String num1 = input1.getText();
        String num2 = input2.getText();
        int number1 = Integer.parseInt(num1);
        int number2 = Integer.parseInt(num2);
        int sum = number1 + number2;
        output.setText("The result is: " + sum + ".");
 
      });
      
      //Adding label boundaries and locations
      VBox box = new VBox(5);
      box.setPadding(new Insets(25, 0, 0, 50));
      box.getChildren().addAll(prompt1, input1, prompt2, input2);      
      Group root = new Group(box, button, output);
      
      Scene scene = new Scene(root, 300, 300, Color.LIGHTGRAY);
      stage.setTitle("Addition Application");
      stage.setScene(scene);
      stage.show();

   }
 
}
