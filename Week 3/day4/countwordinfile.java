import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
class WordCountInFile {


   public static void main(String[] args) {
       String filePath = "example.txt";
       String targetWord = "java";
       int count = 0;


       try {
           FileReader fileReader = new FileReader(filePath);
           BufferedReader bufferedReader = new BufferedReader(fileReader);


           String line;
           while ((line = bufferedReader.readLine()) != null) {


               String[] words = line.split("\\W+");
               for (String word : words) {
                   if (word.equals(targetWord)) {
                       count++;
                   }
               }
           }


           bufferedReader.close();
           fileReader.close();


           System.out.println("The word \"" + targetWord + "\" occurred " +       count + " times.");


       } catch (IOException e) {
           System.out.println("An error occurred while reading the file:");
           e.printStackTrace();
       }
   }
}
