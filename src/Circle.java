public class Circle extends Figure implements Colored {
    public double radius;
    public Colors color;
    Circle(double radius) {
        this.color = Colors.getRandColor();
        this.radius = radius;
        sidesNum = 1;
        sidesLen = new double[]{2*Math.PI * radius};
    }

    @Override
    public double getS() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public Colors getColor() {
        return Colors.getRandColor();
    }
}
