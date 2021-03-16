import java.util.*;

/*
4) Write a program to reverse the array.
*/
public class Q04{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter Array Elements: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        //Logic:
        int start = 0;
        int end = n-1;
        for(int i=start; i<end+1; i++){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        //time complexity: o(n);

        //Printing reversed Array:
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }

}