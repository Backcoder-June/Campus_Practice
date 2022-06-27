package javacampus.BirdTest;

public abstract class Bird {

    String name;
    int legs;
    double length;

    abstract void fly();
    abstract void sing();
    abstract void setName(String name);
    abstract void printName();



}
