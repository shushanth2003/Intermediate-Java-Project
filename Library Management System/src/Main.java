import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean content=true;
        Scanner in = new Scanner(System.in);
       try{
           while(content){
               System.out.println("If you're not Member, Please click The Member Option please Enter as M");
               char charMember = in.next().charAt(0);
               if(charMember=='M'){
                   Member member=new Member();
               }
               System.out.println("If You need to Add the BooK, Please add the Book, please Enter as A");
               char charAddbook=in.next().charAt(0);
               if(charAddbook=='A'){

               }

               System.out.println("If You need to Borrow the Book From Library, Please click the Borrow ");
               String borrowBook=in.nextLine();
               System.out.println("If You need to Return the Book From Library, Please click The Return Book");
               String displayBook=in.nextLine();
               System.out.println("If you need to Display The Book");
           }
       } catch (Exception e) {
           System.err.println("Giving Input is error");
       }
    }
}
