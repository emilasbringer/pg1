import javax.swing.*;
import java.awt.Font;

    public class kod {
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

            String a;
            Boolean isrunning = true;

            JOptionPane.showMessageDialog(null, "Welcome to CountryGuesser 42069");

            while(isrunning)
            {
                a = JOptionPane.showInputDialog("Is your country located in the northern hemosphere? (y/n)");

                if (a.equals("y"))
                    a = JOptionPane.showInputDialog("Is your contry located in North America? (y/n)");

                if (a.equals("y")) {
                    JOptionPane.showMessageDialog(null, "You are thinking of the USA");
                    isrunning = false;
                    System.out.println(isrunning);
                }

                if (a.equals("n"))
                    a = JOptionPane.showInputDialog("Is your country located in Europe?");

                if (a.equals("y"))
                    a = JOptionPane.showInputDialog("Is your country located in northern Europe?");

                if (a.equals("y"))
                    a = JOptionPane.showInputDialog("Is your country long schlong");

                if (a.equals("y"))
                    JOptionPane.showMessageDialog(null, "You are thinking of Norway");

                if (a.equals("n"))
                    a = JOptionPane.showInputDialog("Is your country located in the southern hemosphere? (y/n)");
            }


        }
    }