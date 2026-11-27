class Point {
    private int x, y;
    public Point(int x, int y) { this.x = x; this.y = y; }
    public int getX() { return x; }
    public void setX(int x) { this.x = x; }
    public int getY() { return y; }
    public void setY(int y) { this.y = y; }
    public double distanceFromOrigin() { return Math.sqrt(x * x + y * y); }
    public void translate(int dx, int dy) { this.x += dx; this.y += dy; }
    public double distance(Point p) {
        int dx = this.x - p.x, dy = this.y - p.y;
        return Math.sqrt(dx * dx + dy * dy);
    }
    public void setLocation(int x, int y) { this.x = x; this.y = y; }
    @Override public String toString() { return "[" + x + ";" + y + "]"; }
}

class Line {
    private Point p1, p2;
    public Line() { this.p1 = new Point(0, 0); this.p2 = new Point(0, 0); }
    public Line(Point p1, Point p2) { this.p1 = p1; this.p2 = p2; }
    public Point getP1() { return p1; }
    public void setP1(Point p1) { this.p1 = p1; }
    public Point getP2() { return p2; }
    public void setP2(Point p2) { this.p2 = p2; }
    public double length() { return p1.distance(p2); }
    @Override public String toString() { return "Line: " + p1 + " -> " + p2; }
}

public class LineTest {
    public static void main(String[] args) {
        Line line1 = new Line(new Point(0, 0), new Point(3, 4));
        System.out.println(line1);
        System.out.println("Length: " + line1.length());

        Line line2 = new Line();
        System.out.println(line2);
        System.out.println("Length: " + line2.length());

        line1.setP2(new Point(8, 15));
        System.out.println("After setP2: " + line1);
        System.out.println("New length: " + line1.length());
    }
}
