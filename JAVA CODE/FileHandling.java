import java.io.*;

public class FileHandling {
    public static void main(String[] args) {
        try {
            File obj = new File("filename.txt");
            if (obj.createNewFile()) {
                System.out.println("File created: " + obj.getName());
            } else {
                System.out.println("File already exists");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}