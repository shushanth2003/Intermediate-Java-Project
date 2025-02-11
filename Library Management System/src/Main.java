import java.io.FileInputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("output.txt");
            int i;
            while ((i = fis.read()) != -1) {
                System.out.print((char) i); // Convert byte to character and print
            }
            fis.close();
        } catch (IOException e) {
            System.out.println("Error reading file.");
        }
    }
}
