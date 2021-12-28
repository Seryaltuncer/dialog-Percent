import java.util.Scanner;

public class StringManip3 {
    public static void main(String[] args) {
        String str;
        char c;
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Enter a word: ");
        str = keyboard.nextLine();
        
        c = str.charAt(0);
        
        System.out.println("The first character in "+
                str + " is " + c + ".");
        
        System.out.println("The last character in "+
                str + " is " + str.charAt(str.length()-1) + ".");
        
    }
}
