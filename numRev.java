package ymt111_week07;

import java.util.Scanner;

public class numRev {
    public static void main(String[] args) {
        String str;
        int temp,
                digit,
                num,
                rev;
        
        Scanner keyboard = new Scanner(System.in);
        
        do{
            System.out.print("Enter an integer number "
                    + "or exit to stop: ");
            str = keyboard.nextLine();
            
            if(str.equalsIgnoreCase("exit"))
                break;
            else{
                    for(int i=str.length()-1; i>=0; i--)
                        System.out.print(str.charAt(i));
                    /*
                    num = Integer.parseInt(str);
                    temp = num;
                    rev = 0;
                    while(temp > 0){
                        digit = temp % 10;
                        temp /= 10;
                        rev = 10*rev + digit;
                      */      
                //}
            }
            System.out.println();
            //System.out.println(str + "\t" + rev);
        }while(true);
        

    }
}
