package Arrays;

public class LargestArray {
    public static void main(String arg[]){

        int[] arr = new int[]{3,5,8,10,2};

        System.out.println(checkLargestinArray(arr));

    }

    public static int checkLargestinArray(int[] arr){

        int res = 0;

        for(int i=1; i < arr.length; i++){

            if(arr[i] > arr[res]) res = i;
        }
        return  arr[res];
    }
}
