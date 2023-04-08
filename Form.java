import javax.swing.*;
public class Form extends JFrame{
    public static void main(String args[]){
        new Form();
        JFrame f = new JFrame("Data Entry Form");

        JLabel l1 = new JLabel("Enter Name:");
        l1.setBounds(50,100,200,40);
        JTextField t1 = new JTextField("Type Name here...");
        t1.setBounds(250,100,200,40);

        JLabel l2 = new JLabel("Enter Age:");
        l2.setBounds(50,200,200,40);
        JTextField t2 = new JTextField("Type Age here...");
        t2.setBounds(250,200,200,40);

        JLabel l3 = new JLabel("Enter Address:");
        l3.setBounds(50,320,200,40);
        JTextField t3 = new JTextField("Type Address here...");
        t3.setBounds(250,300,200,60);

        JButton b1 = new JButton("Ok");
        b1.setBounds(50,450,100,40);

        JButton b2 = new JButton("Cancel");
        b2.setBounds(250,450,100,40);

        f.add(l1);
        f.add(t1);
        f.add(l2);
        f.add(t2);
        f.add(l3);
        f.add(t3);
        f.add(b1);
        f.add(b2);

        f.setSize(600,600);
        f.setLayout(null);
        f.setVisible(true);

    }
}