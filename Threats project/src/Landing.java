/*
 * Name: Joseph Wang and Sean Wu
 * Date: Oct 25
 * Description: Handles the plane landing in the third scene
 */

public class Landing extends Thread{

    Assets a = new Assets();

    public void landing(){
        a.drawPlane(100, 100);
        for (int i = 100; i <= 500; i+=5){
            try {

                a.body.translate(5, 3);
                a.nose.translate(5, 3);
                a.nose2.translate(5, 3);
                a.rear.translate(5, 3);
                a.tail.translate(5, 3);
                a.wing.translate(5, 3);
                a.wheel1.translate(5, 3);
                a.wheel2.translate(5, 3);

                Thread.sleep(30);
            } catch (Exception e) {
                // TODO: handle exception
            }
        }

        for (int i = 500; i <= 850; i+=5){
            try {

                a.body.translate(3, 0);
                a.nose.translate(3, 0);
                a.nose2.translate(3, 0);
                a.rear.translate(3, 0);
                a.tail.translate(3, 0);
                a.wing.translate(3, 0);
                a.wheel1.translate(3, 0);
                a.wheel2.translate(3, 0);

                Thread.sleep(30);
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
    }

    public void run(){
        landing();
    }
}
