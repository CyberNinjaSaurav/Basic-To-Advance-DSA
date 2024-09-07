package BIt_Magic;

public class Bit_Difference {

     static int countBitsFlip(int a, int b){
        
        int diff = 0;
        
        while (( a > 0) || (b > 0)) {
               
               if((a  % 2) != (b % 2))
               diff++;
                a /= 2;
                b /= 2;
         }
         return diff;
        
    }
    public static void main(String[] args) {
       int  a  = 10, b = 20;
System.out.println(countBitsFlip(a, b));
    }
    
}

