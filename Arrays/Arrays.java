
package Arrays;

import java.util.Scanner;

public class Arrays {

    public static int sum_element(int arr[]){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            
            sum= sum + arr[i];
        }
        return sum;

    }

    public static int max_element(int arr[]){
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

    public static int min_element(int arr[]){
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }

    public static void liner_search(int arr[], int key){

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == key){
                System.out.println("Founded : " + i);
            }
            
        }

    }

   public static int binear_search(int arr[], int key){
    int start = 0;
    int end = arr.length - 1;
    while (start <= end) {
        int mid = (start + end)/2;
        if(arr[mid] == key){
            return mid;
        }
        if(arr[mid] > key){
            end = mid -1;
        }else{
            start = mid + 1;
        }
    }
    return 1;
   }
public static void reverse(int arr[]){
    int start = 0;
    int end = arr.length -1;
    if(start < end){
        //swap
        int temp = arr[end];
        arr[end] = arr[start];
        arr[start] = temp;
        start++;
        end--;
    }

}

public static void  pairs(int arr[]){
    int total = 0;
    for(int i = 0; i<arr.length; i++){
        for(int j = i + 1; j < arr.length; j++){
            System.out.print( "(" + arr[i] + "," + arr[j] +")" );

            total++;
        }
        System.out.println();
    }
    System.out.println(total);
}

public static void subarrays(int arr[]){
  int   total = 0;
    for(int i = 0; i<arr.length; i++){
        // System.out.print("[ " + arr[i] + " ]");
        for(int j = i ; j <arr.length; j++){
            for(int k = i; k <= j; k++){
                System.out.print(arr[k] + " ");
                total++;
            }
            System.out.println();


        }
        System.out.println();
    }
    System.out.println(total);
}
public static void max_subarrays(int arr[]){
    int currsum = 0;
    int maxsum = Integer.MIN_VALUE;
      for(int i = 0; i<arr.length; i++){

          for(int j = i ; j <arr.length; j++){
                currsum = 0;
              for(int k = i; k <= j; k++){
                currsum = currsum + arr[k];
                
              }

              if(currsum > maxsum){
                maxsum = currsum;
              }
          }
      }
      System.out.println(maxsum);
  }
  

// Note Assignment find max and min subarray
public static void main(String[] args) {

// int arr[]  = {11,4,5,5,30,10,15,17};
// int arr[] = {1,2,3,4,5,10,11,15,17};
int arr[] = {1,2,3,4};
// System.out.println(sum_element(arr));    
// System.out.println(max_element(arr));
// System.out.println(min_element(arr));
// int key = 17;
// liner_search(arr, key);
// System.out.println("Founded : " + binear_search(arr, key) );
// reverse(arr);
// for (int i = 0; i < arr.length; i++) {
//     System.out.print(arr[i] + " ");
// }
// subarrays(arr);
max_subarrays(arr);

}
}