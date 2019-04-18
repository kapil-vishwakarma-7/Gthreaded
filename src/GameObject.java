import java.awt.Graphics;

public abstract class GameObject {
	protected int x,y;
	protected int velX,velY;
	protected ID id;
	public GameObject(int x,int y, ID id){
		this.x = x;
		this.y = y ;
		this.id = id;
	}
public abstract void render(Graphics g);
public abstract void tick();

public void setX(int x){this.x = x;}
public void setY(int y){this.y = y;}

public int getX(){return x;}
public int  getY(){return y;}


public void setId(ID id){this.id = id;}
public ID getId(ID id){return id;}


public void setVelX(int x){this.velX = x;}
public void setVelY(int y){this.velY = y;}

public int getVelX(){return velX;}
public int  getVelY(){return velY;}

}
