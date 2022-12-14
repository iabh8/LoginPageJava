import java.awt.*;    
import java.awt.event.*;    

public class LoginPage extends Frame implements ActionListener {
    Label l1, l2;
    TextField t1, t2, t3;    
    Button b1;   
  
    LoginPageFunc() {    
  
        t1 = new TextField();    
        t1.setBounds(50, 50, 150, 20);    
        t2 = new TextField();    
        t2.setBounds(50, 100, 150, 20);    
        t3 = new TextField();    
        t3.setBounds(50, 150, 150, 20);  
        t3.setEditable(false);   
        b1 = new Button("LOGIN");    
        b1.setBounds(65, 200, 50, 50);  
        Label l1 = new Label("USERNAME");
        Label l2 = new Label("PASSWORD");

        b1.addActionListener(this);    
        add(l1);
        add(t1);
        add(l2);
        add(t2);  
        add(t3);  
        add(b1);  
  
        setSize(300,300);    
        setLayout(null);    
        setVisible(true);    
    }  
    
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1){    
            String result = "LOGIN SUCCESSFUL";    
        }
        t3.setText(result);    
    }   
// main method   
public static void main(String[] args) {    
    new LoginPageFunc();    
}    
}  
