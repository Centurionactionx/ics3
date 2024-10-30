/*
 * Name: Joseph Wang and Sean Wu
 * Date: Oct 25
 * Description: Handles the animation of the sun in the first scene
 */

public class Goodmorning extends Thread {

    Assets a = new Assets();

    public void run(){ //moves the sun
		a.sun();
        for (int i = 500; i < 1600; i += 1) {
            try {
                a.sun.translate(1, 0);
                a.sunline1.translate(1, 0);
                a.sunline2.translate(1, 0);
                a.sunline3.translate(1, 0);

                Thread.sleep(29);
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
	}

    public static void main(String[] args) {
        Goodmorning g = new Goodmorning();
    }
}
