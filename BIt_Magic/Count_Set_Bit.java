package BIt_Magic;
public class Count_Set_Bit {

    static int countSetBit(int n){
        
        int count = 0;
        while (n != 0){
           if(n % 2 == 1)
           count++;
           n = n /2;

        }
        return count;
    }

    //  Brian & Kerningham Algorithm

   static int countSetBit2(int n){
        int count = 0;
        while (n != 0){
            n = n & (n -1);
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int i = 39;
        System.out.println(countSetBit2(i));
    }
    
}
