/**
 * Represents a point in a two-dimensional space with an x and y coordinate.
 */
class Point {

    /** The x-coordinate of the point. */
    private int x;

    /** The y-coordinate of the point. */
    private int y;

    /**
     * Parameterized constructor that creates a point at the given coordinates.
     *
     * @param x the initial x-coordinate
     * @param y the initial y-coordinate
     */
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Returns the x-coordinate of this point.
     *
     * @return the x-coordinate
     */
    public int getX() {
        return x;
    }

    /**
     * Sets the x-coordinate of this point.
     *
     * @param x the new x-coordinate
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * Returns the y-coordinate of this point.
     *
     * @return the y-coordinate
     */
    public int getY() {
        return y;
    }

    /**
     * Sets the y-coordinate of this point.
     *
     * @param y the new y-coordinate
     */
    public void setY(int y) {
        this.y = y;
    }

    /**
     * Calculates the distance from this point to the origin (0, 0).
     * Uses the formula: sqrt(x² + y²).
     *
     * @return the distance from the origin
     */
    public double distanceFromOrigin() {
        return Math.sqrt(x * x + y * y);
    }

    /**
     * Moves this point by the given amounts along the x and y axes.
     * For example, translating (5, 3) by (2, 1) results in (7, 4).
     *
     * @param dx the amount to move along the x-axis
     * @param dy the amount to move along the y-axis
     */
    public void translate(int dx, int dy) {
        this.x += dx;
        this.y += dy;
    }

    /**
     * Calculates the distance between this point and another point p.
     * Uses the formula: sqrt((x2 - x1)² + (y2 - y1)²).
     *
     * @param p the other point
     * @return the distance between this point and p
     */
    public double distance(Point p) {
        int dx = this.x - p.x;
        int dy = this.y - p.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    /**
     * Updates the coordinates of this point to the given values.
     *
     * @param x the new x-coordinate
     * @param y the new y-coordinate
     */
    public void setLocation(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Returns a string representation of the point in the format [x;y].
     *
     * @return the string representation of the point
     */
    @Override
    public String toString() {
        return "[" + x + ";" + y + "]";
    }
}

/**
 * Test class that exercises all methods of the Point class.
 */
public class PointTest {

    public static void main(String[] args) {

        System.out.println("=== Constructor & Getters ===");
        Point p1 = new Point(5, 3);
        System.out.println("Created point: " + p1);
        System.out.println("getX() = " + p1.getX());
        System.out.println("getY() = " + p1.getY());

        System.out.println("\n=== Setters ===");
        p1.setX(10);
        p1.setY(7);
        System.out.println("After setX(10), setY(7): " + p1);

        System.out.println("\n=== distanceFromOrigin() ===");
        Point p2 = new Point(3, 4);
        System.out.println("Distance of " + p2 + " from origin: "
                + p2.distanceFromOrigin()); // expected 5.0

        System.out.println("\n=== translate(dx, dy) ===");
        Point p3 = new Point(5, 3);
        p3.translate(2, 1);
        System.out.println("After translate(2, 1) on (5,3): " + p3); // expected [7;4]

        System.out.println("\n=== distance(Point p) ===");
        Point a = new Point(1, 2);
        Point b = new Point(4, 6);
        System.out.println("Distance between " + a + " and " + b + ": "
                + a.distance(b)); // expected 5.0

        System.out.println("\n=== setLocation(x, y) ===");
        Point p4 = new Point(0, 0);
        p4.setLocation(8, 15);
        System.out.println("After setLocation(8, 15): " + p4); // expected [8;15]
        System.out.println("Distance from origin: " + p4.distanceFromOrigin()); // expected 17.0

        System.out.println("\n=== toString() ===");
        System.out.println("toString output: " + new Point(-2, 4)); // expected [-2;4]
    }
}
