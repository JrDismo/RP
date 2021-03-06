/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reservationprogram;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 *
 * @author gaming
 */
public class ReservationProgram extends Application {

    private Stage primaryStage;
    //private static Stage newStage;

    @Override
    public void start(Stage stage) throws Exception {   
        primaryStage = stage;
        primaryStage.setResizable(false);
        setPrimaryStage();
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

    private void setPrimaryStage() throws IOException {
        Parent root = (Parent)FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.setTitle("RESERVATION PROGRAM");
    }

}
