package Hashing;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

    public static void main(String arg[]){

        HashMap<String, Integer> hm = new HashMap<String, Integer>();
        hm.put("sumit",1);
        hm.put("kumar",12);
        hm.put("arora",13);

        System.out.println(hm);

        for(Map.Entry<String, Integer> e : hm.entrySet()){
            System.out.println(e.getKey() +" "+ e.getValue());
        }
    }
}
