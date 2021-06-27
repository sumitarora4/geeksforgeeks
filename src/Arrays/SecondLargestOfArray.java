package Arrays;

public class SecondLargestOfArray {

    public static void main(String arg[]){

        int[] arr = {10,20,30,4,5,6};

        int largest = getLargest(arr);

        int res = -1;

        for(int j=0; j< arr.length; j++){

            if(arr[j] != arr[largest]){
                if(res == -1){
                    res = j;
                }
                else if(arr[j] > arr[res]){
                    res = j;
                }
            }
        }

        System.out.println(arr[res]);

    }

    // this will give index of largest element
    static int getLargest(int[] arr){

        int res = 0 ;
        for(int i =0; i< arr.length ; i++){
            if(arr[i] > arr[res]){
                res = i;
            }
        }
        return res;
    }
}
