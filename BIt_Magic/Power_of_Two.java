package BIt_Magic;

public class Power_of_Two {

    static boolean  powerOfTwo(int n){
        if(n == 0)
        return false;

        while(n != 1){
            if(n % 2 != 0)
            return false;
            n = n / 2;
        }
        return true;     // Time Complexity : O(log n)
    }

    static boolean efficientPowerOfTwo(int n){
        if(n == 0)
        return false;

        return ((n & (n -1)) == 0);
    }

    public static void main(String[] args) {
        int n = 4;
        System.out.println(efficientPowerOfTwo(n));
    }
    
}
