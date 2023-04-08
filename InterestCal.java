import javax.swing.*;
import java.awt.event.*;
public class InterestCal implements ActionListener{
    JLabel l1,l2,l3,l4;
    JTextField t1,t2,t3,t4;
    JButton b;
    InterestCal(){
        JFrame f = new JFrame("Interest Calculator");
        l1 = new JLabel("Name:");
        l1.setBounds(50,100,150,20);
        t1 = new JTextField();
        t1.setBounds(200,100,150,20);
        l2 = new JLabel("Amount:");
        l2.setBounds(50,160,150,20);
        t2 = new JTextField();
        t2.setBounds(200,160,150,20);
        l3 = new JLabel("Interest Rate:");
        l3.setBounds(50,240,150,20);
        t3 = new JTextField();
        t3.setBounds(200,240,150,20);
        l4 = new JLabel("Interest:");
        l4.setBounds(50,320,150,20);
        t4 = new JTextField();
        t4.setBounds(50,400,150,20);
        t4.setEditable(false);

        b = new JButton("Calculate Interest");
        b.setBounds(50,500,150,40);
        b.addActionListener(this);
        f.add(l1);
        f.add(t1);
        f.add(l2);
        f.add(t2);
        f.add(l3);
        f.add(t3);
        f.add(l4);
        f.add(t4);
        f.add(b);

        f.setSize(600,600);
        f.setLayout(null);
        f.setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        String s1 = t2.getText();
        String s2 = t3.getText();

        int p = Integer.parseInt(s1);
        int r = Integer.parseInt(s2);
        int i = 0;
        if(e.getSource()==b){
            i = (p*r*1)/100;
        }
        String result = String.valueOf(i);
        t4.setText(result);
    }
    public static void main(String args []){
        new InterestCal();
    }
}

        