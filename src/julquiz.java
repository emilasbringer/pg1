import javafx.application.Application;
import javafx.stage.Stage;
import jdk.nashorn.internal.scripts.JO;

import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class julquiz extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        int points = 0;
        String question;
        String answer;
        String userinput;
        File file = new File("quiztxt");

        try {

            Scanner sc = new Scanner(file);

            while (sc.hasNextLine()) {
                question = sc.nextLine();
                answer = sc.nextLine();
                userinput = JOptionPane.showInputDialog(question);
                if (userinput.equals(answer)) {
                    JOptionPane.showMessageDialog(null, "Correct! +1 point");
                    points++;
                }
                else {
                    JOptionPane.showMessageDialog(null, "Incorrect! No points for you.");
                }

            }
            sc.close();
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
                JOptionPane.showMessageDialog(null, "You got " + points + " points!");
        }
    }

