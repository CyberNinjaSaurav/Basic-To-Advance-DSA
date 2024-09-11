package Recursion;
public class Power_Using_Recursion{

    static int RecursivePower(int n, int p){
        if(p == 0)
        return 1;

        else 
        return (n * RecursivePower(n, p - 1));
    }
    public static void main(String[] args) {
        int n = 9, p = 9;
        System.out.println(RecursivePower(n, p));
    }
}

/* 
 *Time Complexity: O(p) 
 *Space Complexity: O(p)
 *
 */