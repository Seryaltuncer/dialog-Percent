import java.util.Scanner;

public class StringManip2 {
     public static void main(String[] args) {
        String str;
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Enter a line of text: ");
        str = keyboard.nextLine();
        
        System.out.println("The original text is " + str + 
                            ". The uppcase version of it is " + 
                            str.toUpperCase()+ ". The lowercase"+
                            " version of it is " + str.toLowerCase()+
                            ".");
        
    }
}
