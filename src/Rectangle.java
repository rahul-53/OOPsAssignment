public class Rectangle {
    double length;
    double breadth;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public Rectangle() {

    }

    public void calculateArea(){
        double area = length*breadth;
        System.out.println("Area of rectangle is "+area);
    }
    public void calculatePerimeter(){
        double perimeter= 2*(length+breadth);
        System.out.println("Perimeter of rectangle is "+perimeter);
    }
}
