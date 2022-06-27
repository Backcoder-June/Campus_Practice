package javacampus.BirdTest;

public class BirdTest {
    public static void main(String[] args) {

/*
        오리(꽥꽥이)는 날지 않습니다.
                오리(꽥꽥이)가 소리내어 웁니다.
                오리(꽥꽥이)가 2개의 물갈퀴로 수영합니다.
                오리의 이름은 꽥꽥이 입니다.

                참새(짹짹)가 날아다닙니다.
        참새(짹짹)가 소리내어 웁니다.
                참새의 친구는 허수아비입니다.
        참새의 이름은 짹짹 입니다.
*/



        Duck duck = new Duck();
        Sparrow sparrow = new Sparrow();

        duck.setName("꽥꽥이");
        sparrow.setName("짹짹이");

        duck.fly();
        duck.sing();
        duck.swim();
        duck.printName();
        sparrow.fly();
        sparrow.sing();
        sparrow.makeFriend();
        sparrow.printName();





//
    }
}
