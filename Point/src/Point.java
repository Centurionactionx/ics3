public class Point {

    int x;
    int y;
    
    Point (int theX, int theY){
        x = theX;
        y = theY;
    }

    public void displayPoint(){
        System.out.printf("(%d, %d)%n", x, y);
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

}
