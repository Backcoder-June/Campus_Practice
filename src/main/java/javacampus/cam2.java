package javacampus;

public class cam2 {

    public static void main(String[] args) {


        char c1 = '1';

        System.out.println((int) c1);


        int pa = 21;
        if (pa % 3 == 0) {
            if (pa % 7 == 0) {
                System.out.println(pa + "는 3의 배수이면서 7의 배수입니다");
            } else {
                System.out.println(pa + "는 3의배수지만 7의 배수는 아닙니다");
            }

        } else if (pa % 7 == 0) {
            System.out.println(pa + "는 7의배수지만 3의배수는 아닙니다");

        } else {
            System.out.println(pa + "는 3의 배수도, 7의 배수도 아닙니다.");
        }


        int grade = 69;
        if (grade >= 90) {
            System.out.println(grade + "점으로 A 입니다.");
        } else if (grade >= 80 && grade < 90) {
            System.out.println(grade + "점으로 B 입니다.");
        } else if (grade >= 70 && grade < 80) {
            System.out.println(grade + "점으로 C 입니다.");
        } else {
            System.out.println(grade + "점으로 F 입니다. 재수강 하세요.");
        }


        int gr = 99;

        switch (gr) {
            case 1:
                if (gr >= 90) {
                    System.out.println(" A 입니다");break;
                }
            case 2:
                if (gr >= 80 && gr < 90) {
                    System.out.println(" B 입니다");break;
                }
            case 3:
                if (gr >= 70 && gr < 80) {
                    System.out.println(" C 입니다");break;
                }
        }


        System.out.println(Math.random());  //0.0000~~0.99999999
                                            // 0.0000~ 5.999999
        int random = (int)(Math.random()*6)+1;

        System.out.println(random);

        int Kor = (int) (Math.random() * 100) + 1;
        int Eng = (int) (Math.random() * 100) + 1;
        int mat = (int) (Math.random() * 100) + 1;

        int avg = (Kor+Eng+ mat)/3;
        System.out.println("국어는 "+ Kor + "점, 영어는 "+ Eng + "점, 수학은 "+ mat + "점, 평균 "+ avg + "점입니다.");

        String glad = "";
        int avg2 = avg/10;

        switch (avg2){
            case 10 :
            case 9 :
                glad = "A"; break;
            case 8 :
            case 7 :
                glad = "B";break;
            case 6 :
            case 5 :
                glad = "C";break;
            default:
                glad = "F";
        }

        System.out.println("랜덤 학점 : "+glad);





        int month = (int) (Math.random() * 6) + 1;

        int day = 0;

        switch(month){

            case 1 : day = 31; break;
            case 2 : day = 28; break;
            case 3 : day = 31; break;
            case 4 : day = 30; break;
            case 5 : day = 31; break;
//            case 6 : day = 30; break;
            default:
                System.out.println("없는 달 입니다.");
        }
        System.out.println(month + "월은" + day + "만큼 있습니다.");
/*

        String grad = "";

        int score = (int)(Math.random()*100)+1;

        switch (score){
            case 1 : if(score>=90){
                grad = "A";}
            case 2 : if(score>=80 && score<90){
                grad = "B";
            }
            case 3 : if (score>=70 && score<80){
                grad = "C"; }
            case 4 : if (score<70){
                    grad = "F";
                }
        }
        System.out.println( score+ "점으로 " + grad + "학점 입니다.");

*/

        String mt = "1월";
        String dy = "";

        switch (mt){
            case "1월" :
                dy = "31일";
        }

        System.out.println(dy+"스트링");



        //반복문

        int sum = 0;
        for (int a=1; a<=10; a++){
            System.out.println(a);
            sum += a;
            System.out.println("sum : "+sum);
        }
        System.out.println(sum);

        int sum2 = 0;
        int a = 1 ;
        while (a<=11){
            sum2 += a;
            a++;
        }
        System.out.println("while섬: "+ sum2);

        int sum3 = 0;
        int b =  1 ;
        do{ sum3 += b; b++; } while (b<=9);

        System.out.println("dowhile 섬 : "+sum3);


        int su = (int) (Math.random() * 50) + 1;

        while (su%10!=0){
            System.out.println(su);
            su = (int) (Math.random() * 50) + 1;
        }

        for (int aa = 1; aa<=9; aa++){
            for (int bb = 1; bb<=9; bb++){
                System.out.println(aa + "X" + bb + "=" + aa*bb);
            }

        }

        for (int cc = 1; cc<=9; cc++){
            for (int dd = 1; dd<=9; dd++){

                System.out.print(dd + "X" + cc+ "=" + cc*dd + "\t");
            }
            System.out.println();
        }

        int lines = 5;
        for (int ff=1; ff<=5; ff++){
            for (int pp =1; pp<=ff; pp++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("=======================");

        for (int ff=1; ff<=5; ff++){
            for (int pp=5; pp>=ff; pp--)
            {
                System.out.print("*");
            }
            System.out.println();
        }







        //Dicetest
        // 주사위 2개 던져서 각 눈의 숫자 출력, 합 출력, 이 때, 눈의 합이 5가 되면 중단하기.

//내가 만든 do wile 문

      /*  int dice1;
        int dice2;
        int ssum;
        do {

            dice1 = (int) (Math.random() * 6) + 1;
            dice2 = (int) (Math.random() * 6) + 1;

            ssum = dice1 + dice2;

            if (dice1 + dice2 == 5) {
                System.out.println("첫주사위 : "+dice1 +", 두번째주사위 :  "+ dice2+", 합 = 5 GAME OVER!");
            }
            else {System.out.println("첫주사위 : " + dice1 + ", 두번째주사위 : " + dice2 + ", 합 = " + ssum);}


        } while (ssum != 5);
*/

        System.out.println("============================");

        //true 로 주고 break 활용하기

        while (true){
             int dice1 = (int) (Math.random() * 6) + 1;
             int dice2 = (int) (Math.random() * 6) + 1;
             int ssum = dice1 + dice2;


            if (dice1 + dice2 == 5) {
                System.out.println("첫주사위 : "+dice1 +", 두번째주사위 :  "+ dice2+", 합 = 5 GAME OVER!");break;
            }
            else {System.out.println("첫주사위 : " + dice1 + ", 두번째주사위 : " + dice2 + ", 합 = " + ssum);}
        }


        // 그냥 while 문 만으로는 만들기가 어렵네

/*
        while (true){
            int dice3 = (int) (Math.random() * 6) + 1;
            int dice4 = (int) (Math.random() * 6) + 1;

            int dicesum = dice3 + dice4;


            if (dicesum == 5) {
                System.out.println( dice3 + " + " + dice4 + " = " + dicesum+ "Gameover");break;}
            else {
                System.out.println( dice3 + " + " + dice4 + " = " + dicesum);
            }


        }
*/





        /*
        while (true) {


            if(sum != 5){}
            else{break;}
        }

        System.out.println();



        while (true) {


            if(sum == 5){
                System.out.println("끝");
                break;
            }
        }
*/









        //
    }
    }

