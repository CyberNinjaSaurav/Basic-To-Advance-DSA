package BIt_Magic;

public class Gray_to_Binary_Code {
    static int grayToBinaryCode(int n){
        int g = 0;
        while(n > 0){
            g ^= n;
            n = n >> 1;
        }
        return g;
    }

    public static void main(String[] args) {
        int n = 15;
        System.out.println(grayToBinaryCode(n));
    }
    
}
