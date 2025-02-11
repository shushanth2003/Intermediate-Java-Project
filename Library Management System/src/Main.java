import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean option=true;
        Scanner in = new Scanner(System.in);
       try{
           while(option){
               System.out.println("If you're not a Member, please enter 'M' to become a Member.\n" +
                       "If you need to add a book, please enter 'A'.\n" +
                       "If you need to borrow a book from the library, please enter 'B'.\n" +
                       "If you need to return a book, please enter 'R'.\n" +
                       "If you need to display the books, please enter 'D'.\n"+
                       "If you need to display the boooks, please enter 'E'.");

               char charMember = in.next().charAt(0);
               if(charMember=='M'){
                   Member member=new Member();
                   member.addmember();
               }
               char charAddbook=in.next().charAt(0);
               if(charAddbook=='A'){
                   Addbook addbook = new Addbook();
                   addbook.getaddbook();
               }
               char charBorrowbook=in.next().charAt(0);
               if(charBorrowbook=='B'){
                   AddBorrowbook addBorrowbook = new AddBorrowbook();
               }
               char charReturnbook=in.next().charAt(0);
               if(charReturnbook=='R'){
                   Addreturnbook addreturnbook = new Addreturnbook();
               }
               char charDisplaybook=in.next().charAt(0);
               if(charDisplaybook=='D'){
                   Displaybook displaybook = new Displaybook();
               }
               char charExit=in.next().charAt(0);
               if(charExit=='E'){
                   option=false;
               }
           }
       } catch (Exception e) {
           System.err.println("Giving Input is error");
       }
    }
}
