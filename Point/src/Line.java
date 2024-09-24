public class Line {
    Point y_int;
    Point p;

    Line(Point y, Point a){
        y_int = y;
        p = a;
    }

    public int slope(){
        int m = (p.getY() - y_int.getY())/(p.getX() - y_int.getY());
        return m;
    }

    public int solveY(int x){
        int y = slope() * x + y_int.getY();
        return y;
    }

    public void display(){
        System.out.printf("y = %dx + %d%n", slope(), 
        y_int.getY());
    }
}
