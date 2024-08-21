package Mathematics;

import java.util.Arrays;

public class Sieve_of_Eratosthenes {

    static void sieve(int n){
        if(n <= 1)
        return;

      boolean isPrime[] = new boolean[n+1];
      Arrays.fill(isPrime, true);

      for(int i = 2; i * i <= n; i++){
        if(isPrime[i])
        {
            for(int j = 2 * i; j <= n; j = j + i){
                isPrime[j] = false;
            }
        }
      }

      for (int i = 2; i <= n; i++) {
         
        if(isPrime[i])
          System.out.print(i + " ");
      }
    }

    /*
     * Time Complexity : O(n*log(log(n)))
     * Space Complexity : O(n)
     */

      public static void main(String[] args){
        int n = 18;
        sieve(n);
      }

    }
    

