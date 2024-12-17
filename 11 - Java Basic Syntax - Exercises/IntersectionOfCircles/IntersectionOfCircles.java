import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IntersectionOfCircles {

    public static boolean Intersect(Circle firstCircle, Circle secondCircle) {
        double xDifference = Math.abs(firstCircle.center.x - secondCircle.center.x);
        double yDifference = Math.abs(firstCircle.center.y - secondCircle.center.y);
        double distance = Math.sqrt(Math.pow(xDifference, 2)) + Math.sqrt(Math.pow(yDifference, 2));

        if (distance <= firstCircle.radius + secondCircle.radius) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        String[] firstCircleInput = input.readLine().split(" ");
        double x1 = Double.parseDouble(firstCircleInput[0]);
        double y1 = Double.parseDouble(firstCircleInput[1]);
        double radius1 = Double.parseDouble(firstCircleInput[2]);

        String[] secondCircleInput = input.readLine().split(" ");
        double x2 = Double.parseDouble(secondCircleInput[0]);
        double y2 = Double.parseDouble(secondCircleInput[1]);
        double radius2 = Double.parseDouble(secondCircleInput[2]);

        Circle firstCircle = new Circle(new Point(x1, y1), radius1);
        Circle secondCircle = new Circle(new Point(x2, y2), radius2);

        if (Intersect(firstCircle, secondCircle)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}

class Circle {
    public Point center;
    public double radius;

    Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }
}

class Point {
    public double x;
    public double y;

    Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
}