package BigMagic;

import java.util.Scanner;


public class MaximumAND {

    public static void main(String arg[]){

        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        int arr[] = new int[n];

        for(int i =0 ; i< n; i++){
            arr[i] = s.nextInt();
        }

        findMaxAND(arr, n);
    }

    static void findMaxAND(int arr[], int n){

        int maxi = 0;

        for(int i=0; i < n ; i++){
            for(int j= i+1; j < n; j++){

                maxi = Math.max(maxi, arr[i] & arr[j]);
            }
        }

        System.out.println(maxi);
    }

}
