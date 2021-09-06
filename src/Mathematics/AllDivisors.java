package Mathematics;

import java.util.Scanner;

public class AllDivisors {

    public static void main(String arg[]){

        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        checkAllDivisors(a);
    }

    public static void checkAllDivisors(int n){

        for(int i=1 ; i <= n ; i++){

            if( n % i ==0 ){
                System.out.println(i);
            }
        }

    }

//    TC => Theta(n)

}
