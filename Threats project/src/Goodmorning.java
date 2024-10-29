
public class Goodmorning extends Thread {

    Assets a = new Assets();

    public void goodmorning(){
        a.sun();
        for(int i = 500; i < 850; i+=1){
            try {
                a.sun.translate(1, 0);
                a.sunline1.translate(1,0);
                a.sunline2.translate(1,0);
                a.sunline3.translate(1,0);
                Thread.sleep(29);
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
        
        
    }

    public void run(){
		goodmorning();
	}
}
