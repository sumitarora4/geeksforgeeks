package Arrays;

public class InsertArray {

    public static void main(String[] arg){

        int[] arr = new int[5];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;

        int size = 3; // size would be array in which elements are available i.e. 3
        System.out.println("size="+size);
        int element = 7;
        int capacity = 7;
        int position = 2;

        int n = insert(arr, size, element, capacity, position);

        System.out.println("After Insertion");

        for(int i=0; i < n; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }

    static int insert(int[] arr, int size, int element, int capacity, int position){

        if(capacity == size){ return size;}

        int index = position -1;

        for(int i = size -1; i >= index ; i--){

            System.out.println("i="+i);
            System.out.println("i+1="+(i+1));
            arr[i+1] = arr[i];
        }

        arr[index] = element;
        return size + 1;

    }
}
