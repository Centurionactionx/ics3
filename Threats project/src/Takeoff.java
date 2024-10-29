/*
 * Name: Joseph Wang and Sean Wu
 * Date: Oct 25
 * Description: The class that handles the takeoff on scene 1
 */

public class Takeoff extends Thread {

    Assets a = new Assets();

    public void takeoff(){
        a.drawPlane(100, 375);
        for (int i = 100; i <= 500; i+=5){
            try {

                a.body.translate(5, -3);
                a.nose.translate(5, -3);
                a.nose2.translate(5, -3);
                a.rear.translate(5, -3);
                a.tail.translate(5, -3);
                a.wing.translate(5, -3);
                a.wheel1.translate(5, -3);
                a.wheel2.translate(5, -3);

                Thread.sleep(30);
            } catch (Exception e) {
                // TODO: handle exception
            }
        }

        for (int i = 500; i <= 850; i+=5){
            try {

                a.body.translate(7, 0);
                a.nose.translate(7, 0);
                a.nose2.translate(7, 0);
                a.rear.translate(7, 0);
                a.tail.translate(7, 0);
                a.wing.translate(7, 0);
                a.wheel1.translate(7, 0);
                a.wheel2.translate(7, 0);

                Thread.sleep(30);
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
    }

    public void run(){
        takeoff();
    }
}
