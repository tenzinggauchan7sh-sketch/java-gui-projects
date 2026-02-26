import javax.swing.*;
import java.awt.*;
public class administration extends JFrame{
    public administration(){
        setTitle("Administrator");
        setResizable(false);
        setLocationRelativeTo(null);
        setSize(400,300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        Container c=getContentPane();
        c.setBackground(new Color(173,216,230));
        
        JLabel label=new JLabel();
        label.setText("Welcome to Orieantation Day");
        label.setHorizontalAlignment(SwingConstants.CENTER);
        label.setFont(new Font("Arial",Font.BOLD, 18));
        
        add(label);
        setVisible(true);
    }
    public static void main(String[] args){
        new administration();
    }
}