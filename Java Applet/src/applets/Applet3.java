package applets;

import java.applet.Applet;
import java.awt.Checkbox;
import java.awt.Label;
import java.awt.TextField;
import java.awt.Event;

public class Applet3 extends Applet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Checkbox c1, c2, c3, c4;
	Label l1, l2, l3, l4;
	TextField t;
	int a=1, b=2, c=3, d=4;
	public void init() {
		c1 = new Checkbox();
		c2 = new Checkbox();
		c3 = new Checkbox();
		c4 = new Checkbox();
		l1 = new Label("1");
		l2 = new Label("2");
		l3 = new Label("3");
		l4 = new Label("4");
		t = new TextField(10);
		
		add(c1);
		add(l1);
		add(c2);
		add(l2);
		add(c3);
		add(l3);
		add(c4);
		add(l4);
		add(t);
		
	}
	
	public boolean action(Event e, Object o) {
		if(e.target.equals(c1)) {
			t.setText("1");
		}
		if(e.target.equals(c2)) {
			t.setText("2");
		}
		if(e.target.equals(c3)) {
			t.setText("3");
		}
		if(e.target.equals(c4)) {
			t.setText("4");
		}
		return false;
	}

}
