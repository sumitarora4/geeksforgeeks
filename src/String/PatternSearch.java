package String;

import java.util.Scanner;

public class PatternSearch {

    public static void main(String args[]){

        Scanner s = new Scanner(System.in);
        String s1 = s.nextLine();
        String s2 = s.nextLine();

        checkPattern(s1,s2, s1.length(), s2.length());

    }

    public static void checkPattern(String s1, String s2, int n , int m){

        if(m > n) System.out.println("not possible");

        for(int i =0 ; i <= n-m ; i++){

            int j;
            for(j = 0 ; j < m ; j++){

                if( s1.charAt(i+j) != s2.charAt(j)){
                    break;
                }
            }

            if(j == m)
                System.out.println(i);
        }

    }
}
