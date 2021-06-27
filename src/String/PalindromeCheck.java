package String;

import java.util.Scanner;

public class PalindromeCheck {

    public static void main(String[] arg) {

        Scanner s = new Scanner(System.in);
        String str = s.nextLine();

        boolean res = palindromeCheck(str);
        System.out.println(res);
    }

    public static boolean palindromeCheck(String str){

        StringBuilder strbuild = new StringBuilder(str);
        strbuild = strbuild.reverse();
        System.out.println(strbuild);

        return str.equals(strbuild.toString());
    }
}
