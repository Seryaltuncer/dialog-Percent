
import java.awt.Color;
import static java.awt.Component.CENTER_ALIGNMENT;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class NewMain {

    public static void main(String[] args) {
        JFrame frame =new JFrame ();
        
        frame.setTitle("Gui Homework");
        frame.setSize(600,700);
        frame.setVisible(true);
        int Exit_On_Close = 0;
        
        frame.setDefaultCloseOperation(Exit_On_Close);
        frame.getContentPane().setBackground(Color.red);
        
        
        JLabel label = new JLabel();
        label.setText("HELLO EVERYONE!");
        frame.add(label);
        label.setForeground(Color.blue);
        
        Font font= new Font("serif",Font.ITALIC, 100);
        
        label.setFont(font);
        label.setHorizontalAlignment((int)CENTER_ALIGNMENT);
                
        
                
        
        
        
        
        
    }

    private static Jlabel newJLabel() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
