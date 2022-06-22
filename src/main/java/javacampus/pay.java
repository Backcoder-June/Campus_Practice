package javacampus;

public class pay {
    public static void main(String[] args) {


		/*
		명령행 매개변수 - 7 2 1 5 카드
		라면 7 개 음료수 2 계란 1 사과 5개 사고 카드 지불 의미
		명령행 매개변수 - 7 2 1 5 현금 010-1234-5678
		라면 7 개 음료수 2 계란 1 사과 5개 사고 현금 지불, 현금영수증폰번호 의미
		1>	라면 : 500원 : 7개 : 라면총가격
		    음료수 ..
		    계란 ...
		    사과 ....

		    총 지불 가격은 xxxx 원 입니다
		    선택하신 지불 수단은 명령행매개변수 5번째입력값 xxx 입니다
		    만약 현금이면 명령행매개변수 6번째입력값
		    현금영수증처리번호는 xxxxx 입니다
		 * */

        String product[] = {"라면", "음료수", "계란", "사과"};
        int price[] = {500 , 2500, 8000, 1000};
        int totalprice = 0;

        String paytool = "";
        int count = 1;


        System.out.println(" <"+count);
        for (int index = 0; index<product.length; index++){

            int sumprice = price[index] * Integer.parseInt(args[index]);

            totalprice += sumprice;

            System.out.println(
                    product[index] +" : " + price[index] +"원 : "+ args[index] +"개"+
                            " : "+product[index]+"총가격 " + sumprice+"원" );
        }

        System.out.println("총 지불가격은 " + totalprice +"원 입니다." ); count++;

//        paytool = args[5];
        System.out.println("   => "+ args[4]);

        if (args[4].equals("카드")){
        System.out.println("선택하신 지불수단은 "+ args[4] +"입니다");}
        else {
            System.out.println("선택하신 지불수단은 "+ args[4] +"입니다. 현금영수증 번호 : "+ args[5]);
        }



        /*totalprice = 0;
        System.out.println(" 2> ");
        for (int index = 0; index<product.length; index++){

            int sumprice = price[index] * Integer.parseInt(args[index]);
            totalprice = totalprice + sumprice;

            System.out.println(product[index] +" : " + price[index] +" : "+ args[index] +"개"+
                    " : "+product[index]+"총가격 " + sumprice+"원"  );
        }

        System.out.println("총 지불가격은 " + totalprice  );

        paytool = args[5];
        System.out.println("   => "+ paytool);

        if (paytool==args[4]){
            System.out.println("선택하신 지불수단은 "+ paytool +"입니다");}
        else {
            System.out.println("선택하신 지불수단은 "+ paytool +"입니다. 현금영수증 번호 : "+ args[6]);
        }
        */



        //
    }
}
