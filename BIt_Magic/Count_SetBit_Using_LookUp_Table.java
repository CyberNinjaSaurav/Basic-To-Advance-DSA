package BIt_Magic;

public class Count_SetBit_Using_LookUp_Table {

    static int [] table = new int [256];

    public static void initialize(){
        table[0] = 0;
        for (int i = 1; i < 256; i++)
        table[i] = table[i&(i-1)] + 1;

            
        

    }

    public static int countSetBits(int n)
    {
        return table [n & 255] + 
        table[(n >> 8) & 255] + 
        table[(n >> 16) & 255] + 
        table[n >> 24];
    }

    public static void main(String[] args) {
        initialize();
        int n = 13;
        System.out.println(countSetBits(n));
      

    }
    
}
