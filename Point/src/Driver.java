public class Driver {
    
    public static void main(String[] args) {
        Point p1 = new Point(3, 7);
        Point p2 = new Point(0, -1);
        Line l = new Line(p2, p1);

        p1.displayPoint();
        l.display();
    }
}
