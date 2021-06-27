package String;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramString {

    public static void main(String args[]){


        Scanner s = new Scanner(System.in);
        String s1 = s.nextLine();
        String s2 = s.nextLine();

        System.out.println(checkAnagram(s1,s2));
    }

    public static boolean checkAnagram(String s1, String s2){

        if(s1.length() != s2.length()) return false;

        char[] strCh1 = s1.toCharArray();
        Arrays.sort(strCh1);
        s1 = new String(strCh1);

        char[] strCh2 = s2.toCharArray();
        Arrays.sort(strCh2);
        s2 = new String(strCh2);

        return (s1.equals(s2));


    }
}
