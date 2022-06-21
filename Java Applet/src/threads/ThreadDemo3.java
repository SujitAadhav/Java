package threads;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ThreadDemo3 extends Frame implements Runnable{
	
	TextField t1, t2;
	Thread th1, th2;
	int i, j;
	T th;
	public ThreadDemo3() {
		setLayout(new FlowLayout());
		add(t1 = new TextField(15));
		add(t2 = new TextField(15));
		th1 = new Thread(this);
		th1.start();
		th = new T();
		th.start();
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		setSize(300, 300);
		setVisible(true);
	}
	class T extends Thread{
		public void run() {
			while(true) {
				t2.setText(String.valueOf(j));
				if(j == 50)
					j=0;
				else
					j++;
				try {
					Thread.sleep(20);
				}
				catch(Exception e) {
					
				}
			}
		}
	}
	
	public static void main(String[] args) {
		ThreadDemo3 t = new ThreadDemo3();
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			Thread th = Thread.currentThread();
			if(th.equals(th1)) {
				t1.setText(String.valueOf(i));
				if(i == 50)
					i=0;
				else
					i++;
			}
			if(th.equals(th2)) {
				t2.setText(String.valueOf(i));
				if(i == 50)
					i=0;
				else
					i++;
			}try {
				Thread.sleep(20);
			}
			catch(Exception e) {
				
			}
		}
	}

}


