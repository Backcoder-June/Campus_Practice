package javacampus.Ch05;

import org.w3c.dom.css.Rect;

abstract class Shape{
    String name;
    abstract void area();
    abstract void circum();}

class Cir extends Shape{

    String sh;
    int radius;
    final double pi = 3.14;
    public Cir(String sh, int radius){
        this.radius = radius;
        this.sh = sh;
    }
    public void area(){
        System.out.println(sh+" 면적 : "+radius*radius*pi);
    }
    public void circum(){
        System.out.println(sh+" 둘레 : "+radius*2*pi);
    }
}
class Rectan extends Shape{
    String shh;
    int width;
    int height;
    public Rectan(String shh, int width, int height){
        this.width = width;
        this.height = height;
    }

    public void area(){
        System.out.println(shh+" 면적 : "+width*height);
    }
    public void circum(){
        System.out.println(shh+" 둘레 : "+(width+height)*2);
    }
}


public class AbstractTest {
    public static void main(String[] args) {

        Cir c1 = new Cir("원", 5);
        Rectan r1 = new Rectan("사각형", 6, 8);
        c1.area();
        c1.circum();
        r1.area();
        r1.circum();



        //
    }
}
