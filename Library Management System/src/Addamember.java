import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Addamember {
    private static final String FILE_NAME ="Member.txt";
    public void addamember(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Your MemberID");
        String memberid = in.nextLine();
        System.out.println("Enter Your Name");
        String membername = in.nextLine();
        String memberdetails=memberid+" - "+membername;
        if(memberexists(memberid)){
            System.out.println("Member is already Registered");
        }else{
            try(FileWriter writer = new FileWriter(FILE_NAME,true)){
                writer.write(memberdetails+"\n");
                System.out.println("Member added Successfully");
            }catch(IOException e){
                System.out.println("Error adding member.");
            }
        }
    }
    private boolean memberexists(String memberid){
        try(BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))){
            String line = reader.readLine();
            while(line!=null){
                if(line.startsWith(memberid+"-")){
                    return true;
                }
            }
        }catch(IOException e){
            System.out.println("Error reading member file.");
        }
        return false;
    }
}
