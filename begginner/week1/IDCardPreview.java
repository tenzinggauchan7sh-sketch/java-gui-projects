import javax.swing.*;
public class IDCardPreview extends JFrame
{
    public IDCardPreview(){
        setTitle("ID Card Preview");
        setSize(400,300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        setLocationRelativeTo(null);
        
        String details="<html>"+
                        "<div style='text-align:center'>"+
                        "Name   : Tenzing Gauchan"+"<br>"+
                        "Module : Programming"+"<br>"+
                        "College: Islington College"+"<br>"+
                        "</div>"+
                        "</html>";
        JLabel label=new JLabel(details);
        label.setBounds(100,100,200,100);
        
        
        add(label);
        setVisible(true);
        
    }
    
    public static void main(String[] args){
        new IDCardPreview();
        
    }
}