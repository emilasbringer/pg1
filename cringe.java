import javax.swing.*;
import java.awt.Font;

    public class cringe {
        public static void main (String[] arg) {
            UIManager.put("OptionPane.messageFont", new Font("Arial", Font.BOLD, 14));
            /*
            å = \u00E5
            ä = \u00E4
            ö = \u00F6
            Ö = \u00D6
            */

            String password;
            String a = "jag\u00E4rfet";
            Boolean answer = false;

            while (answer == false)
            {
                password = JOptionPane.showInputDialog("Password:");
                
                
                if (password != null)
                    if (password.equals(a))
                    answer = true;

            }
        }
    }