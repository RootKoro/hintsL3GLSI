package TP3;

public class TestPoint {
    public static void main(String[] args) {
        Point p1 = new Point(), p2 = new Point(1, 2), p3 = new Point(p2);

        System.out.println(p1.toString() + "\n" + p2.toString() + "\n" + p3.toString());

        double distanceP2_P1 = p2.distance(p1);
        double distanceP2_P65 = p2.distance(6, 5);
        double distanceP34_P65 = Point.distance(3, 4, 6, 5);

        p1.deplacer(8, 9);
        p2.translater(8, 9);

        System.out.println("distance [P1 , P2] : " + distanceP2_P1 + "\ndistance [P2 , P3 (6,5)] : " + distanceP2_P65
                + "\ndistance [P4(3,4) , P3 (6,5)] : " + distanceP34_P65);
        System.out.println(p2.toString() + "\n" + p1.toString());
    }
}
