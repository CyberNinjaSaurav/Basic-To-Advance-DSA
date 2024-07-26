package  Mathematics;
public class CountDigits{
  
    public static int countDigit(long n){
        int res = 0;
        while(n > 0){
            n = n / 10;
            res++;
        }
        return res;
    }

    public static void main(String[] args) {

        int num = 45623;
        System.out.println(countDigit(num));
        
    }
}