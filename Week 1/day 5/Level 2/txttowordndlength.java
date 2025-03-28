
import java.util.*;
import java.util.Arrays;
public class Main{
    //static int count =0;
    static int index =1;

    public static int length(String name){
        int count = 0;
        try {
            while (true) {
                name.charAt(count);
                count++;
            }
        } catch (IndexOutOfBoundsException e) {
            return count;
        }


    }
    public static String[] spaces(String name){
        int len = length(name);
        for(int i=0;i<len;i++){
            if(name.charAt(i) == ' '){
                index++;
            }
        }
        String[] words = new String[index ];
        int start =0;
        int wordIndex =0;
        for(int i=0;i<len;i++){
            if(name.charAt(i) == ' '){
                words[wordIndex++] = name.substring(start,i);
                start = i+1;
            }
        }
        words[wordIndex] = name.substring(start);
        return words;
    }
    public static String[][] wordLength(String[] words){
        String[][] arrayWordLength = new String[words.length][2];
        for(int i=0;i<words.length;i++){
            arrayWordLength[i][0] = words[i];
            arrayWordLength[i][1] = String.valueOf(length(words[i]));
        }
        return arrayWordLength;

    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        String[] definewords = name.split(" ");
        for(String i : definewords){
            System.out.println(i);
        }
        length(name);
        String[] words = spaces(name);

        String[][] wordLengths = wordLength(words);
        for (String[] pair : wordLengths) {
            System.out.println(pair[0] + " - " + pair[1]);
        }
    }
}

