package Hashing;

import java.util.HashSet;

public class IntersectionOfArrays {

    public static void main(String arg[]){

        int[] arr1 = new int[]{10,20,10,30,20};
        int[] arr2 = new int[]{20,10,10,40};

        HashSet<Integer> hs1 = new HashSet<>();

        for(int x: arr1){
            hs1.add(x);
        }

        int res= 0 ;
        for(int y: arr2){

            if(hs1.contains(y)){
                 res++; hs1.remove(y);
            }
        }

        System.out.println(res);


    }
}
