package MultidimensionalArrays;

import java.util.Scanner;

public class AddingTwoMatrices {

    public static void main(String arg[]){

        Scanner s = new Scanner(System.in);

        int t = s.nextInt();
        while ( t-- > 0){

            int n1 = s.nextInt();
            int m1 = s.nextInt();

            int A[][] = new int[n1][m1];
            for(int i= 0; i < n1; i++){
                for(int j = 0 ; j < m1 ; j++){
                    A[i][j] = s.nextInt();
                }
            }

            int n2 = s.nextInt();
            int m2 = s.nextInt();

            int B[][] = new int[n2][m2];
            for(int i= 0; i < n2; i++){
                for(int j = 0 ; j < m2 ; j++){
                    B[i][j] = s.nextInt();
                }
            }

            Solution sol = new Solution();
            int result[][] = sol.sumMatrix(A, B);

            if (result.length == 0){
                System.out.println(-1);
            }
            else{

                for(int i= 0; i < result.length; i++){
                    for(int j = 0 ; j < result[i].length ; j++){
                        System.out.print(result[i][j]+" ");
                    }

                    System.out.println();
                }
            }
        }
    }
}

class Solution{
    static int[][] sumMatrix(int A[][], int B[][]){

        int n1 = A.length;
        int m1 = A[0].length;

        int n2 = B.length;
        int m2 = B[0].length;

        int sum[][] = new int[n1][m1];

        if(n1 != n2 && m1 != m2){

            int arr[][] = new int[0][0];
            return arr;
        }
        else {
            for (int i = 0; i < n1; i++) {
                for (int j = 0; j < m1; j++) {

                    sum[i][j] = A[i][j] * B[i][j];
                }

            }
        }
        return sum;
    }
}