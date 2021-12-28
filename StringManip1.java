import java.util.Scanner;

public class StringManip1 {
    public static void main(String[] args) {
        String str;
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Enter a line of text: ");
        str = keyboard.nextLine();
        
        System.out.println("The text " + str + " has " +
                            str.length() + " characters.");
        
    }
}
