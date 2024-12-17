import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static boolean intersect(Circle first, Circle second) {
        double firstPart = Math.pow(first.getCenter().getX()- second.getCenter().getX(), 2);
        double secondPart = Math.pow(first.getCenter().getY() - second.getCenter().getY(), 2);
        double distance = Math.sqrt(firstPart + secondPart);
        return  distance <= first.getRadius() + second.getRadius();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        String[] firstCircleInput = input.readLine().split(" ");
        int x1 = Integer.parseInt(firstCircleInput[0]);
        int y1 = Integer.parseInt(firstCircleInput[1]);
        int radius1 = Integer.parseInt(firstCircleInput[2]);

        String[] secondCircleInput = input.readLine().split(" ");
        int x2 = Integer.parseInt(secondCircleInput[0]);
        int y2 = Integer.parseInt(secondCircleInput[1]);
        int radius2 = Integer.parseInt(secondCircleInput[2]);

        Circle first = new Circle(new Point(x1, y1), radius1);
        Circle second = new Circle(new Point(x2, y2), radius2);

        if (intersect(first, second)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
