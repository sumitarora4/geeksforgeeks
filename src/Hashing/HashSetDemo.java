package Hashing;

import java.util.HashSet;

public class HashSetDemo {

    public static void main(String arg[]){

        HashSet<String> s = new HashSet<String>();

        s.add("sumit");
        s.add("kumar");
        s.add("arora");

        System.out.println(s);

        for(String ele : s){
            System.out.println(ele);
        }


    }
}
