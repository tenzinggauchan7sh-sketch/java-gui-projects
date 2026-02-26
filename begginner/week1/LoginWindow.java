import javax.swing.*;
import java.awt.*;
public class LoginWindow extends JFrame
{
    public LoginWindow(){
        setSize(800,500);
        setTitle("Login Window");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        setLocationRelativeTo(null);
        
        JLabel label=new JLabel("User Name");
        label.setBounds(150,100,70,20);
        
        JTextField field=new JTextField();
        field.setBounds(250,100,100,20);
        
        JButton loginButton=new JButton("Login");
        loginButton.setBackground(Color.GREEN);  
        loginButton.setBounds(200,150,100,20);
        
        add(label);
        add(field);
        add(loginButton);
        setVisible(true);
    }
    public static void main(String[] args){
        new LoginWindow();
    }
}