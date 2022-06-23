package javacampus;

public class Employee {

    private Long id;
    private String name;
    private Double payment;
    private String dept;
    private String Posit;

    public Employee(Long id, String name, Double payment, String dept, String posit) {
        this.id = id;
        this.name = name;
        this.payment = payment;
        this.dept = dept;
        this.Posit = posit;
    }

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

    public Double getPayment() {
        return payment;
    }

    public void setPayment(Double payment) {
        this.payment = payment;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getPosit() {
        return Posit;
    }

    public void setPosit(String posit) {
        Posit = posit;
    }
}
