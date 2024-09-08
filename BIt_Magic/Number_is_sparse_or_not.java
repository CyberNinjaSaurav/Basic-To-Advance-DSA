package BIt_Magic;
public class Number_is_sparse_or_not{
   
     static boolean isSparse(int n)
    {
        
        int pos1=0, pos2=0;
     
        while(n>0)
        {
            pos1=n%2;
            pos2=(n/2)%2;
            if((pos1 == 1) && (pos2 == 1))
                return false;
            n=n/2;
        }
        return true;
    }


    public static void main(String[] args) {

         int n = 2;
         System.out.println(isSparse(n));
        
    }
}