package javacampus;


class Circle{


    String aa = Person.nation;
    int radius;
    final double pi = 3.141592123;
    int x = 100;
    int y= 200;

}

public class Final {

    public static void main(String[] args) {

        Circle c1 = new Circle();

        c1.radius = 5;
        c1.x = c1.x*2;
        double area = c1.radius*c1.radius*c1.pi;
        System.out.println(area);

        System.out.println(Integer.MAX_VALUE);










    }
}
