/*
 * Name: Joseph Wang and Sean Wu
 * Date: Oct 25
 * Description: Handles the moon in the background of scene 3
 */

public class Cheese extends Thread{
    Assets a = new Assets();

    public void run(){ //moves the moon
        a.moon();
        for (int i = 0; i < 1500; i++){
            try {
                a.e.translate(3, 0);
                a.m1.translate(3, 0);
                a.m2.translate(3, 0);
                a.m3.translate(3, 0);
                Thread.sleep(29);
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
    }
    public static void main(String[] args) {
        Thread t = new Thread();
    }
}
