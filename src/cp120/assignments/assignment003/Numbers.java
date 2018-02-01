package cp120.assignments.assignment003;

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

    /***
     * Finds lowest common multiple for two numbers
     * @param param1 First non-negative integer number
     * @param param2 Second non-negative integer number
     * @return The lowest common multiple of the provided numbers
     */
    public static int lcm( int param1, int param2 ){
        if (param2 == 0 || param1 == 0){
            return 0;
        }
        for (int i = 1; i < param2; i++) {
            if ((param1 * i) % param2 == 0){
                return param1 * i;
            }
        }
        return param1 * param2;
    }

//    public static int gcf( int param1, int param2 ){
//
//    }


}
