 import java.util.*;
 /*
        2) Check whether n is present in an array of size m or not.
            Input - n,m (Input number, size of array)
            - Take input n elements for the array
            Output -> true/false
            [ Hint : - Create a dynamic array]
*/
public class Q02{
    public static void main(String[] args){

       Scanner sc = new Scanner(System.in);

       System.out.println("Enter value of 'n' and 'm': ");
       int n = sc.nextInt();
       int m = sc.nextInt();

       int[] arr = new int[m];
       System.out.println("Enter m elements: ");
       for(int i=0; i<m; i++){
           arr[i] = sc.nextInt();
       }

       boolean isPresent = false;
       for(int i=0; i<m; i++){
            if(arr[i] == n){
                isPresent = true;
                break;
            }
       }
       
       System.out.println(isPresent);

       //time complexity: o(n);
    }
}