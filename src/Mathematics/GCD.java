package Mathematics;

import java.util.Scanner;

import  java.lang.Math;

public class GCD {

    public static void main(String arg[]){

        Scanner s = new Scanner(System.in);

        int a = s.nextInt();
        int b = s.nextInt();

        System.out.println(checkGCD(a,b));

    }

    public static int checkGCD(int a, int b){

        // if a is divisor of b then a is GCD
        int res = Math.min(a,b);

        while(res > 0){
            if(a % res ==0 && b%res ==0 ){
                break;
            }
            res --;
        }
        return res;

    }

//    TC => min(a,b)

}
