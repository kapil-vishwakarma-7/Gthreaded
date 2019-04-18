import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;
import java.util.Random;



public class Game extends Canvas implements Runnable{

	
	private static final long serialVersionUID = 1L;
	private Thread thread;
	private boolean running = false;
	private Handler handler;
	public static Random r = new Random();
	public Game(){
	 new Window("Game object ",this);
	 handler = new Handler();
	 this.addKeyListener(new Key(handler));
	 handler.addObject(new Player(100,100,ID.Player));
	// for(int i=0;i<50;i++)
	 handler.addObject(new Enemy(r.nextInt(Window.WIDTH),r.nextInt(Window.HEIGHT),ID.Enemy));
	 handler.addObject(new Path(r.nextInt(Window.WIDTH),r.nextInt(Window.HEIGHT),ID.Path));
	}


    public void run(){
        long lastTime = System.nanoTime();
        double amountOfTricks = 60.0;
        double ns = 1000000000/amountOfTricks;
        double delta =0;
        long timer = System.currentTimeMillis();
        requestFocus();
        while(running){
            long now = System.nanoTime();
            delta += (now - lastTime)/ns;
            lastTime = now;
            while(delta >=1){
                tick();
                delta--;
            }
            if(running)
                render();
        if(System.currentTimeMillis()- timer>1000){
            timer += 1000;
            
          }
        }
        stop();   
    }
    
    public void render(){
    	BufferStrategy bs = this.getBufferStrategy();
        if(bs == null){
            this.createBufferStrategy(3);
            return;
        }
  Graphics g = bs.getDrawGraphics();
  g.setColor(Color.black);
  g.fillRect(0, 0, Window.WIDTH, Window.HEIGHT);
   handler.render(g);
    g.dispose();
    bs.show();
 }
    public void tick(){
    handler.tick();	
    }
    
	
	
	public synchronized void start(){
	thread = new Thread(this);
	thread.start();
	running = true;
	}
	public synchronized void stop(){
		try{
			thread.join();
			running = false;
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}

	
	
	public static void main(String args[]){
		new Game();
		
	}
}
