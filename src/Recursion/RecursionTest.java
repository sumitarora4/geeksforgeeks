package Recursion;

public class RecursionTest {

    public static void main(String[] args){
        fun1(3);
    }

    public static void fun1(int n){
        if(n == 0)
            return;
        System.out.println("GFG");
        fun1(n -1);
    }
}
