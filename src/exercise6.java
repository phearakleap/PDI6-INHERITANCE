public class exercise6 {
    public static void main(String[] args){
        Shape sh = new Shape();
        Rectangle rect = new Rectangle(1.5, 6.8);
        Circle circ = new Circle(2.5);
        Triangle tri = new Triangle(2, 1);

        System.out.printf("The area of the unknown shape is: %.3f\n", sh.area());
        System.out.printf("The area of the rectangle is: %.3f\n", rect.area());
        System.out.printf("The area of the circle is: %.3f\n", circ.area());
        System.out.printf("The area of the triangle is: %.3f\n", tri.area());

    }
}

class Shape{
    public double area(){
        return 0;
    }
}

class Rectangle{
    private double width, height;

    Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    public double area(){
        return width * height;
    }
}

class Circle extends Shape{
    private double radius;

    Circle(double radius){
        this.radius = radius;
    }

    public double area(){
        return Math.PI * radius * radius;
    }
}

class Triangle extends Shape{
    private double height, base;

    Triangle(double height, double base){
        this.height = height;
        this.base = base;
    }

    public double area(){
        return 0.5f * height * base;
    }
}