package Arrays;

import java.util.Arrays;

public class ReverseAnArray {

    public static void main(String[] arg){

       int[] arr = {5, 10, 3, 43, 53};
       System.out.println(Arrays.toString(reverse(arr)));

    }

    static int[] reverse(int[] arr){

        int low=0 , high = arr.length-1;

        while (low < high){
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;

            low++;
            high--;
        }

        return arr;
    }
}

