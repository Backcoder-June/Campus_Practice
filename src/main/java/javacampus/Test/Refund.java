package javacampus.Test;

public class Refund {

    public static void main(String[] args) {

        Student student = new Student();
                                                        // 이자바 JSP프로그래밍 50000 5000
        student.name = args[0];
        student.subject = args[1];
        student.eduPay = Integer.parseInt(args[2]);
        student.extraPay = Integer.parseInt(args[3]);          /**부가금은 값을 받은 후 수정불가로 만드시오.**/

        final double fixed_extraPay = student.extraPay;

        //환불금 계산기

        if (args[1].equals("자바프로그래밍")){
            student.refund = student.eduPay * (25 / (double)100) + fixed_extraPay;
        } else if (args[1].equals("JDBC프로그래밍")) {
            student.refund = student.eduPay * (20 / (double)100) + fixed_extraPay;
        } else if (args[1].equals("JSP프로그래밍")) {
            student.refund = student.eduPay * (15 / (double)100) + fixed_extraPay;
        } else {
            System.out.println("잘못 입력되었습니다."); return;                       // 오류나면 정지
        }

        System.out.println(
           " 이름 : "+ student.name + "\n 소속 : " + student.company + "\n 과목 : " + student.subject +
                    "\n 교육비 : " + (int)student.eduPay + "원\n 부과금 : " + (int)fixed_extraPay + "원\n 환불금 => "
                   + (int)student.refund + "원"
        );


        //
    }
}
