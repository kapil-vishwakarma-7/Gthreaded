import java.
awt.event.KeyAdapter;
import java.awt.event.KeyEvent;


public class Key extends KeyAdapter {
private Handler handler;
	public Key(Handler handler){
	this.handler = handler;
}
	public void keyPressed(KeyEvent e){
		int key  =  e.getKeyCode();
		int mv=5;
		for(int i=0;i<handler.object.size();i++)
		{
			GameObject temp = handler.object.get(i);
			if(temp.id == ID.Player){
				if(key == KeyEvent.VK_UP)   { temp.setVelY(-mv);}
				if(key == KeyEvent.VK_DOWN) { temp.setVelY(mv);}
				if(key == KeyEvent.VK_LEFT) { temp.setVelX(-mv);}
				if(key == KeyEvent.VK_RIGHT){ temp.setVelX(mv);}
			}
			
		}
		
	}
	public void keyReleased(KeyEvent e){
		int key  =  e.getKeyCode();
		for(int i=0;i<handler.object.size();i++)
		{
			GameObject temp = handler.object.get(i);
			if(temp.id == ID.Player){
				if(key == KeyEvent.VK_UP)   { temp.setVelY(0);}
				if(key == KeyEvent.VK_DOWN) { temp.setVelY(0);}
				if(key == KeyEvent.VK_LEFT) { temp.setVelX(0);}
				if(key == KeyEvent.VK_RIGHT){ temp.setVelX(0);}
			}
			
		}
	}
}
