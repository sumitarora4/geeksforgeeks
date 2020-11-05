package BigMagic;

import java.util.Scanner;

public class CheckKthBitisSetOrNot {

    public static void main(String arg[]){

        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int k = s.nextInt();

        if( ((n >> (k-1)) & 1) == 1){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
