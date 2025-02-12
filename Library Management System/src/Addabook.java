import java.io.*;
import java.util.Scanner;
public class Addabook {
    private static final String FILE_NAME="Book.txt";
    public void addabook() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Book Name : ");
        String bookname=in.nextLine();
        if(bookexists(bookname)){
            try(FileWriter writer = new FileWriter(FILE_NAME,true)){
                writer.write(bookname + "\n");
                System.out.println("Book added Successfully");
            } catch (IOException e) {
                System.err.println("Error Adding in Book");
            }
        }
    }
    private boolean bookexists(String bookexists){
        try(BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))){
            String line=reader.readLine();
            while(line!=null){
                if(line.equalsIgnoreCase(bookexists)){
                    return true;
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading book file");
        }
        return false;
    }
}
