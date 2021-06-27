package String;

import java.util.Scanner;

public class PalindromeCheckEfficient {

        public static void main(String[] arg) {

            Scanner s = new Scanner(System.in);
            String str = s.nextLine();

            boolean res = palindromeCheckEfficient(str);
            System.out.println(res);
        }

        public static boolean palindromeCheckEfficient(String str){

            int start = 0;
            int end = str.length() -1 ;

            while(start < end){

                if(str.charAt(start) != str.charAt(end) )
                    return false;

                start ++;
                end -- ;
            }

            return  true;
        }
    }