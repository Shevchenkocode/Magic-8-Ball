package sample;

/* @Author: Ihor Shevchenko (Shevchenkocode)
*  @Date: 22.07.2018
*  @Version: 1.0.0
*  */

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        //Include fxml file
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        //Set the title of our window
        primaryStage.setTitle("Magic 8 Ball");

        //Create our window
        Scene scene = new Scene(root, 350, 350);
        //Using our scene
        primaryStage.setScene(scene);
        //Visible our window
        primaryStage.show();
        //Off resizeble
        primaryStage.setResizable(false);
    }


    public static void main(String[] args) {
        //Call the launch() method for JavaFX Application
        launch(args);
    }
}
