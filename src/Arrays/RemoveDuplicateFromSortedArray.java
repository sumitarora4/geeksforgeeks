package Arrays;

import java.util.Arrays;

public class RemoveDuplicateFromSortedArray {

    public static void main(String[] arg){

        int[] arr = {3, 5, 22, 22, 54, 67};

        int size = removeDuplicate(arr)    ;

        // print the array elements till the size we got
        for(int j=0 ; j< size ; j++){
            System.out.println(arr[j]);
        }

    }

    // this will remove duplicate element form an array and store it as first elements
    // rest of the elements would be same
    // finally this will give size of array to consider where duplicate elements are not available;
    // Input: arr[] = {10,20,20,20,50,50,50};
    // size = 7
    // output: arr[] = {10,20,50,20,20,50,50};
    // size = 3 as only first 3 elements are not duplicate


    static int removeDuplicate(int[] arr){

        int res = 1;

        for(int i=1; i<arr.length; i++){

            if(arr[i] != arr[res -1]){

                arr[res] = arr[i];

                res ++;
            }
        }
        return res;
    }
}
