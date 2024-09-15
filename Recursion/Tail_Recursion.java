package Recursion;
public class Tail_Recursion {
    
    static void fun2(int n, int k){
        if(n == 0)
        return;

        else 
        System.out.print(k + " ");
        fun2(n - 1, k + 1);

    }

    static void fun1(int n){
        if(n == 0)
        return ;

        else 
        System.out.print(n + " ");
        fun1(n - 1);

    }
    public static void main(String[] args) {
       fun2(5, 4);
    }

}
