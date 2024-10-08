import java.awt.*;
import java.awt.event.*;
public class AWT_calci {
    AWT_calci(){
        Frame f=new Frame("CALCULATOR");

        Label l1=new Label("BASIC CALCULATOR");
        l1.setBounds(425,100,150,50);

        TextField t1=new TextField();
        t1.setBounds(300,200,100,50);
        TextField t2=new TextField();
        t2.setBounds(600,200,100,50);
        TextField t3=new TextField();
        t3.setBounds(500,700,100,50);

        Button b1=new Button("+");
        b1.setBounds(200,400,50,50);
        Button b2=new Button("-");
        b2.setBounds(300,400,50,50);
        Button b3=new Button("*");
        b3.setBounds(400,400,50,50);
        Button b4=new Button("/");
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
       f.setBackground(Color.BLUE);
       
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
        new AWT_calci();
    }
}
