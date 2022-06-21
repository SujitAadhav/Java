package applets;
import java.applet.Applet;
import java.awt.Button;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Applet7 extends Applet implements ActionListener{
	Button b1, b2;
	TextField t;
	P p;
	public void init() {
		add(b1 = new Button("Click"));
		add(t = new TextField(15));
		add(b2 = new Button("Clear"));
		p = new P();
		add(p);
//		b1.addActionListener(new P());
		/*b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				t.setText("Hello");
			}
		});*/
//		b2.addActionListener(new P());
//		b2.addActionListener((e) -> t.setText(""));
//		b2.addActionListener((ActionEvent e) -> {t.setText("");});/
		b2.addActionListener(e -> t.setText(""));
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}

class P implements ActionListener{
	public void actionPerformed(ActionEvent e) {
		t.setText("Hello");
	}
}
