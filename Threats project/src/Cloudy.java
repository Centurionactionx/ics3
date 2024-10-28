public class Cloudy extends Thread{
    Assets a = new Assets();
    public void cloudy(){
        a.cloud1();
        for(int i = 500; i < 850; i+=1){
            try {
                a.c1.translate(1, 0);
                a.c2.translate(1, 0);
                a.c3.translate(1, 0);
                Thread.sleep(29);
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
    }

    public void run(){
        cloudy();
    }
}
