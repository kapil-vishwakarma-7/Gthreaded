

import java.awt.Canvas;
import java.awt.Dimension;

import javax.swing.JFrame;


public class Window extends Canvas {
	public static int HEIGHT = 500,WIDTH=HEIGHT*12/9;
	private static final long serialVersionUID = 1L;
	public Window(String title,Game g){
		 
			JFrame frame = new JFrame(title);
	        frame.setVisible(true);
	        frame.setResizable(false);
	        frame.setPreferredSize(new Dimension(WIDTH,HEIGHT));
	        frame.setMinimumSize(new Dimension(WIDTH,HEIGHT));
	        frame.setMaximumSize(new Dimension(WIDTH,HEIGHT));
	        frame.setLocation(400,200);
	        frame.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
	        requestFocus();
	        frame.add(g);
	        g.start();
		 
	}
}
