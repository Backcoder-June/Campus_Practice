package javacampus;

import java.util.Arrays;

class prac {

    public static int m1(int i) {

        if (i<0){
            return Integer.parseInt(null);
        }
        return i * i;
    }

    public static int[] ar(){
        int[] bb = {1, 2, 3};

        return bb;
    }

    public static void m45(String tx){

        String tt = " 답은 ";
        System.out.println(tt + tx);
    }


    public static Person p1(Person person){

        person.name = "홍길동";
        person.age = 12;
        return person;

    }

    public static void addint(int a, int b){

        System.out.println(a + b);
    }


}

public class Method {
    public static void main(String[] args) {

        System.out.println(prac.m1(20));

//        System.out.println(prac.m1(-1));

        prac.m45("메롱");

        System.out.println((prac.ar()));

        for (int put: prac.ar()
             ) {
            System.out.println(put);

        }


        Person pick = new Person();

        prac.p1(pick);


        System.out.println("pick = " + pick.toString());


        boolean tf = "java".equalsIgnoreCase("JAVA");
        System.out.println(tf);


        prac.addint(3,5);

        //
    }
}
