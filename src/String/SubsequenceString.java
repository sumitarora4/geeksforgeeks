package String;

import java.util.Scanner;

public class SubsequenceString {

    public static void  main(String arg[]){

        Scanner s = new Scanner(System.in);
        String s1 = s.nextLine();
        String s2 = s.nextLine();

        System.out.println(checkSubSequenceString(s1, s2));


    }

    public static boolean checkSubSequenceString(String s1, String s2){


        int j = 0 ;
        for(int i = 0 ; i < s1.length() && j< s2.length(); i++){
                if (s1.charAt(i) == s2.charAt(j)){
                    j++;
                }
            }
        return  j == s2.length() ;

    }
}
