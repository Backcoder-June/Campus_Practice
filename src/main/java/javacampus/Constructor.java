package javacampus;

class Member{
    public Member(){}

    public Member(Long id, String name, double payment, String depart, String position) {
        this.id = id;
        this.name = name;
        this.payment = payment;
        this.depart = depart;
        this.position = position;
    }

    //    public Member(Long id, String name, double payment, String depart, String position) {}
    Long id;
    String name;
    double payment;
    String depart;
    String position;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPayment() {
        return payment;
    }

    public void setPayment(double payment) {
        this.payment = payment;
    }

    public String getDepart() {
        return depart;
    }

    public void setDepart(String depart) {
        this.depart = depart;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "Member{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", payment=" + payment +
                ", depart='" + depart + '\'' +
                ", position='" + position + '\'' +
                '}';
    }

    // 게터 세터

}


public class Constructor {

    public void mm() {
        Member member1 = new Member();            //기본생성자 사용 객체 생성
        member1.id = 100L;
        member1.name = "june";
        member1.depart = "IT";
        member1.payment = 1000;
        member1.position = "사원";
        System.out.println("member1 = " + member1);

        Member member2 = new Member();
        member2.id = 200L;
        member2.name = "tom";
        member2.depart = "IT";
        member2.payment = 1500;
        member2.position = "대리";
        System.out.println("member2 = " + member2);

        Member member3 = new Member(300L, "jack", 2000, "Market", null);
        member3.setPosition("과장");
        System.out.println("member3 = " + member3.toString());

        String aa = "111";
        System.out.println("2radix로 "+Integer.parseInt(aa, 2));


        member3.setId(member2.getId());
        member3.id = member2.id;
        System.out.println("메머"+member3.getId());
    }

    public static void main(String[] args) {
        Constructor constructor = new Constructor();
        constructor.mm();

    }




}
