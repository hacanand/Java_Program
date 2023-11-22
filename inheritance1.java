
package JavaProgram;

class shape {
    double circle_r;
    double rectangle_l;
    double rectangle_b;
    double square_l;
    double triangle_b;
    double triangle_h;

    shape(double circle_r, double triangle_b, double triangle_h, double rectangle_b, double rectangle_l,
            double square_l) {
        this.circle_r = circle_r;
        this.triangle_b = triangle_b;
        this.triangle_h = triangle_h;
        this.rectangle_b = rectangle_b;
        this.rectangle_l = rectangle_l;
        this.square_l = square_l;
    }

}

class Perimeter extends shape {

    Perimeter(double circle_r, double triangle_b, double triangle_h, double rectangle_b, double rectangle_l,
            double square_l) {
        super(circle_r, triangle_b, triangle_h, rectangle_b, rectangle_l,
                square_l);

    }

    void rectangle_per() {
        double x = rectangle_l * rectangle_b;
        System.out.println("perimeter of rectangle is  " + x);
    }

    void square_per() {
        double x = square_l * square_l;
        System.out.println("perimeter of square is " + x);
    }

    void circle_per() {
        double x = 2 * 3.14 * circle_r;
        System.out.println("perimeter of circle is " + x);
    }
}

class area extends shape {

    area(double circle_r, double triangle_b, double triangle_h, double rectangle_b, double rectangle_l,
            double square_l) {
        super(circle_r, triangle_b, triangle_h, rectangle_b, rectangle_l,
                square_l);
        // super(circle_r, triangle_b, triangle_h, rectangle_b, rectangle_l,
        // square_l);

    }

    void circle_area() {
        // System.out.println(circle_r);
        double x = 3.14 * circle_r * circle_r;
        System.out.println("area of circle is " + x);

    }

    void triangle_area() {

        double x = (0.5) * (triangle_b * triangle_h);
        System.out.println("area of triangle is  " + x);
    }

    void rectangle_area() {
        // System.out.println(rectangle_b);
        double x = (rectangle_b * rectangle_l);
        System.out.println("area of rectangle is   " + x);
    }

    void square_area() {
        double x = square_l * square_l;
        System.out.println("area of square is  " + x);
    }

}

public class inheritance1 {

    public static void main(String[] args) {
        // shape sh=new shape()
        area obj1 = new area(4, 5, 56, 6, 5, 6);
        obj1.circle_area();
        obj1.triangle_area();
        obj1.square_area();

    }
}