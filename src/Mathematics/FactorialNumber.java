package Mathematics;

import java.util.Scanner;

public class FactorialNumber {

    public static void main(String arg[]){

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        System.out.println(checkFactorialNumber(n));
    }

    public static int checkFactorialNumber(int n ){

// 1) First Iterative solution

//        int res =1;
//        while(n >1){
//            res = res * n;
//            System.out.println("rest:"+res);
//
//            n--;
//            System.out.println("n:"+n);
//
//        }

//    Second Iterative Solution
//        for(int i =2; i<=n ; i++){
//            res = res * i;
//        }
//        return res;

// Time Complexity of iterative solution => Theta(n)
// Auxiliary Space => Taking constant space so Big O(1)

// 2) Recursive Solution:

        if(n == 0) return 1;

        return n * checkFactorialNumber(n-1);

// Time Complexity of recursive solution => T(n) = T(n-1) + theta(n)
// Auxiliary Space => theta(n)

    }
}
