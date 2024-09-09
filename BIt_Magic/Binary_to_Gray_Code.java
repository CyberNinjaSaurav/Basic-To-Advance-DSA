package BIt_Magic;
public class Binary_to_Gray_Code {

  static int binaryToGrayCodeConversion(int n){
    int g = (n >> 1);
    return n ^ g;
  }
  public static void main(String[] args) {
    int n = 7;
    System.out.println(binaryToGrayCodeConversion(n));
  }
    
}
