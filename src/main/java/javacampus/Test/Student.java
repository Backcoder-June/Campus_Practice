package javacampus.Test;

public class Student {

    String name;
    static String company = "멀티캠퍼스";           // 공유값으로 선언
    String subject;
    double eduPay;
    double extraPay;
    double refund;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", company='" + company + '\'' +
                ", subject='" + subject + '\'' +
                ", eduPay=" + eduPay +
                ", extraPay=" + extraPay +
                ", refund=" + refund +
                '}';
    }
}
