import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class AWT_ex2{
    AWT_ex2(){
        Frame frame = new Frame("Registration Form");
        Label signin =new Label("Sign-in");
        signin.setBounds(140,80,50,30);

        Label email =new Label("E-Mail");
        email.setBounds(50,130,100,30);
        TextField e1 = new TextField();
        e1.setBounds(160,130,150,25);

        Label pass = new Label("PassWord");
        pass.setBounds(50,170,100,30);
        TextField passin = new TextField();
        passin.setBounds(160,170,150,25);

        Label age = new Label("Age");
        age.setBounds(50,210,100,30);
        TextField agein = new TextField();
        agein.setBounds(160,210,150,25);

        Button b1 = new Button("Submit");
        b1.setBounds(180,250,50,30);

        ActionListener s = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println(e1.getText());
                System.out.println(passin.getText());
                System.out.println(agein.getText());

            }
        };

        b1.addActionListener(s);
        frame.add(signin);
        frame.add(email);
        frame.add(pass);
        frame.add(age);
        frame.add(e1);
        frame.add(passin);
        frame.add(agein);
        frame.add(b1);


        frame.setLayout(null);
        frame.setVisible(true);
        frame.setSize(500,500);


    }
    public static void main(String args[]){
        new AWT_ex2();
    }
}