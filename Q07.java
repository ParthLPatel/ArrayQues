import java.util.*;
/*
7) Given an number n. Find the number of occurrences of n in the array.
*/

public class Q07{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number to find its occurences: ");
        int k = sc.nextInt();
        System.out.println("Enter size of array: ");
        int n = sc.nextInt();

        //Taking input
        int[] arr = new int[n];
        System.out.println("Enter Array Elements: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        //method 1: run for loop, make cmps with elements and increase count of k;
        int kcount = 0;
        for(int i=0; i<n; i++){
            if(arr[i] == k) kcount++;
        }
        System.out.println(k+" has "+kcount+" occurences.");
        //time complexity: o(n).

    }
}