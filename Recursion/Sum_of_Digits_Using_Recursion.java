package Recursion;

public class Sum_of_Digits_Using_Recursion {
    
    static int sumOfDigits(int n){
        if(n == 0)
        return 0;

        return (n % 10 + sumOfDigits(n / 10));

    }
    public static void main(String[] args) {
        int num = 12345;
        int result = sumOfDigits(num);
         System.out.println("sum of digit is "+ result);
    }
}



   //Time complexity : O(logn) 

// Auxiliary space : O(logn) 