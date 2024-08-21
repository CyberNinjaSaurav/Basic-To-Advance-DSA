package Mathematics;

public class Computing_Power {

    /*
     * NAIVE APPROCH
     * 
     */

    static long computingPower1(int x, int n){
        long res = 1L;
        for(int i = 0; i < n; i++){
            res = res * x;
        }
        return res;
    }
    //Time Complexity : O(n)
    // Space Complexity : O(1)
    /*
     * Optimized Divide and Conquer Solution
     */
       
     static  int computingPower2(int x, int n){
        if(n == 0)
        return 1;
        int temp = computingPower2(x, n/2);
        temp = temp * temp;
        if(n % 2== 0)
        return temp;

        else return temp * x;
     }

     // Time Complexity :  O(log n)
     // Auxiliary Space : O(log n)
     
    public static void main(String[] args) {
        int x = 2, n = 2;
        System.out.print(computingPower2(x, n));
    }
    
}
