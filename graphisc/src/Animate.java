import graphics.*;

public class Animate {
    boolean running;

    Animate(){
        running = true;
    }

    public void display(){
        Rectangle r = new Rectangle (50, 50, 100, 50);
        r.setColor(Color.RED);
        r.fill();

        while (running){
            r.translate(0, 5);
            try{
                Thread.sleep(50);
            } catch(Exception e){
                
            }
        }
    }
}
