import javax.swing.*;
import java.awt.Font;

    public class Ost {
        public static void main (String[] arg) {
            UIManager.put("OptionPane.messageFont", new Font("Arial", Font.BOLD, 14));
            /*
            å = \u00E5
            Å = \u00C5
            ä = \u00E4
            Ä = \u00C4
            ö = \u00F6
            Ö = \u00D6

             
            

            */

            double height;
            int bounce = 0;
            String imput;

            imput = JOptionPane.showInputDialog("Hur många cm släpps stuntsbollen ifr\u00E5n?");
            height = Integer.parseInt(imput);


            while (height > 1)
            {
            height = height * 0.7;
            bounce = bounce + 1;
            }
            

            if (height < 1)
            JOptionPane.showMessageDialog(null, "Stutsbollen stutsar " + bounce + " gånger.");

        }
    }