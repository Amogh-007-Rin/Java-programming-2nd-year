public class Vector {
    double x, y;

    public Vector(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Vector scale(double factor) {
        return new Vector(this.x * factor, this.y * factor);
    }

    public Vector subtract(Vector other) {
        return new Vector(this.x - other.x, this.y - other.y);
    }

    public double length() {
        return Math.sqrt(x * x + y * y);
    }

    public Vector add(Vector other) {
        return new Vector(this.x + other.x, this.y + other.y);
    }

    public void printVector() {
        System.out.println("Vector x: " + x + ", y: " + y);
        System.out.println("Vector length: " + length());
    }

    public static void main(String[] args) {
        Vector v1 = new Vector(3, 4);
        Vector v2 = new Vector(1, 2);

        v1.printVector();
        v2.printVector();

        Vector v3 = v1.add(v2);
        v3.printVector();

        Vector v4 = v1.subtract(v2);
        v4.printVector();

        Vector v5 = v1.scale(2);
        v5.printVector();
    }
}