package cond;

public class If6 {

	public static void main(String[] args) {
 
		int price = 10000;
		int age = 10;
		int discount = 0;
		
		if(price >= 10000) {
			discount = discount + 1000;
			System.out.println("10000원 이상 구매, 1000원 할인 ");	
		}else if (age <= 10) {
			discount = discount + 1000;
			System.out.println("어린이 1000원 할인 ");	
		}else {
			System.out.println("할인없음 ");	
		
			
	}
		
			System.out.println("총 할인 금액 :  " + discount + "원");	
		
		if(true)//if문은 한줄만 실행할때 중괄호를 생략할수있지만 되도록이면 한줄만 있어도 중괄호 사용을 권장함
			System.out.println("if문 실행됨");
			System.out.println("if문 실행안됨 ");

	}

}
