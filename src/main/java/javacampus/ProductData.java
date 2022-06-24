package javacampus;

class MemberData{
    private String id;
    private int pw;
    private String name;
    private String addrs;
    private String phone;

//getter setter

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddrs() {
        return addrs;
    }

    public void setAddrs(String addrs) {
        this.addrs = addrs;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getPw() {
        return pw;
    }

    public void setPw(int pw) {
        this.pw = pw;
    }

    @Override
    public String toString() {
        return "MemberData{" +
                "id='" + id + '\'' +
                ", pw=" + pw +
                ", name='" + name + '\'' +
                ", addrs='" + addrs + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}

public class ProductData {
    private int code;
    private String name;
    private double price;
    private int amount;
    private String memo;

    public ProductData(int code, String name, double price, int amount, String memo) {
        this.code = code;
        this.name = name;
        this.price = price;
        this.amount = amount;
        this.memo = memo;
    }

    @Override
    public String toString() {
        return "ProductData{" +
                "code=" + code +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", amount=" + amount +
                ", memo='" + memo + '\'' +
                '}';
    }
}


