package ymt111_week12_ex1;

import javax.swing.*;

public class YMT111_Week12_Ex1 {

    public static void main(String[] args) {
        String text;
        
        text = JOptionPane.showInputDialog("Enter a text");
        
        System.out.print("The entered text has ");
        
        textAnalyzer(text);
        
        System.out.println(Character.toLowerCase('A'));
        
        System.exit(0);
    }
    
    public static void textAnalyzer(String str){
        int digitCount = 0,
                upperCount = 0,
                lowerCount = 0,
                spaceCount = 0;
        
        for(int i=0; i<str.length(); i++){
            if(Character.isDigit(str.charAt(i)))
                digitCount++;
            else if(Character.isUpperCase(str.charAt(i)))
                upperCount++;
            else if(Character.isLowerCase(str.charAt(i)))
                lowerCount++;
            else if(Character.isSpaceChar(str.charAt(i)))
                spaceCount++;
            else
                ;
        }
        
        System.out.println(digitCount + " digits, " + 
                upperCount + " uppercase letters, " + 
                lowerCount + " lowercase letters, and " + 
                spaceCount + " spaces.");
    }
    
}
