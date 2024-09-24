package Recursion;

public class Josephus_Problem {
    
    static int joseProblem(int n, int k){

        if(n == 1)
            return 1;
        

        return (joseProblem(n - 1, k) + k -1) % n + 1;
    }
    public static void main(String[] args) {
        int n = 14;
        int k = 2;

        System.out.println(joseProblem(n, k));
    }
}

// Time Complexity : O(n)
// Space Complexity : O(n)
