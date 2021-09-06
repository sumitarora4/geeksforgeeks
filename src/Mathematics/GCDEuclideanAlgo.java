package Mathematics;

import java.util.Scanner;

public class GCDEuclideanAlgo {


    public static void main(String arg[]){

        Scanner s = new Scanner(System.in);

        int a = s.nextInt();
        int b = s.nextInt();

        System.out.println(checkGCD(a,b));

    }

    public static int checkGCD(int a, int b) {

        while(a != b){
            if(a > b) a = a-b;
            else b = b-a;
        }
        return a;
    }
}
