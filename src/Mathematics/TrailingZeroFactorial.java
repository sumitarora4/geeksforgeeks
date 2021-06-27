package Mathematics;

import java.util.Scanner;

public class TrailingZeroFactorial {

    public static void main(String arg[]){

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        System.out.println(checkTrailingFactorialNumber(n));
    }

    public static int checkTrailingFactorialNumber(int n){

        // 1) first solution for small numbers
//        int res =1 ;
//        for(int i =2 ; i<= n; i++){
//            res = res * i;
//        }
//
//        int count = 0;
//        while(res % 10 ==0){
//            count++;
//            res = res / 10;
//        }
//        return count;

//      TC => theta(n)

//        2) Second efficient solution for big numbers
        int res = 0;
        for(int j=5 ; j <=n; j = j * 5){
            res = res + n/j;
        }
        return res;
//        TC => theta(log n)
    }
}
