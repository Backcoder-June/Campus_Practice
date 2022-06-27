package javacampus.Ch05;

final class Math{
     int abs(int i){
        if(i>=0){
            return i;}
        else {
            return i * -1;}
    }
}

class MyMath {
    Math m3 = new Math();
    int abs(int i) {
        return m3.abs(i) * -1;
        }

    }



public class FinalTest {

    public static void main(String[] args) {

        MyMath m1 = new MyMath();
        int ab = m1.abs(10);
        System.out.println(ab);

        int cc = m1.m3.abs(10);
        System.out.println("cc"+cc);

        Math m2 = new Math();
        int bb = m2.abs(10);

        System.out.println(bb);



    }

}
