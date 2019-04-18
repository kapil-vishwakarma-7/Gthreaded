import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class Path extends GameObject{

	public Path(int x, int y, ID id) {
		super(x, y, id);
		velX = 4;
		velY=4;
	}

	@Override
	public void render(Graphics g) {
		g.setColor(Color.white);
		g.drawLine(0,Window.HEIGHT-40,Window.WIDTH,Window.HEIGHT-40);
		g.setFont(new Font("Times New Roman",20,14));
		g.setColor(Color.white);
		//g.drawString("A Game Developed By Kapil vishwakarma",0+x ,Window.HEIGHT-30 );
		//g.drawString("www.Semgame.com",Window.WIDTH-130 +x,Window.HEIGHT-30 );
		g.drawString("Devloped By Kapil Vishwakarma",x,Window.HEIGHT-30);
	}

	@Override
	public void tick() {
		x +=velX;
		y +=velY;
		if(x<=0||x>=Window.WIDTH-32){velX *= -1;}
	    if(y<=0||y>=Window.HEIGHT-50){velY *= -1;}
	}
	
}