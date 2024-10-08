import java.awt.*;
import java.awt.event.*;
class AWT_ex1 extends Frame{
    AWT_ex1(){
        Frame f1=new Frame("Registration");
        Label h=new Label("Sign in Form");
        h.setBounds(500,50,100,50);

        Label l1=new Label("E mail");
        TextField t1=new TextField();
        t1.setBounds(400,120,100,25);
        l1.setBounds(300,100,100,50);

        Label l2=new Label("password");
        TextField t2=new TextField();
        t2.setBounds(400,220,100,25);
        l2.setBounds(300,200,100,50);

        Button b1=new Button("Log in");
        b1.setBounds(500,400,50,40);

        Button b2=new Button("log out");
        b2.setBounds(400,400,50,40);
        ActionListener as=new ActionListener() {
            public void actionPerformed(ActionEvent e){
                System.out.println(t1.getText());
                System.out.println(t2.getText());
            }
        };

        b1.addActionListener(as);
        f1.add(h);
        f1.add(l1);
        f1.add(t1);
        f1.add(l2);
        f1.add(t2);
        f1.add(b1);
        f1.add(b2);
        f1.setLayout(null);
        f1.setVisible(true);
        f1.setSize(1000,1000);

       
    }
    public static void main(String[] args) {
        new AWT_ex1();
    }
}