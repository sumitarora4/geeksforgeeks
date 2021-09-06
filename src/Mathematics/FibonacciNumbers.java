package Mathematics;

import java.util.Scanner;

public class FibonacciNumbers {

    public static void main(String arg[]){

        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        fibonacciSeries(a);
    }

    public static void fibonacciSeries(int n){

        int a = 0, b = 1, c ;
        System.out.println(a);

        if(n > 0) System.out.println(b);

        for(int i = 2 ; i <= n ; i++){

            c = a + b;
            System.out.println( c);
            a = b;
            b = c;

        }

    }

//    TC => Theta(1)  
//    Space complexity => Theta(1)
}
