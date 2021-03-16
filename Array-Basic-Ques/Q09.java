import java.util.*;
/*
9) Find the range of the array. Range means the difference between the
maximum and minimum element in the array.
*/

public class Q09{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array: ");
        int n = sc.nextInt();

        //Taking input
        int[] arr = new int[n];
        System.out.println("Enter Array Elements: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        //Logic:
        int min=arr[0], max=arr[0];
        for(int i=0; i<n; i++){
            if(max<arr[i]) max = arr[i];
            if(min>arr[i]) min = arr[i];
        }
        int range = Math.abs(max-min);
        System.out.println("Range: "+range);
        //time complexity: o(n).

    }
}