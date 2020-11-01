package MultidimensionalArrays;

public class SearchInSortedMatrix {

    static int R=4,  C = 4;


    static void searchIntheMatrix(int mat[][], int x){

        int i = 0 , j = C -1;

            while( i < R && j>=0){

                if(mat[i][j] == x){
                    System.out.println("found at "+ i + " ,"+j  );
                    return;
                }
                else if(mat[i][j] > x){
                    j--;
                }
                else{
                    i++;
                }
            }

            System.out.println("Not found");
        }

    public static void main(String arg[]){

         int x = 35;
        int arr[][]= {
                {10, 20, 30, 40},
                {15, 25, 35, 45},
                {27, 29, 36, 45},
                {32, 33, 39, 50}
        };
        searchIntheMatrix(arr, x);
    }
}
