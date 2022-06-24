package javacampus.Test;

public class BookMgr {

/**
1. 책(Book) 객체 여러 개를 저장할 수 있는 책 목록(booklist)이라는 배열을 멤버변수로 가져야 한다.
2. 책 목록(booklist)이라는 배열 변수를 초기화하는 생성자 메서드를 작성해야 한다.
3. 책 목록을 화면에 출력하는 printBookList() 메서드가 있어야 한다.
4. 모든 책 가격의 합을 출력하는 printTotalPrice() 메서드가 있어야 한다.                                    **/



    Book[] booklist;                           // Book 객체를 여러개 넣을 수 있는 배열 booklist ( 멤버변수 )

    public BookMgr(Book[] booklist){           // booklist를 초기화하는 생성자
        this.booklist = booklist; }

    public void printBooklist(){
        for (int i = 0; i<booklist.length; i++){

            System.out.println( booklist[i].getTitle());
        }
    }

    public void printTotalPrice() {
        int sum = 0;
        for (int i = 0; i< booklist.length; i++){
            int price = booklist[i].getPrice();

            sum += price;  }


        System.out.println("전체 책 가격의 합 : " + sum);

    }




}
