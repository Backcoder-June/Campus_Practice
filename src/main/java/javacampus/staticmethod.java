package javacampus;

public class staticmethod {

    public static void main(String[] args) {

        //숫자값 필요 하면    => 난수생성 Math.random
        //String값 필요 하면  => class configuration 에서 program arguments 이용 ( intelli j )
        //                  => 혹은 cmd 로 넣을수도 있음

        System.out.println(args[3]);

        for (String pargs: args
             ) {
            System.out.println(pargs);
        }


        System.out.println(args.length);

        System.out.println(args[1] + args[2]);
        System.out.println(Integer.parseInt(args[1]) + Integer.parseInt(args[2]));


        String f = "3.14";

        System.out.println(Double.parseDouble(f));








//
    }
}
