import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Figure square = new Square(5);
        Figure triangle = new Triangle(new double[]{3, 4, 5});
        Circle circle = new Circle(10);


        System.out.println(square.getS());
        System.out.println(square.getPer());

        System.out.println(triangle.getS());
        System.out.println(triangle.getPer());

        System.out.println(circle.getS());
        System.out.println(circle.getPer());

        System.out.println(circle.getColor());

        System.out.println(Arrays.toString(Colors.values()));
        System.out.println(Colors.valueOf("GREEN"));

        System.out.println(circle.getColor());



    }
}