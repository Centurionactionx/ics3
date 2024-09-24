public class AppDriver {
    
    App a;
    
    AppDriver(){
        a = new App();
    }

    public void run(){
        a.display();
        return;
    }

    public static void main(String[] args) {
        AppDriver app = new AppDriver();
        app.run();
    }
}
