package cp120.assignments.assignment003;

import java.lang.reflect.Array;

/**
 * Collection of math functions
 */
public class Numbers {
    /**
     * Calculates if the number provided is prime and returns true or false
     * @param num Non-negative integer number
     * @return  true if number is prime, false if number is not prime
     */
    public static boolean isPrime(int num){
        if (num == 0 || num == 1){
            return false;
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0){
                return false;
            }
        }
        return true;
    }

    /**
     * Finds lowest common multiple for two numbers
     * @param param1 First non-negative integer number
     * @param param2 Second non-negative integer number
     * @return The lowest common multiple integer of the provided numbers
     */
    public static int lcm( int param1, int param2 ){
        if (param1 == 0 || param2 == 0){
            return 0;
        }
        for (int i = 1; i < param2; i++) {
            if ((param1 * i) % param2 == 0){
                return param1 * i;
            }
        }
        return param1 * param2;
    }

    /**
     * Finds the greatest common factor of two numbers
     * @param param1 First non-negative integer number
     * @param param2 Second non-negative integer number
     * @return The greatest common factor integer of the provided numbers
     */
    public static int gcf( int param1, int param2 ){
        if (param1 == 0 || param2 == 0){
            return 0;
        }
        for (int i = param2; i > 1; i--){
            if ((param1 % i == 0) && (param2 % i == 0)) {
                return i;
            }
        }
        return 1;
    }

    /**
     * Sums together all the digits in a number
     * @param num Integer number with digits to sum
     * @return Integer number that is the sume of digits
     */
    public static int digitSum(int num){
        int x = 0;
        for (String i : String.valueOf(num).split("(?!^)")) {
            x = x + Integer.parseInt(i);
        }
        return x;
    }

    /**
     * Calculates the mean of an array of numbers
     * @param arr array of double values to find the mean of
     * @return The mean as a double value
     */
    public static double mean(double[] arr){
        double x = 0;
        int count = 0;
        for (double i: arr) {
            x += i;
            count +=1;
        }
        return x/count;
    }

}
