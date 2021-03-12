import java.util.*;

/*
5) Write a program to sort the given array.
*/

public class Q05{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter Array Elements: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        //Logic: Bubble sort;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(arr[i] < arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        //time complexity: o(n^2)   

        //Printing reversed Array:
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
}