import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;


public class Player extends GameObject{

	public Player(int x, int y, ID id) {
		super(x, y, id);
	
	}

	@Override
	public void render(Graphics g) {
		g.setColor(Color.yellow);
		g.fillOval(x, y, 25, 25);
		g.setColor(Color.black);
		g.fillOval(x+14, y+5, 5, 5);
		g.fillOval(x+7, y+5, 5, 5);
		g.drawLine(x+7, y+15, x+15, y+15);
		
		//g.fillRect(x+3, y+25, 20, 20);
	
	}

	@Override
	public void tick() {
		x +=velX;
		y +=velY;
	}
	public Rectangle getBounds(){
	return	new Rectangle(x,y,20,20);
	}

}
