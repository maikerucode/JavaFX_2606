package javafxapplicationsample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainHomePage extends Application {
    
    Stage window;

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("homepage.fxml"));
        primaryStage.setTitle("CARE App");
        primaryStage.setScene(new Scene(root, 1440, 720));
        primaryStage.show();
        
        window = primaryStage;
    }


    public static void main(String[] args) {
        launch(args);
    }
}