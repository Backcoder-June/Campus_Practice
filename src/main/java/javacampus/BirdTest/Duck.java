package javacampus.BirdTest;

public class Duck extends Bird{
    String name;
    int web = 2;
    @Override
    void setName(String name){
        this.name =  name;
    }
    @Override
    void fly() {
        System.out.println(this.name +"는 날지 않습니다.");

    }

    @Override
    void sing() {
        System.out.println(this.name + "가 소리내어 웁니다.");

    }

    @Override
    void printName() {
        System.out.println("오리의 이름은 "+ this.name + "입니다.");

    }

    public void swim(){
        System.out.println(this.name +"는 " +web + "개의 물갈퀴로 수영합니다." );
    }
}
