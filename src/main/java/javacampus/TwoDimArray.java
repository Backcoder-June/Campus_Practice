package javacampus;

public class TwoDimArray {


    public static void main(String[] args) {

        int[][] array = new int[3][2];

//        array[0][0] = 1;

        System.out.println(array.length);       //1차 배열의 개수
        System.out.println(array[0].length);    //1차배열 0번배열의 개수

        /*for (int b:array[0]
             ) {
            System.out.println(b);
        }
*/
        System.out.println("---");
        for (int i =0; i<array.length; i++){
//            System.out.println(array[i].length);    i번째 일차배열의 데이터 개수

            for (int j =0; j<array[i].length; j++) {
                array[i][j] = (int)(Math.random()*100)+1;
                System.out.println(array[i][j]);
            }
        }

        System.out.println("------");
        int[][] array2 = new int[3][];
        String[] student_name = new String[args.length];

        int sum = 0;
        int avg = 0;

        for (int i =0; i<array2.length; i++){
            System.out.println("학생이름 : "+ args[i]);
            array2[i] = new int[i + 2];
//            System.out.println(array2[i].length);
            for (int j =0; j<array2[i].length; j++) {
                array2[i][j] = (int)(Math.random()*100)+1;
                System.out.print("점수 : {" + array2[i][j]+"}\t");

                sum = sum+array2[i][j];
                avg = sum / array2[i].length;

            }
            System.out.println("/ 총합 : "+ sum +" /  평균 : "+ avg );

            sum =0;
            avg =0;
        }







     //
    }
}
