
public class Main {
    public static void main(String[] args) {

        //Instance from empty constructor
        ObjectsandClasses rectangle = new ObjectsandClasses();
        //Instance from constructor with two arguments initializing the object with 5 and 4 values
        ObjectsandClasses rectangle2 = new ObjectsandClasses(5,4);

        //If properties setWidth and setHeight were public these would work
        //rectangle2.setWidth(5);
        //rectangle2.setHeight(3);

        System.out.println(rectangle2.toString()); // @Override

        System.out.println(rectangle2.getWidth());
        System.out.println(rectangle2.getHeight());

    }
}