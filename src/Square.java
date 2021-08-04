public class Square extends Rectangle {
    double side;

    public Square(double side) {
        super();

        this.side =side;

    }
    @Override
    public void calculateArea(){
        double area = side*side;
        System.out.println("Area of Square is "+area);
    }
    @Override
    public void calculatePerimeter(){
        double perimeter = 4*side;
        System.out.println("Perimeter of square is "+perimeter);
    }

    public void areaOfTenSquares(){
        System.out.println("Area of ten squares is "+(10*side*side));
    }
}
