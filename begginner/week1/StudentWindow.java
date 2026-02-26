import javax.swing.*;
import java.awt.*;

public class StudentWindow extends JFrame {

    public StudentWindow() {
        setTitle("Student Profile");
        setSize(1000, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setLayout(new GridLayout(3, 1)); 

        JLabel label1 = new JLabel("Name: Tenzing Gauchan");
        label1.setFont(new Font("Arial", Font.BOLD, 18));

        JLabel label2 = new JLabel("CollegeID: NP01NT4A250133");
        label2.setFont(new Font("Arial", Font.BOLD, 18));

        JLabel label3 = new JLabel("Module Name: Programming");
        label3.setFont(new Font("Arial", Font.BOLD, 18));

        add(label1);
        add(label2);
        add(label3);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new StudentWindow();
            }
        });
    }
}