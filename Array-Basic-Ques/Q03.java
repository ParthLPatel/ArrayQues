import java.util.*;
/*
3) Find the minimum and maximum element in an array.
*/
public class Q03{

    public static void findMaxMinElement(int[] arr, int n){
        int max,min;
        //method 1: sort array and min=arr[0] and max=arr[n-1];
        // Arrays.sort(arr);
        // max = arr[n-1];
        // min = arr[0];
        // System.out.println("max: "+max+" min: "+min);
        //time complexity: o(nlog(n));

        //method 2: 2 for loops, one for finding max, and second for finding min;
        min = arr[0];
        max = arr[0];

        for(int i=0; i<n; i++){
            if(max < arr[i]){
                max = arr[i];
            }

            if(min > arr[i]){
                min = arr[i];
            }
        }
        System.out.println("max: "+max+" min: "+min);
        //time complexity: o(n);


    }
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of Array: ");
        int n = sc.nextInt();

        if(n>0){
            int[] arr = new int[n];
            System.out.println("Enter Array Elements: ");
            for(int i=0; i<n; i++){
                arr[i] = sc.nextInt();
            }

            findMaxMinElement(arr, n);
    
        }else{
            System.out.println("Cannot find max and min element for empty array.");
        }
 
    }
}