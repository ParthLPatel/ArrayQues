import java.util.*;
/*
8) Given an array which consists of only 0, 1 and 2. Sort the array without
using any sorting algorithm.
*/
public class Q08{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array: ");
        int n = sc.nextInt();

        //Taking input
        int[] arr = new int[n];
        System.out.println("Enter Array Elements: only (0, 1, 2) allowed ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        //Logic:
        int count0=0, count1=0, count2=0;
        for(int i=0; i<n; i++){
            if(arr[i] == 0) count0++;
            if(arr[i] == 1) count1++;
            if(arr[i] == 2) count2++;
        }

        for(int j=0; j<count0; j++){
            arr[j] = 0;
        }
        for(int j=count0; j<count0+count1; j++){
            arr[j] = 1;
        }
        for(int j=count0+count1; j<n; j++){
            arr[j] = 2;
        }
        //time coomplexity: o(n)+o(n)+o(n)+o(n) = o(n)

        //Printing resultant Array:
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
}