package Mathematics;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String arg[]){

        Scanner s = new Scanner(System.in);

        int a = s.nextInt();

        System.out.println(checkPrime(a));

    }

    public static boolean checkPrime(int n){

        if (n ==1) return false;

        for(int i = 2 ; i < n ; i++){

            if(n % i == 0) return false;
        }
        return true;
    }

//    TC  => Big O(n)
}
