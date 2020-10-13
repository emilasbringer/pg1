import javax.swing.*;
import java.awt.    Font;

    public class MinutKalkylator {
        public static void main (String[] arg) {
            UIManager.put("OptionPane.messageFont", new Font("Arial", Font.BOLD, 13));
            int minute;
            int cost;
            int cm;
            int l;
            String number;


            /*
            å = \u00E5
            ä = \u00E4
            ö = \u00F6
            */

            number = JOptionPane.showInputDialog("Hur m\u00E5nga minuter ringer du f\u00F6r varje m\u00E5nad?");
            minute = Integer.parseInt(number);
            
            number = JOptionPane.showInputDialog("Vad \u00E4r priset per minut?");

            cost = Integer.parseInt(number);

            cm = minute *  cost;

            JOptionPane.showMessageDialog(null, "Ditt abonemang kostar " + cm +" kr"  );

            l = cm * 960;
            JOptionPane.showMessageDialog(null, "Din livskostnad kommer bli " + l);
        }
    }