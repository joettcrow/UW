package cp120.assignments.assignment003;

public class Numbers {
    public static boolean isPrime(int num){
        for (int i = 2; i < num/2; i++) {
            if (num % i == 0){
                return false;
            }
        }
        return true;
    }

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
}
