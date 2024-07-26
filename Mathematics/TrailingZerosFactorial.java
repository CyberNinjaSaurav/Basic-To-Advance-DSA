package Mathematics;

public class TrailingZerosFactorial {

    static int trailingZeros(int n){

          int res = 0;
        for(int i = 5; i <= n; i= i * 5){
            res += n / i;

        }
        return res;
       
    }

    public static void main(String[] args) {
        int num = 256;
        System.out.println(trailingZeros(num));
    }  
}