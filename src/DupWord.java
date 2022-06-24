import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DupWord {

    public static void main(String[] args) {
        print("This Sentence has a lot of duplicate words and the This Sentence makes not sense because the words are This duplicate");
    }

    static void print(String sentence) {
        String[] words = sentence.split(" ");
        Map<String, Integer> wordCounter = new HashMap<>();

        for (String word: words
             ) {
            wordCounter.put(word, wordCounter.getOrDefault(word, 0) + 1);
        }

        System.out.println(wordCounter);
    }

    public void dupWords() {
        Scanner sc = new Scanner(System.in);
        int count=1;
        String str="This Sentence has a lot of duplicate words and the This Sentence makes not sense because the words are This duplicate";

        String sarray[]=str.split(" ");
        System.out.println("The String is:" + str);

        System.out.println("The Duplicate Words in Strings are:");
        for (int i = 0; i < sarray.length; i++) {
            for (int j =i+1; j < sarray.length; j++) {
                if (sarray[i].equals(sarray[j])){
                    count++;
                    System.out.println(sarray[j] + "->" + count);
                    break;
                }
            }
            count=1;
        }
    }
}
