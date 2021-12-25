import java.util.Scanner;

public class InputValidation {
    public static void main(String[] args) {
        int num;
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Enter an integer between 0 and 10:");
        num = keyboard.nextInt();
        
        while(num <0 || num >10)
        {
            System.out.print("Out of range. Try again: ");
            num = keyboard.nextInt();
        }
        
        System.out.println("The entered number is " + num);
    }
}
