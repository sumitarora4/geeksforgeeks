package Mathematics;

import java.util.Scanner;

public class PrimeFactors {

    public static void main(String arg[]){

        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        checkPrimeFactors(a);
    }

    public static void checkPrimeFactors(int n){

        for(int i =2 ; i< n ; i++){

            if(checkPrimeEfficient(i)){

                int x = i;
                while( n %  x ==0){

                    System.out.println(i);
                    x = x * i ;
                }
            }
        }
    }

//    TC => Big O( Square(n) log n)

    // Prime number logic =====
    public static boolean checkPrimeEfficient(int n){

        if( n == 1) return false;
        if(n == 2 || n ==3) return true;
        if(n % 2 ==0 || n % 3 == 0) return false;

        for(int i = 5 ; i * i <= n ; i = i+6){

            if(n % i == 0 || n % (i + 2) == 0 ) return false;
        }
        return true;
    }
}
