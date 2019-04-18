import java.awt.Color;
import java.awt.Graphics;


public class Enemy extends GameObject{

	public Enemy(int x, int y, ID id) {
		super(x, y, id);
		 velX=5;
	     velY=5;
	}

	public void render(Graphics g) {
     g.setColor(Color.RED);	
     g.fillRect(x, y,10 ,10);
    
	}

	public void tick() {
		x +=velX;
		y +=velY;
		//x = Game.getBounds(10,Window.WIDTH, x);
		//y = Game.getBounds(10,Window.HEIGHT, y);
	    if(x<=0||x>=Window.WIDTH-32){velX *= -1;}
	    if(y<=0||y>=Window.HEIGHT-50){velY *= -1;}
	   // x =Game.r.nextInt(Window.WIDTH);
	    //y =Game.r.nextInt(Window.HEIGHT);
	}

}
