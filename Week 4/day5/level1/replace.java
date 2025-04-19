package week4.day5.level1;

public class replace {
    public static void main(String[] args) {
        String input = "This    is   an   example   with   multiple   spaces.";
        String output = input.replaceAll("\\s+", " ");
        System.out.println(output);
    }
}

