import javax.swing.JOptionPane;

public class DialogPercent {
    public static void main(String[] args) {
        int mNum, fNum;
        double fPer, mPer;
        
        String num;
        
        num = JOptionPane.showInputDialog("Enter the number of females");
        fNum = Integer.parseInt(num);
        
        num = JOptionPane.showInputDialog("Enter the number of males");
        mNum = Integer.parseInt(num);
        
        fPer = 100*(double)fNum/(fNum + mNum);
        mPer = 100*(double)mNum/(fNum + mNum);
        
        JOptionPane.showMessageDialog(null, "The percentage of females is " +
                                        fPer + "\nThe males percentage is " + 
                                        mPer + ".");
        
        System.exit(0);
    }
  
}
