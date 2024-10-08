import javax.swing.*;
import java.awt.event.*;
public class swing_ex1 {
    swing_ex1(){
        JFrame f=new JFrame("CALCULATOR");

        JLabel l1=new JLabel("BASIC CALCULATOR");
        l1.setBounds(425,100,150,50);

        JTextField t1=new JTextField();
        t1.setBounds(300,200,100,50);
        JTextField t2=new JTextField();
        t2.setBounds(600,200,100,50);
        JTextField t3=new JTextField();
        t3.setBounds(500,700,100,50);

        JButton b1=new JButton("+");
        b1.setBounds(200,400,50,50);
       JButton b2=new JButton("-");
        b2.setBounds(300,400,50,50);
        JButton b3=new JButton("*");
        b3.setBounds(400,400,50,50);
        JButton b4=new JButton("/");
        b4.setBounds(500,400,50,50);
        
        
       
        f.add(l1);
        f.add(t1);
        f.add(t2);
        f.add(t3);
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.setLayout(null);
        f.setVisible(true);
        f.setSize(1000,1000);
       //f.setBackground(JColor.BLUE);

        ActionListener s=new ActionListener() {
            public void actionPerformed(ActionEvent e){
                String a=t1.getText();
                String b=t2.getText();
                int k=Integer.parseInt(a);
                int l=Integer.parseInt(b);
                int c=0;
                if(e.getSource()==b1)
                c=k+l;
                if(e.getSource()==b2)
                c=k-l;
                if(e.getSource()==b3)
                c=k*l;
                if(e.getSource()==b4)
                c=k/l;
                t3.setText(String.valueOf(c));
            }
        };
        b1.addActionListener(s);
        b2.addActionListener(s);
        b3.addActionListener(s);
        b4.addActionListener(s);
        t1.addActionListener(s);
        t2.addActionListener(s);
        t3.addActionListener(s);

    }
    public static void main(String[] args){
        new swing_ex1();
    }
}
