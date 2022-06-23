package javacampus;


class ss{

    String aa = Person.nation;
    String bb = Person.m();


}

class Person{
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", nation='" + nation + '\'' +
                '}';
    }

    public static String m( ){
        return null;
    }

    String name;
    int age;
    static String nation;
}

public class Static {


    public static void main(String[] args) {

        Person p1 = new Person();

        p1.name = "김한국";
        p1.age = 27;

        System.out.println("p1 = " + p1.toString());

        Person p2 = new Person();

        p2.name = "박중국";
        p2.age = 23;

        System.out.println("p2 = " + p2.toString());





    }

}
