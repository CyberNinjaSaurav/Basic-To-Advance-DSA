  package Recursion;
public class Rope_Cutting_Problem {
      
    static int ropeCuttingProblem(int n, int a, int b, int c){
        if(n == 0)
        return 0;

        if(n <= -1)
           return -1;

           int result = Math.max(ropeCuttingProblem(n- a, a, b, c),
                        Math.max(ropeCuttingProblem(n - b, a, b, c),
                        ropeCuttingProblem(n - c, a, b, c)));

                        if(result == -1)
			return -1;

		return result + 1;
    }

    public static void main(String[] args) {
         
        int n = 5, a = 2, b = 1, c = 5;
    	
    	System.out.println(ropeCuttingProblem(n, a, b, c));


    }
}

  //Time Complexity : O(3^n)

// Space Complexity : O(n)
