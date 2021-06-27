package Mathematics;

import java.util.Scanner;

public class PalindromNumber {
    public static void main(String arg[]){

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        System.out.println(checkPalindromeNumber(n));
    }

    public static boolean checkPalindromeNumber(int n ){

        int result = 0;
        int temp = n;

        while(temp !=0){

            int lastdigit = temp % 10;
            System.out.println("ld:="+lastdigit);

            result = result *10 + lastdigit;
            System.out.println("res:="+result);

            temp = temp/10;
            System.out.println("tem:="+temp);
        }

        return(result == n);
    }
}
