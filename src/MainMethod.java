public class MainMethod {
    public static void main(String[] args) {
        Square square = new Square(5);
        Rectangle rectangle = new Rectangle(5,6);

        rectangle.calculateArea();
        rectangle.calculatePerimeter();
        System.out.println("-------------");
        square.calculateArea();
        square.calculatePerimeter();
        System.out.println("---------------");
        square.areaOfTenSquares();
    }
}
