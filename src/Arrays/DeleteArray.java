package Arrays;

public class DeleteArray {

    public static void main(String[] args){

        int[] arr = new int[]{10,20,30,40,50,60};

        int element = 60;

       int n = delete(arr, element);

        System.out.println("After deletion");

        for(int i=0; i < n; i++)
        {
            System.out.print(arr[i]+" ");
        }

    }

    static int delete(int[] arr, int element){

        int i = 0;
        int n = arr.length;

        System.out.println("n="+ n );

        for(i=0; i< n; i++){
            if(arr[i] == element) {
                break;
            }
        }
        if(i == n)
            return n;

        for(int j=i; j< n-1; j++){
            arr[j] = arr[j + 1];
        }

        return n -1 ;
    }



}
