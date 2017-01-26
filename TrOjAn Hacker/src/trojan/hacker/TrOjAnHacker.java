/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trojan.hacker;

import java.awt.Insets;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.HBoxBuilder;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author UserPL022Pc15
 */
public class TrOjAnHacker extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        Button btn1 = new Button();
        btn1.setText("Say 'Hello World'");
        btn1.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
            }
        });
        
        Button btn2 = new Button();
        btn2.setText("Say 'It's me!");
        btn2.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("It's me!");
            }
        });
        
        HBox hBox = HBoxBuilder.create().spacing(30.0)
                .padding(new Insets(5, 5, 5, 5))
                .children(btn1, btn2)
                .build();

        hBox.setSpacing(30.0); //In your case
        
        StackPane root = new StackPane();
        root.getChildren().add(btn1);
        
        Scene scene = new Scene(hBox, 300, 250);
        
        primaryStage.setTitle("TrOjAn");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
