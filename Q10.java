import java.util.*;
/*
10) Move all the negative elements to one side of the array.
*/

public class Q10{
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
        Arrays.sort(arr);
        //time complexity: o(nlogn)

        //Printing resultant Array:
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
}