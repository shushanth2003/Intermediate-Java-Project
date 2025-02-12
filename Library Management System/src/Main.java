import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Addabook addabook = new Addabook();
        BorrowBook borrowBook = new BorrowBook();
        Addamember addamember = new Addamember();
        while (true) {
            System.out.println("\n📚 Library Management System");
            System.out.println("1. Add a Book");
            System.out.println("2. Add a Member");
            System.out.println("3. Borrow a Book");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = in.nextInt();
            in.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    addabook.addabook();
                    break;
                case 2:
                    addamember.addamember();
                    break;
                case 3:
                    borrowBook.borrowBook();
                    break;
                case 4:
                    System.out.println("Exiting... Thank you! 📖");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice! Please enter a valid option.");
            }
        }
    }
}

