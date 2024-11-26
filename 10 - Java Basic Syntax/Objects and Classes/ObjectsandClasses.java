public class ObjectsandClasses {

    private double width;
    private double height;

    //default Empty Constructor
    public ObjectsandClasses() {

    }

    //Constructor has two parameters from fields above
    public ObjectsandClasses(double width, double height) {
        this.setHeight(height);
        this.setWidth(width);

    }


    public double getWidth() {
        return this.width;
    }

    private void setWidth(double _width) {
        this.width = _width;
    }

    public double getHeight() {
        return this.height;
    }

    private void setHeight(double _height) {
        this.height = _height;
    }

    @Override
    public String toString() {
        return String.format("Area = %.2f", this.getHeight() * this.getWidth());
    }
}
