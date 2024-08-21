package Mathematics;

public class checkForPrime {

    /*
     * NIVE APPROCH 
     * Iterate from 2 to (n-1) and check if any number in this range divides n. 
     * If number divides n, then it is not a prime number.
     */

    static boolean isPrime(int n){
        if(n == 1) return false;

        for(int i = 2; i < n; i++)
        if(n % i == 0)
        return false;
        return true;

        //Time Complexity: O(n)
        // Auxiliary Space: O(1)
    }



    //Efficient Approch
    static boolean isPrime2(int n){
        if(n == 1)
        return false;
        for(int i = 2; i * i < n; i++){
        if(n % i == 0)
        return false;
        }
        return true;

        /*
        Time Complexity: O(sqrt(n))
        Auxiliary space: O(1)
         * 
         */
    }

    // More Efficient Approch 
    static boolean isPrime3(int n){
        if(n == 1)
        return false;

        if(n == 2 || n == 3)
        return true;

        if(n % 2 == 0 || n % 3 == 0)
        return false;

        for(int i = 5; i * i <= n; i = i + 6)
        {
            if(n % i == 0 || n % (i + 2) == 0)
            return false;
        }
        return true;

        /*
         * Time Complexity: O(sqrt(n))
         * Auxiliary space: O(1)
         * 
         */
    }
    public static void main(String[] args) {
        int n = 13;
        System.out.println(isPrime3(n));
    }
    
}
