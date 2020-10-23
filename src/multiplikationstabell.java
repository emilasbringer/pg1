import javax.swing.*;
import java.awt.Font;

public class multiplikationstabell {
    public static void main (String[] arg) {
        UIManager.put("OptionPane.messageFont", new Font("Arial", Font.BOLD, 14));
            /*
            å = \u00E5
            ä = \u00E4
            ö = \u00F6
            Ö = \u00D6
            */

        String a;
        int b;
        int c = 1;


        a = JOptionPane.showInputDialog("Vad är 10:ans multiplikationstabell för:");
        b = Integer.parseInt(a);

        while(c<11)
        {
            System.out.println(c + "*" + b + "=" + b * c);
            c++;
        }

        }
    }