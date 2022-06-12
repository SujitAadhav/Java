package applets;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Event;
import java.awt.Label;
import java.awt.TextField;

public class Applet2 extends Applet{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	TextField t1, t2, t3;
	Button b; // Variables of button type
	Label l;
	public void init() {
		t1 = new TextField(5);
		l = new Label("+");
		t2 = new TextField(5);
		t3 = new TextField(5);
		b = new Button("=");
		
		add(t1);
		add(l);
		add(t2);
		add(t3);
		add(b);
	}
	public boolean action(Event e, Object o) { // overriding
		if(e.target.equals(b)) {
			String s1 = t1.getText();
			String s2 = t2.getText();
			int a = Integer.parseInt(s1);
			int b = Integer.parseInt(s2);
			int k = a + b;
			String s3 = String.valueOf(k);
			t3.setText(s3);
		}

		return false;
		
	}
}

