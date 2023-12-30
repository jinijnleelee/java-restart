package operator;

public class Logical1 {

	public static void main(String[] args) {
		//논리연산자 
		System.out.println("&&: AND 연산");
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && false);
		
		System.out.println("||: or 연산");
		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(false || false);
		
		
		System.out.println("! 연산");
		System.out.println(!true);
		System.out.println(!false);

		System.out.println("변수 활용");
		boolean a = true;
		boolean b = false;
		System.out.println(a && b);
		System.out.println(a || b);
		System.out.println(!a);
		System.out.println(!b);
		
		//즉 &&는 모두 참일때 참 
		//  ||는 하나라도 참일때 참
		
		
		
		
		
		
		
		
		
		
	}

}
