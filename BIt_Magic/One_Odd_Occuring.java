package BIt_Magic;

public class One_Odd_Occuring {

    //Naive Approach : Count the number of occurences for all numbers through a nested loop.
     
    static int OddOccuring( int arr[], int n){
        
        for(int i  = 0; i < n; i++){
            int count = 0;

            for(int j = 0; j < n; j++)
            if(arr[i] == arr[j])
            count++;

            if(count % 2 != 0)
                return arr[i];
        }
        return 0;
    }

    public static void main(String[] args) {
        int arr[]= {4, 3, 4, 4, 4, 5, 5, 3, 3}, n = 9;
	    
		System.out.println(OddOccuring(arr, n));
    }
    
}
