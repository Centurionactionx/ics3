public class Flying extends Thread{

    Assets a = new Assets();
    public void flying(){
        a.drawPlane(-100, 300);
        for (int i = 0; i <= 1000; i+=5){
            if(i <= 450){
                try {
                    a.body.translate(5, -1);
                    a.nose.translate(5, -1);
                    a.nose2.translate(5, -1);
                    a.rear.translate(5, -1);
                    a.tail.translate(5, -1);
                    a.wing.translate(5, -1);
                    a.wheel1.translate(5, -1);
                    a.wheel2.translate(5, -1);
    
                    Thread.sleep(30);
                } catch (Exception e) {
                    // TODO: handle exception
                }
            }
            
            if(i > 450){
                try {
                    a.body.translate(5, 1);
                    a.nose.translate(5, 1);
                    a.nose2.translate(5, 1);
                    a.rear.translate(5, 1);
                    a.tail.translate(5, 1);
                    a.wing.translate(5, 1);
                    a.wheel1.translate(5, 1);
                    a.wheel2.translate(5, 1);
    
                    Thread.sleep(30);
                } catch (Exception e) {
                    // TODO: handle exception
                }
            }
        }
    }

    public void run(){
        flying();
    }
    
}
