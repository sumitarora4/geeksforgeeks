package Arrays;

public class SearchArray {

    public static void main(String args[]){

        int[] arr = {20, 10, 5, 100,30, 17, 238};
        int size = arr.length;
        int element = 238;

        System.out.println(search(arr, size, element));
    }

    static int search(int[] arr, int size, int element){

        for(int i=0; i< size; i++){

            if(arr[i] == element)
            return i;
        }

        return -1;
    }
}
