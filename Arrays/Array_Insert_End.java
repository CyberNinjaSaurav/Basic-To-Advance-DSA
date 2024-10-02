package Arrays;
public class Array_Insert_End{
public static void insertAtEnd(int arr[], int sizeOfArray, int element){

    if (sizeOfArray < arr.length) {
        arr[sizeOfArray] = element;
    } else {
        System.out.println("Array is full. Cannot insert element.");
    }
}

public static void main(String[] args) {
    int sizeOfArray = 5, arr[] = new int[6], element = 90;
    arr[0] = 1;
    arr[1] = 2;
    arr[2] = 3;
    arr[3] = 4;
    arr[4] = 5;
    
    insertAtEnd(arr, sizeOfArray, element);
    
  
    for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i] + " ");
    }
}
}
