package String;

public class ReverseWordsInString {

    public static void main(String[] arg){

        String str = "Welcome to Code";
        char[] chArr = str.toCharArray();

        reverseWords(chArr, chArr.length);
        System.out.println(chArr);
    }

     private static void reverseWords(char[] charArr, int n){

        int start = 0 ;
        for(int i=0 ; i < n ; i++){

            if(charArr[i]==' '){
                reverse(charArr, start, i -1);
                start = i + 1;
            }
        }
        reverse(charArr, start, n-1);
        reverse(charArr, 0, n-1);
    }

     private static void reverse(char[] charArr, int low, int high){

        while (low < high){

            char temp = charArr[low];
            charArr[low] = charArr[high];
            charArr[high] = temp;

            low++;
            high--;
        }
    }
}
