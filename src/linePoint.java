import java.awt.*;

public class linePoint {
    public static void main(String[] args) {
        Point point1 = new Point(2,3);
        Point point2 = new Point(1,2);
        Point point3 = new Point(3,4);
        Point point4 = new Point(2,4);
        Point point5 = new Point(3,4);
        Point point6 = new Point(4,5);
        Point[] points= {point1,point2,point3,point4,point5,point6};
        System.out.println(inLine(point1,point2,point3));
        System.out.println(testLine(points));
    }
    public static boolean inLine(Point p1 , Point p2, Point p3){
        boolean inLine = false;
        double left = (p1.getX()-p2.getX())/(p1.getY() - p2.getY());
        double right = (p1.getX() - p3.getX()) / (p1.getY() - p3.getY());
        if(left == right){
            inLine = true;
        }
        return inLine;

    }
    public static boolean testLine(Point[] points){
        boolean testLine = false;
        for (int i = 0; i < points.length-2 ; i++) {
            for (int j = i+1; j < points.length-1; j++) {
                for (int k = j+1; k < points.length ; k++) {
                    if(inLine(points[i],points[j],points[k] )){
                        testLine = true;
                    }
                }
            }
        } return testLine;
    }
}
