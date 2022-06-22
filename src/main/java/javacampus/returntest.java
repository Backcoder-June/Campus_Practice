package javacampus;

public class returntest {

    public static void m() {
        System.out.println("시작1");
        if(true){return;}                         // 되돌아가. 이 메소드 불렀던 곳으로. 메소드의 남은 부분 실행하지 않아도돼.
        System.out.println("종료2");              // return 도 이동문 이다.


    }


    public static void main(String[] args) {
        System.out.println("시작");
        m();
        System.out.println("종료");

//1과 100사이의 수중 3배수의 총합 출력하기


        int gdsum = 0;
        int gd = 1;

        while (gd<100) {
            if (gd % 3 == 0) {
                gdsum = gdsum + gd;
            }
            gd++;
        }

        System.out.println(gdsum);




// 자연수    / su 가 소수인지 판별해라/ 1과 자기자신으로만 나누어지는 수
        int su = 31;
        int num = 0;

        for (int x = 1; x<=su; x++){
            if (su % x == 0){
                num += 1;}
        }
        if (num == 2){
            System.out.println(su + "은 소수 입니다.");
        }else {
            System.out.println(su+"은 소수가 아닙니다.");
        }


        int[] array = new int[5];
        array[0] = 10;
        array[1] = 20;
        array[2] = 30;
        array[3] = 40;
        array[4] = 50;

        System.out.println(array[2]+"2번값");

        for (int bb: array
             ) {
            System.out.println(bb);

        }

        for (int y = 0; y<array.length; y++){
            System.out.print(array[y] + "\t");
        }


        System.out.println();
        int[] ar = new int[10];

        int min = 200;
        int max = 0;
        for (int z = 0; z<ar.length; z++){
            ar[z] = (int)(Math.random()*100)+1;
        if (ar[z]>max){
            max = ar[z];
        }
        if (ar[z]<min){
            min = ar[z];
        }
        }


        int sum = 0;
        double avg = 0;
        for (int arp: ar
             ) {
            System.out.println(arp);
            sum += arp;
            avg = sum / (double) ar.length;
        }
            //1등


        System.out.println(sum + " 이고 " + avg);

        System.out.println("최대값"+max);
        System.out.println("최소값"+min);






//
    }
}
