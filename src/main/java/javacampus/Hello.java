package javacampus;

import org.w3c.dom.ls.LSOutput;





public class Hello {

    class test{
        int booknum = 100;
        int stnum = 22;

        String sdf = "1명의 학생당 "+ (int)(booknum/stnum)+"권씩 가질 수 있습니다. " +
                "\n남아있는 책은 " + (booknum%stnum)+ "권 입니다. ";
        String fdfa = "나워줄 수 없습니다";

    }


    public static void main(String[] args) {

        System.out.println("오늘부터 ai플랫폼 활용      웹서비스개발과정을 시작하였습니다. " +
                "\n오늘은 2022-06-20 입니다. \n잘 부탁드립니다.");



        boolean check = 10 < 5;

        System.out.println("result : " + check);

        if (check == true){
            System.out.println("yes it is! conglaturation!");
        }
        else {
            System.out.println("nope! try again!");
        }


        int a = 100;
        int b = 300;

        Integer.toString(a);
//        Integer.parseInt(b);
//        System.out.println(a+b);

        System.out.println("result = " + (a + b));
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        char d = 'A';

        int e = 70;
        System.out.println("문자랑 숫자 더하기= " + (b + d));

        System.out.println((char)e);
        System.out.println(d);

        System.out.println(a +""+ d);

        int i = 10;
        i = i*i;

        i+=50;
        System.out.println(i);


        byte cd= 127;

        int dd = cd;

        dd = dd+100;

        double ee = dd;

        System.out.println(dd+""+ee);


        int iu = 330;
         double ccc = (double)iu;

        System.out.println(ccc);

        double pi = 3.141592;
        int pipi = (int)pi;
        System.out.println(pipi);

        int x = 200;
        byte y = (byte) x;
        System.out.println(y);


        char pp = 'a';

        System.out.println((char)(pp-32));

        long zz = 2001993343103L;
        int ww = (int)zz;
        System.out.println(ww);

        System.out.println(Integer.MAX_VALUE);

        int pq = 10/3;
        long ppq = 10/3;

/////////////////////// test //////////////////////////
//1
        System.out.println("------여기부터 TEST 시작---------");


        int sample = 123;

        System.out.println(((int)(sample/100))*100);

        //int 끼리 나누기 하면 int 만 나옴. 123/100 = 1 // 즉, 강제형변환 (int) 를 할 필요가 없음



//2
        int booknum = 98;
        int stnum = 12;
/*

               if (booknum>=stnum) {
                System.out.println("1명의 학생당 "+ (int)(booknum/stnum)+"권씩 가질 수 있습니다.");
                System.out.println("남아있는 책은 " + (booknum%stnum)+ "권 입니다.");}
               else {
                   System.out.println("나눠줄 수 없습니다.");
               }
*/


        int divide = booknum/stnum;
        int remainder = booknum%stnum;


            String BB = (booknum>=stnum) ?
                       "1명의 학생당 "+ divide +"권씩 가질 수 있습니다. " +                //형변환 필요없다
                               "\n남아있는 책은 " + remainder + "권 입니다. ":
                       "나워줄 수 없습니다";

                  System.out.println(BB);





    //3
               int up = 11;
               int down = 15;
               int height = 12;

        System.out.println((double)((up+down)*height/1.1));

//4
        int input=21;
           String S = input %3 == 0 && input %7 == 0 ?
                input + " 은 3의 배수이면서 7의 배수이다" :
                input + " 은 3의 배수이면서 7의 배수가 아니다";

        System.out.println(S);


//5

           int aaa= 10;
           int bbb= 20;
           aaa = bbb;
        System.out.println(aaa);
        bbb = 10;
        System.out.println(bbb);

        int qa = 10;
        int qb = 20;
        int c = qa;
        qa = qb;
        System.out.println("답"+c+"qa는"+qa);
        int cc = qa;
        System.out.println("cc" + cc);



//6
        String name = "이자바";
        int java = 100;
        int db = 77;
        int Spring = 89;

        int sum = java + db + Spring;

        double avg = ((sum)/(double)3);

        System.out.println(sum);
        System.out.println(avg);
        //
    }
}
