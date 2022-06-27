package javacampus.Ch05;

class Employee{
    private int id;
    String name;
    double pay;

    public void emp(){
        System.out.print(id + " " + name+ " " + pay);
    }

    public int getId(){
        return this.id;
    }
    public void setId(int id){
        this.id = id;
    }
}

class Manager extends Employee{

    String dept;

    @Override
    public void emp() {
        super.emp();
        System.out.println(" "+dept);
    }

    @Override
    public String toString() {
        return "Manager{" +
                "dept='" + dept + '\'' +
                ", id=" + getId() +
                ", name='" + name + '\'' +
                ", pay=" + pay +
                '}';
    }
}

public class ManagerTest {

    public static void main(String[] args) {


        Manager m1 = new Manager();

        m1.setId(200);
        m1.name = "길동이";
        m1.pay = 34500.99;
        m1.dept = "IT";

        m1.emp();
        System.out.println("m1 = " + m1.toString());



    }
}
