/*
 * Name: Joseph Wang and Sean Wu
 * Date: Oct 25
 * Description: Handles the moon in the background of scene 3
 */

public class Cheese extends Thread{
    Assets a = new Assets();

    public void run(){
        a.moon();
        for (int i = 0; i < 900; i+=5){
            try {
                a.e.translate(3, 0);
                Thread.sleep(29);
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
    }
}
