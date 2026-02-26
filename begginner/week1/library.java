import javax.swing.*;

public class library extends JFrame{
    public library(){
        setTitle("Library Notice");
        setSize(400,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JLabel label=new JLabel();
        label.setText("Library Opens at 7:00 AM");
        label.setHorizontalAlignment(SwingConstants.CENTER);
        
        //always at the end of code
        add(label);
        setVisible(true);
        
    }
    
    public static void main(String[] args){
    new library();
    }
}



