package javacampus;

public class array {

    public static void main(String[] args) {

        String[] students = {"김민국", "고민정", "하나리", "나루토", "사스케"};
        
        int[] score = new int[5];

        int max = 0;
        int min = 1000;

        String maxname = "";
        String minname = "";

        for (int a = 0; a<score.length; a++){
            score[a] = (int)(Math.random()*100)+1;

            if (score[a]>max){
                max = score[a];
                maxname = students[a];
            }
            if (score[a]<min){
                min = score[a];
                minname = students[a];

            }
        }

        for (int a = 0; a<score.length; a++){
            System.out.println(
                    students[a] + " 학생 점수는 " + score[a] + "점 입니다.\n");
    }
        System.out.println("1등은 "+maxname+ " 학생이고, 꼴등은 " + minname + "학생 입니다.");

        // 내가 한 최대 점수 학생이름 찾기
        /*for (int a = 0; a<score.length; a++){
        if (score[a] == max) {
            System.out.println("1등은 " + students[a] + " 학생으로, 점수는 " + score[a] + "점 입니다.");
           }
        }

        for (int a = 0; a<score.length; a++){
            if (score[a] == min) {
                System.out.println("꼴등은 " + students[a] + " 학생으로, 점수는 " + score[a] + "점 입니다.");
            }
        }
*/



        
        
        
        
        
        //
    }
}
