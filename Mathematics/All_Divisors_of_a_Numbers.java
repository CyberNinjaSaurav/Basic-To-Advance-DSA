package Mathematics;

public class All_Divisors_of_a_Numbers {


    // NAIVE APPROCH

    static void divisorNumber1(int n)
    { 

           for(int i = 1; i<= n; i++)
            if(n % i == 0)
            
                System.out.print(i+ " ");

                /*
                 * Time Complexity : O(n)
                 * Space Complexity : O(1)
                 */
    }

    // EFFICIENT APPROCH
    static void divisorNumber2(int n){

        for(int i = 1; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                // All divisor are equal print only 1

                if(n / i == i)
                System.out.println(i + " ");

                else // otherwise print both

                System.out.print(i+ " " + n/i + " ");

                /*
                 * Time Complexity : O(sqrt(n))
                 * space complexity : O(1)
                 */
               

            }

        }
    }
    // Driver Method
    public static void main(String[] args) {
        System.out.println("The divisor of the number is " );
        divisorNumber2(100);
    }
    
}
