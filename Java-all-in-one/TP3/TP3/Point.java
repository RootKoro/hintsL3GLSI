package TP3;

public class Point {
    private double x;
    private double y;

    public Point() {
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point(Point point) {
        this.x = point.x;
        this.y = point.y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double distance(double x, double y) {
        return Math.sqrt(Math.pow(x - this.x, 2) + Math.pow(y - this.y, 2));
    }

    public double distance(Point point) {
        return distance(point.x, point.y);
    }

    public static double distance(double x1, double y1, double x2, double y2) {
        // return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        return new Point(x1, y1).distance(x2, y2);
    }

    public void deplacer(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point translater(double dx, double dy) {
        return new Point(x + dx, y + dy);
    }

    public String toString() {
        return "Point : x = " + this.x + " ; y = " + this.y;
    }
}