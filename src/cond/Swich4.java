package cond;

public class Swich4 {

	public static void main(String[] args) {
		int grade = 2;
		//자바 14 새로운 switch
		
		int coupon = switch (grade) {
		case 1 -> 1000;
		case 2 -> 2000;
		case 3 -> 3000;
		default -> 500;
		};
		System.out.println("발급받은 쿠폰 " + coupon);
	}

}
