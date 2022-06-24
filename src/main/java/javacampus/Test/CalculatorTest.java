package javacampus.Test;

class Calculator{
    int num1;
    int num2;
    String operator;
    public Calculator(int num1, int num2, String operator) {
        this.num1 = num1;
        this.num2 = num2;
        this.operator = operator;  }

    public void print(){
        int result = 0;
        if (this.operator.equals("-")){
            result = this.num1 - this.num2;}
        else if (this.operator.equals("+")){
            result = this.num1 + this.num2; }
        else if (this.operator.equals("*")){
            result = this.num1 * this.num2; }
        else if (this.operator.equals("/")){
            result = this.num1 / this.num2; }

        System.out.println(this.num1 + this.operator + this.num2 + " = " + result + " 입니다.");}


}


public class CalculatorTest {

    public static void main(String[] args) {

        Calculator calc = new Calculator(100,50, "-");
        //num1 num2 operator
        calc.print(); //100 - 50 = 50 입니다

        Calculator c2 = new Calculator(100, 50, "+");
        c2.print();
        Calculator c3 = new Calculator(100, 50, "*");
        c3.print();
        Calculator c4 = new Calculator(100, 50, "/");
        c4.print();









    //
    }
}
