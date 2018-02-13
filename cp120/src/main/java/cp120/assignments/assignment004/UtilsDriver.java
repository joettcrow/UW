package cp120.assignments.assignment004;

import static cp120.assignments.assignment004.Utils.askInt;

/**
 * @author jcrowley
 */

public class UtilsDriver {
    public static void main(String[] args) {
        int value;
        try {
            value = askInt(10, 20);
            System.out.println(value);
        }
        catch (OpCanceledException exc){

        }
    }
}
