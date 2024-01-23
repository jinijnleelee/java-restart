package cond;

public class If1 {
	
	public static void main(String[] args) {
		
		int age = 20; //사용자 나이
		//if문은 특정조건이 참일때만 특정코드를 실행한다 
		if(age >= 18) {
			System.out.println("성인입니다. ");
		}
		
		if(age < 18) {
			System.out.println("미성년자입니다. ");
		}
		
		
	}

}
