package javacampus;

public class primary {

    public static void main(String[] args) {


        // 자연수    / su 가 소수인지 판별해라/ 1과 자기자신으로만 나누어지는 수

/*
        int su = 31;
        int num = 0;

        for (int x = 1; x <= su; x++) {
            if (su % x == 0) {
                num += 1;
            }
        }
        if (num == 2) {
            System.out.println(su + "은 소수 입니다.");
        } else {
            System.out.println(su + "은 소수가 아닙니다.");
        }
*/




        //2~100 모든 자연수에 대하여 소수인지 판단하여 출력하시오 // 3: 소수이다 4:소수가 아니다  . . .


        for (int su =5; su<=50; su++){
            int count = 0;

            for (int dividesu = 1; dividesu <= su; dividesu++) {
                if (su % dividesu == 0) {
                    count ++;}
            }
            if ( count == 2 ) {
                System.out.println( su + " => 소수 입니다.");
            } else {
                System.out.println( su + " => 소수가 아닙니다.");
            }

        }








        //
    }
}