import java.util.*;
/*
6) Find the Kth largest and Kth smallest number in an array.
*/

public class Q06{
    public static void main(String[] args){
    
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of k: ");
        int k = sc.nextInt();
        System.out.println("Enter size of array: ");
        int n = sc.nextInt();

        if(n>=k && k>0){

            //Taking input
            int[] arr = new int[n];
            System.out.println("Enter Array Elements: ");
            for(int i=0; i<n; i++){
                arr[i] = sc.nextInt();
            }

            //Logic:
            //method 1: sort the array and access elements according to value of k;
            Arrays.sort(arr);
            int min = arr[k-1];
            int max = arr[n-k];
            System.out.println("max:"+max+" min:"+min);
            //time complexity: o(nlogn(n))

        }else{
            System.out.println("Please enter valid value of k.");
        }
    }
}