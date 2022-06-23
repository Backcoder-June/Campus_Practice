package javacampus;

public class TwoArrayTest {
    public static void main(String[] args) {

        //3명학생 이름 - 2,3,4과목 점수
        //각학생 총점/평균


        int[][] array2 = new int[3][];
        String[] student_name = new String[args.length];


        for (int i =0; i<array2.length; i++){

            int sum = 0;
            int avg = 0;

            System.out.println("학생이름 : "+ args[i]);

            array2[i] = new int[i + 2];

            int subject_num = array2[i].length;

            for (int j =0; j<subject_num; j++) {

                int grade = array2[i][j];
                
                grade = (int)(Math.random()*100)+1;
                System.out.print("점수 : {" + grade + "}\t");

                sum += grade;
                avg = sum / subject_num;

            }
            System.out.println("/ 총합 : "+ sum +" /  평균 : "+ avg );

        }

    }
}
