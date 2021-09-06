package Arrays;

public class SecondLargestInArray {

    public static void main(String arg[]){

        int[] arr = new int[]{3,5,8,10,2};
        System.out.println(secondLargestIndex(arr));
    }

    public static int getLargestIndex(int[] arr){

        int res = 0 ;

        for(int i = 1 ; i < arr.length ; i++){
            if(arr[i] > arr[res]){
                res = i;
            }
        }
        return res;
    }

    public static int secondLargestIndex(int[] arr){

        int largestIndex = getLargestIndex(arr);
        int res = -1 ;

        for(int j=0 ; j < arr.length ; j++){

            if(arr[j] != arr[largestIndex]){

                if(res == -1)
                     res = j;
                else if(arr[j] > arr[res])
                     res = j;

            }
        }
        return arr[res];
    }
}

//TC => theta(n)