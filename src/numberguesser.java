import sun.swing.StringUIClientPropertyKey;

import javax.swing.*;
import java.awt.Font;

public class numberguesser {
    public static void main (String[] arg) {
        UIManager.put("OptionPane.messageFont", new Font("Arial", Font.BOLD, 14));
            /*
            å = \u00E5
            ä = \u00E4
            ö = \u00F6
            Ö = \u00D6
            */

        double a = Math.ceil(Math.random() * 101);
        int answer = (int)a;
        String guess;
        int guessnumber;
        boolean win = false;
        int guesstimes = 0;

        while(win != true) {
            guess = JOptionPane.showInputDialog("God afton min herre, vilket nummer mellan 1-100 tror du att jag tänker på?");
            guessnumber = Integer.parseInt(guess);

                if (guessnumber == answer) {
                    win = true;
                    JOptionPane.showMessageDialog(null, "Det var rätt, grattis! Det tog dig " + guesstimes + " gissningar" );
                }

                if (guessnumber < answer) {
                    JOptionPane.showMessageDialog(null, "Du gissade för lågt");
                    guesstimes = guesstimes + 1;
                }

                if (guessnumber > answer) {
                    JOptionPane.showMessageDialog(null, "Du gissade för högt");
                    guesstimes = guesstimes + 1;
                }


                }

        }
    }