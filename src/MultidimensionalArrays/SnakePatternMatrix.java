package MultidimensionalArrays;

public class SnakePatternMatrix {

    public static void main(String[] arg){

    int arr[][]= {{1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}};

    printSnake(arr);

    }

    static void printSnake(int arr[][]){
        for(int i =0 ; i< arr.length ; i++){

            // check row number is even or odd
            // if even print left to right otherwise right to left
            if(i % 2 ==0){

                for(int j=0; j< arr[i].length ; j++){
                    System.out.print(arr[i][j]+ " ");
                }
            }
            else{
                for(int j= arr[i].length-1; j >=0; j-- ){
                    System.out.print(arr[i][j] + " ");
                }
            }
        }
    }
}
