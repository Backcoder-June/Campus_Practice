package javacampus;

class Outer{

    int i = 10;
    class Inner {
        int j = 20;
        void innermethod(){
            System.out.println(j);
        }
    }

    static class Inner2{
        static int k =30;
    }

    //outer 메소드
    void outermethod(){
        class Inner3{               //지역변수로 쓰이는 이너클래스. => 이 메소드 내부에서만 사용 가능
            int n = 40;}

        Inner3 i13 = new Inner3();
    }
}


public class InnerClass {

    public static void main(String[] args) {


        //1 일반
        //2 static 이너클래스
        //3 메소드 이너클래스
        // => 목적 - 그 클래스에서만 객체로 사용하기 위해서

                         //외부클.내부클.데이터
        System.out.println(Outer.Inner2.k);      // static inner클래스는 외부,내부클래스로 객체생성없이 직접 접근 가능

        Outer out = new Outer();

//        System.out.println(Outer.Inner.);      // 일반 inner클래스는 Outer 클래스를 객체화 했어도 바로 접근 불가능
                                                    // Inner 클래스까지 객체화를 완료해야 사용 가능

//        Outer.Inner oi = new Outer.Inner();     // 이렇게 객체생성 못함. static 이너클래스일때만 이렇게 가능
                                                    // Outer 클래스만으로 Inner 클래스에 접근이 가능하기 때문

        Outer.Inner oi = out.new Inner();       // 일반 이너클래스는  Outer 클래스로 바로 접근하지 못하므로
                                                // Outer 클래스의 객체를 이용해서 => 이너클래스의 객체를 생성가능

        System.out.println(oi.j);             //이렇게 이너클래스 객체까지 생성을 완료해두면, 그걸로 이너클래스 사용 가능
        oi.innermethod();

        /*
        Outer out = new Outer();        //먼저 아우터 객체를 생성해야 inner 를 쓸 수 있다.


        Outer.Inner i1 = new Outer.Inner();

        Outer.Inner2 i2 = new Outer.Inner2();


        Outer.Inner oi = out.new Inner();        // 표현 문법 아우터가 객체 생성되야 이너를 생성할 수 있다


        out.outermethod();

        System.out.println(oi.j);
        oi.innermethod();

        // static 이너클래스 사용하기

        System.out.println(Outer.Inner2.k);
*/


    }
}
