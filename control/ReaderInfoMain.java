package control;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.JavaFXBuilderFactory;
import javafx.stage.Stage;
import javafx.scene.*;
import javafx.fxml.FXMLLoader;

import java.net.URL;

public class ReaderInfoMain extends Application {
    public void start(Stage primaryStage) throws Exception {
        try {
            // Read file fxml and draw interface.
            URL location = getClass().getResource("../view/ReaderInfoView.fxml");
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(location);
            fxmlLoader.setBuilderFactory(new JavaFXBuilderFactory());
            Parent root = fxmlLoader.load();
            Scene scene = new Scene(root);

            primaryStage.setTitle("ReaderInformation");

            primaryStage.show();

            primaryStage.setScene(scene);


        } catch(Exception e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        launch(args);
    }
}

