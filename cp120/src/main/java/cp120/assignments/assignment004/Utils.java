package cp120.assignments.assignment004;

import javax.swing.*;

/**
 * @author jcrowley
 */

public class Utils {
    public static int askInt( int min, int max )
    throws OpCanceledException
    {
        int i;
        String str;
        String prompt = String.format("Enter an integer between %d and %d", min,max);
        String message;
        while (true){
            String pane = JOptionPane.showInputDialog(null, prompt);
            if (pane != null){
                str = pane;
            }
            else {
                throw new OpCanceledException();
            }

            try {
                i = Integer.parseInt(str);
                if ((i <= max) && (i >= min)){
                    break;
                }
                else {
                    message = String.format("\"%s\" is not valid", str);
                    JOptionPane.showMessageDialog(null, message);
                }
            }
            catch (NumberFormatException err){
                message = String.format("\"%s\" is not valid", str);
                JOptionPane.showMessageDialog(null, message);
            }

        }
        return i;
    }
}
