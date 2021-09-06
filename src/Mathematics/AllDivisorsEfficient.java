package Mathematics;

import java.util.Scanner;

public class AllDivisorsEfficient {

    public static void main(String arg[]){

        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        checkAllDivisorsEfficient(a);
    }

    public static void checkAllDivisorsEfficient(int n){
        int i;

        // print all divisors from 1 to square root of n
        for(i=1 ; i * i < n ; i++){

            if( n % i ==0 ){
                System.out.println(i);
            }
        }

        // print all divisors from square root of n to n
        // so this will give all divisors in sorted order
        for(; i >=1 ; i-- ){
            if( n % i ==0 ){
                System.out.println(n/i);
            }
        }

    }

//    TC => Theta(SquareRoot of n)

}
