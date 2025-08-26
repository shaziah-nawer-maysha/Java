class Shape{//Super
    double area(){
        return 0;

    }
}

class Rectangle extends Shape{
    //Area method will be overwritten
    double width,length;

    Rectangle(double width,double length){
        this.width = width;
        this.length = length;
    }
    double area(){
        return width*length;
    }
}

class Triangle extends Shape{
    double width,length;
    Triangle(double width,double length){
        this.width = width;
        this.length = length;
    }
    double area(){
        return 0.5*width*length;
    }
}


public class Polymorp {
    public static void main(String[] args) {
        Shape shape = new Shape();
        Rectangle rectangle = new Rectangle(10,10);
        Triangle triangle = new Triangle(10,10);

        System.out.println(rectangle.area());
        System.out.println(triangle.area());
    }
}