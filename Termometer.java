import javax.swing.*;
import java.awt.Font;

    public class Termometer {
        public static void main (String[] arg) {
            UIManager.put("OptionPane.messageFont", new Font("Arial", Font.BOLD, 14));
            /*
            å = \u00E5
            ä = \u00E4
            ö = \u00F6
            */

            String a;
            int temp;

            a = JOptionPane.showInputDialog("Hur m\u00E5nga grader \u00E4r det i detta rum?");

            temp = Integer.parseInt(a);

            if (temp < 18)
                if (temp <12)
                    JOptionPane.showMessageDialog(null, "Du kommer dö av hypothermia");
            
            if (temp > 18) 
                JOptionPane.showMessageDialog(null, "Det är varmt");
            
            if (12 < temp)
                if (temp < 18)
                    JOptionPane.showMessageDialog(null, "Averagely hot");


            









            
        }
    }