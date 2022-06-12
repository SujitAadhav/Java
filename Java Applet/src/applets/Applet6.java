package applets;
import java.applet.Applet;
import java.awt.Button;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Applet6 extends Applet implements ActionListener{
	myButton b;
	TextField tf;
	public void init() {
		setLayout(new GridLayout(2, 1));
		tf = new TextField();
		b = new myButton();
		b.addActionListener(this);
		
		add(tf);
		add(b);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(b.getLabel() == "Clear")
			tf.setBackground(new Color(201, 255, 229));
		else 
			tf.setBackground(new Color(255, 255, 255));
		
	}

}

class myButton extends Button implements ActionListener{
	public myButton() {
		this.setLabel("Click");
		this.addActionListener(this);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(this.getLabel() == "Click") {
			this.setLabel("Clear");
		}else {
			this.setLabel("Click");
		}
	}
}
