package Recursion;

public class Print_1_to_N_UsingRecursion {
    
    static void printNumber(int n){
        if(n > 0){
          
            printNumber(n - 1);
            System.out.print(n + " ");
        }
        return;
    

        
    }
    public static void main(String[] args) {
        int n  = 10;
        printNumber(n);
    }
}


/*
 * 
 * Time Complexity: O(n)
 *  Auxiliary Space: O(n)
 */