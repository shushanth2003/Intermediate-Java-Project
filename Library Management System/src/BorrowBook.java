import java.io.*;
import java.util.Scanner;

public class BorrowBook {
    private static final String BOOK_FILE = "Book.txt";
    private static final String BORROW_FILE = "BorrowedBooks.txt";

    public void borrowBook() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Member ID: ");
        String memberId = in.nextLine();
        System.out.print("Enter Book Name: ");
        String bookName = in.nextLine();

        if (!isBookAvailable(bookName)) {
            System.out.println("Book is not available for borrowing.");
            return;
        }

        try (FileWriter writer = new FileWriter(BORROW_FILE, true)) {
            writer.write(memberId + " - " + bookName + "\n");
            System.out.println("Book borrowed successfully!");
        } catch (IOException e) {
            System.out.println("Error borrowing book.");
        }

        // Remove book from available list
        removeBookFromLibrary(bookName);
    }

    private boolean isBookAvailable(String bookName) {
        try (BufferedReader reader = new BufferedReader(new FileReader(BOOK_FILE))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.equalsIgnoreCase(bookName)) {
                    return true;
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading book file.");
        }
        return false;
    }

    private void removeBookFromLibrary(String bookName) {
        File bookFile = new File(BOOK_FILE);
        File tempFile = new File("TempBook.txt");

        try (BufferedReader reader = new BufferedReader(new FileReader(bookFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile))) {

            String line;
            while ((line = reader.readLine()) != null) {
                if (!line.equalsIgnoreCase(bookName)) {
                    writer.write(line + "\n");
                }
            }
        } catch (IOException e) {
            System.out.println("Error updating book list.");
            return;
        }

        bookFile.delete();
        tempFile.renameTo(bookFile);
    }
}

