package Hashing;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfElements {

    public static void main(String arg[]){

        int[] arr = new int[]{2,3,4,5,5,6,2};

        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
//
//        for(int i =0 ; i < arr.length; i++){
//
//            hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
//
//        }

        for(int x : arr){

            hm.put(x,hm.getOrDefault(x,0)+1);
        }

        for(Map.Entry<Integer, Integer> e: hm.entrySet()){

            System.out.println(e.getKey() +" "+ e.getValue());
        }
    }
}
