package applets;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Event;
import java.awt.TextField;

public class Applet1 extends Applet{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Button b1, b2; // Variables of button type
	TextField t;
	public void init() {
		b1 = new Button();
		b1.setLabel("Click");
		t = new TextField(10); // Object of TextField class
		b2 = new Button("Clear");
		b2.setLabel("Clear");
		add(b1); // Call to method
		add(t);
		add(b2);
	}
	public boolean action(Event e, Object o) { // overriding
		if(e.target.equals(b1)) {
			t.setText("Hello World!");
		}
		if(e.target.equals(b2)) {
			t.setText("");
		}
		return false;
		
	}
}
