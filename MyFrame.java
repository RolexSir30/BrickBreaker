package BrickBreaker;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class MyFrame extends JFrame implements KeyListener {
	MyPanel panel;
	public MyFrame() {
		this.setSize(800,800);
		this.setVisible(true);
		this.setTitle("BrickBreaker");
		this.setLocationRelativeTo(null);
		panel=new MyPanel();
		this.add(panel);
		this.addKeyListener(this);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		
	}

	@Override // direction du vaisseau
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		switch(e.getKeyCode()) {
		case 39 : //right
		//	System.out.println("right");
			panel.vaisseau.setLocation(panel.vaisseau.getX()+panel.vitessep, panel.yvaisseau);
			break;
		case 37 : //left
			//System.out.println("left");
			panel.vaisseau.setLocation(panel.vaisseau.getX()-panel.vitessep, panel.yvaisseau);
			break;
		
		
		}
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	
	

}
