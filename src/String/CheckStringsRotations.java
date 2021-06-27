package String;

import java.util.Scanner;

public class CheckStringsRotations {

    public static void main(String arg[]){


        Scanner s = new Scanner(System.in);
        String s1 = s.nextLine();
        String s2 = s.nextLine();

        System.out.println(checkStringRotation(s1,s2));

    }

    public static boolean checkStringRotation(String s1, String s2){

        if(s1.length() < s2.length()) return  false;

        return ((s1+s2).indexOf(s2) >= 0);
    }
}
