import java.io.IOException;
import java.util.Scanner;
import java.io.FileWriter;
public class Member {
    public void addmember(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your name to become a member: ");
        String member_name = in.nextLine();

        try {
            FileWriter writer = new FileWriter("Member.txt",true);
            writer.write(member_name+"\n");
            writer.close();
            System.out.println("Member added Successfully!");
        } catch (IOException e) {
            System.out.println("Error adding member.");
        }
    }

}

