package BIt_Magic;
public class Bitwise_Operator {

    public static void main(String[] args) {
        int x = 3, y = 6;

        System.out.println(x & y);  //Example(Bitwise And)
        System.out.println(x | y);  // Example(Bitwise OR)
        System.out.println(x ^ y);  // Example(Bitwise XOR)
        int z = 5;
        System.out.println(~z);     // Example(Bitwise NOT)

        int p = 3;
        System.out.println(p << 1);  // Example(Bitwise left shift)

        int negative_P =  -1;
        System.out.println(negative_P << 2);  // Example (Bitwise left shift with negative numbers)

        int q = 33;
        System.out.println(q >> 1);  // Example (Bitwise right shift)
        System.out.println(q >> 2);  // same as above shift by 2

        


    }
    
}
