import java.io.*;
class ByteToCharReader {


   public static void main(String[] args) {
       String filePath = "example_utf8.txt";


       try {
           FileInputStream fileInputStream = new FileInputStream(filePath);
           InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, "UTF-8");
           BufferedReader bufferedReader = new BufferedReader(inputStreamReader);


           String line;
           while ((line = bufferedReader.readLine()) != null) {
               System.out.println(line);
           }


           bufferedReader.close();
           inputStreamReader.close();
           fileInputStream.close();


       } catch (UnsupportedEncodingException e) {
           System.out.println("Unsupported Encoding: " + e.getMessage());
       } catch (IOException e) {
           System.out.println("Error reading the file: " + e.getMessage());
       }
   }
}
