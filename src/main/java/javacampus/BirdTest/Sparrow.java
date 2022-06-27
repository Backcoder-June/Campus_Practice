package javacampus.BirdTest;

public class Sparrow extends Bird{

    String name;
    String friend;

    @Override
    void setName(String name) {
        this.name = name;
    }
    @Override
    void fly() {
        System.out.println(this.name + "가 날아다닙니다.");

    }

    @Override
    void sing() {
        System.out.println(
                this.name + "가 소리내어 웁니다."
        );

    }


    @Override
    void printName() {

        System.out.println("참새의 이름은 "+ this.name + "입니다.");
    }

    public void makeFriend() {
        this.friend = "허수아비";
        System.out.println("참새의 친구는 " + friend  + " 입니다.");
    }
}
