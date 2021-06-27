package Arrays;

import java.util.Scanner;

public class MaxAndMinArray {

    public static void main(String arg[]){

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int[] arr = new int[n];

        for(int i=0; i < n ; i++){
            arr[i] = s.nextInt();
        }

        System.out.println(maxOfArray(arr));
        System.out.println(minOfArray(arr));

    }

    static int maxOfArray(int[] arr){

        // first solution
        /*int res = arr[0]; // take first element

        for(int j=0; j< arr.length; j++){
            res = Math.max(res, arr[j]); // update result with latest max value
        }
        return res;*/


        // second solution this will give index of largest element
        for(int i=0; i<arr.length; i++){
            boolean flag = true;

            for(int j=0; j<arr.length; j++){
                if(arr[j] > arr[i]) {
                    flag = false;
                    break;
                }
            }

            if(flag ==true) return i;
        }
        return -1;
    }

    static int minOfArray(int[] arr){

        int res = arr[0];

        for(int j=0; j< arr.length; j++){
            res = Math.min(res, arr[j]);
        }
        return res;
    }


}
