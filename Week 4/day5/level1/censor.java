package week4.day5.level1;

public class censor {
    public static void main(String[] args) {
        String sentence = "This is a damn bad example with some stupid words.";
        String[] badWords = { "damn", "stupid" };
        for (String word : badWords) {
            sentence = sentence.replaceAll("(?i)\\b" + word + "\\b", "****");
        }
        System.out.println(sentence);
    }
}
