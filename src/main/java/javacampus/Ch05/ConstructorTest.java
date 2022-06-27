package javacampus.Ch05;

class A{ int i;
A(){
   i = 100;}
}

class  B extends A{ int j;
    B(){j = 200;}
}



public class ConstructorTest {
    public static void main(String[] args) {

        B b1 = new B();
        System.out.println(b1.i);
        System.out.println(b1.j);






    }
}
