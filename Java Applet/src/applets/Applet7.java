package applets;
import java.applet.Applet;
import java.awt.Button;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Applet7 extends Applet implements ActionListener{
	Button b1, b2;
	TextField t;
	public void init() {
		add(b1 = new Button("Click"));
		add(t = new TextField(15));
		add(b2 = new Button("Clear"));
	
		b1.addActionListener(new P(this));
		/*b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				t.setText("Hello");
			}
		});*/
		b2.addActionListener(new Q(this));
//		b2.addActionListener((e) -> t.setText(""));
//		b2.addActionListener((ActionEvent e) -> {t.setText("");});/
//		b2.addActionListener(e -> t.setText(""));
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}

class P implements ActionListener{
	Applet7 a4;
	public P(Applet7 o) {
		this.a4 = o;
	}
	
	public void actionPerformed(ActionEvent e) {
		a4.t.setText("Hello World!");
	}
}

class Q implements ActionListener{
	Applet7 a5;
	public Q(Applet7 o) {
		this.a5 = o;
	}
	
	public void actionPerformed(ActionEvent e) {
		a5.t.setText("");
	}
}