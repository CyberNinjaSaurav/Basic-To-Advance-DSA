package BIt_Magic;

public class Kth_Bit_Set {
    
  public static void isKthBitSet(int n, int k)
  {
    if((n & (1 << (k - 1))) > 0)
    System.out.println("SET");

    else 

    System.out.println("NOT SET");
  }

  public static void main(String[] args) {
    int n = 5, k = 1;

    isKthBitSet(n, k);
  }

}
