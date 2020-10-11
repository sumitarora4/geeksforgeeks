package MultidimensionalArrays;

public class TransposeMatrix {
    public static void main(String[] arg){

        int arr[][]= {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
                };

        transposeMatrix(arr);

        // for printing matrix result
        for(int i=0; i < arr.length ; i++){
            for(int j=0; j < arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }

    static void transposeMatrix(int arr[][]){

        int temp[][] = new int[arr.length][arr.length];

        // storing transposed matrix into temp matrix
        for(int i=0; i < arr.length ; i++){
            for(int j=0; j < arr[i].length; j++){
                temp[i][j] = arr[j][i];
            }
        }

        // storing temp matrix back to the origin matrix variable
        for(int i=0; i < arr.length ; i++){
            for(int j=0; j < arr[i].length; j++){

                arr[i][j] = temp[i][j];
            }
        }
    }
}
