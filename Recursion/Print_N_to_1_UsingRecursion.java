package Recursion;

public class Print_N_to_1_UsingRecursion {
    

    static void  printReverseOrder(int n){
        if(n <= 0){
            return;
        }
        else{
        System.out.print(n + " ");
        printReverseOrder(n - 1);
        }
    }



    public static void main(String[] args) {
        int n = 10;
        printReverseOrder(n);
    }
}


/*
 * 
 * Time Complexity: O(n)
 *  Auxiliary Space: O(n)
 */