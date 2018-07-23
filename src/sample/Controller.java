package sample;

/*  @Author: Ihor Shevchenko (Shevchenkocode)
 *  @Date: 22.07.2018
 *  @Version: 1.0.0
 *  */

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Controller {
    @FXML
    private Button about;
    @FXML
    private Button ask;
    @FXML
    private Label answer;

    @FXML
    private void initialize () {
        /*Action Listener for About Button */
        about.setOnAction(event -> {
            try {
                //Create new window About
                FXMLLoader fxmlLoader = new FXMLLoader();
                fxmlLoader.setLocation(getClass().getResource("about.fxml"));
                Scene scene = new Scene(fxmlLoader.load(), 150, 150);
                Stage stage = new Stage();
                stage.setTitle("About");
                stage.setScene(scene);
                stage.show();
                stage.setResizable(false);
            } catch (IOException e) {
                Logger logger = Logger.getLogger(getClass().getName());
                logger.log(Level.SEVERE, "Failed to create new Window.", e);
            }
        });

        /*Action Listener for Ask Button */
        ask.setOnAction(event -> {
            //Clear answer text value
            answer.setText("");
            //Initialize variable for random value
            int random_number = Random();
            //Sets the answer text value
            switch (random_number){
                case 0:
                    answer.setText("It is certain.");
                    break;
                case 1:
                    answer.setText("It is decidedly so.");
                    break;
                case 2:
                    answer.setText("Without a doubt.");
                    break;
                case 3:
                    answer.setText("Yes - definitely.");
                    break;
                case 4:
                    answer.setText("You may rely on it.");
                    break;
                case 5:
                    answer.setText("As I see it, yes.");
                    break;
                case 6:
                    answer.setText("Most likely.");
                    break;
                case 7:
                    answer.setText("Outlook good.");
                    break;
                case 8:
                    answer.setText("Yes!");
                    break;
                case 9:
                    answer.setText("Signs point to yes.");
                    break;
                case 10:
                    answer.setText("Reply hazy, try again.");
                    break;
                case 11:
                    answer.setText("Ask again later.");
                    break;
                case 12:
                    answer.setText("Better not tell you now.");
                    break;
                case 13:
                    answer.setText("Cannot predict now.");
                    break;
                case 14:
                    answer.setText("Concentrate and ask again.");
                    break;
                case 15:
                    answer.setText("Don't count on it.");
                    break;
                case 16:
                    answer.setText("My reply is no.");
                    break;
                case 17:
                    answer.setText("My sources say no");
                    break;
                case 18:
                    answer.setText("Outlook not so good.");
                    break;
                case 19:
                    answer.setText("Very doubtful.");
                    break;
            }
        });
    }

    /* This method generated random value from 0 to 19
    *  @return This value for chaining.*/
    public int Random(){
        return (int)(System.currentTimeMillis() % 19);
    }
}
