import java.lang.String;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class Addition {
public static void main(String[] args) {
	Add obj = new Add();
}
}
 class Add extends JFrame implements ActionListener{
	TextField t1,t2;
	Button b;
	Label l;
	public Add(){
		t1=new TextField(10);
		t2= new TextField(10);
		b = new Button("add");
		l =new Label("Result");
		add(t1);
		add(t2);
		add(b);
		add(l);
		
		b.addActionListener(this);
		 setLayout(new FlowLayout());
		 setVisible(true);
		 setSize(400, 400);
		 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent ae) {
		int num1=Integer.parseInt(t1.getText());
		int num2=Integer.parseInt(t2.getText());
		
		int value = num1 + num2;
		l.setText(value + "");
	}
}
 
 
