import java.io.*;
import java.util.Scanner;

public class Addbook {
    private String addbook;
    private FileWriter addbookwriter;

    public void getaddbook() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter book name and author eg('The Great Gatsby - F. Scott Fitzgerald') ");
        addbook = in.nextLine();

        if (isBookExists("Book.txt", addbook)) {
            System.out.println("Book is already there.");
        } else {
            addBookToFile("Book.txt", addbook);
        }
    }

    //Check if the book already exists in Book.txt
    private boolean isBookExists(String fileName, String bookName) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.equalsIgnoreCase(bookName)) { // Case-insensitive check
                    return true;
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading file.");
        }
        return false;
    }

    // Add the book to Book.txt
    private void addBookToFile(String fileName, String bookName) {
        try {
            addbookwriter = new FileWriter(fileName, true);
            addbookwriter.write(bookName + "\n");
            addbookwriter.close();
            System.out.println("Book added successfully!");
        } catch (IOException e) {
            System.out.println("Error writing to file.");
        }
    }
}
