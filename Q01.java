import java.util.*;

/*
    1) Create an Array of size 10 of integers. Take input from the user for these
       10 elements and print the entire array after that.
*/

public class Q01{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];

        System.out.println("Enter Array Elements:");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        //Printing the Array:
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }

        //time complexity: o(n);


    }
}