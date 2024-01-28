package cond.ex;

public class ExchangeRateEx {

	public static void main(String[] args) {
		int dollar = 10;
		int won = 1300;
		
		if(dollar < 0) {
			System.out.println("dollar: " + dollar + "\n잘못된 금액입니다.");
		}else if(dollar == 0) {
			System.out.println("dollar: " + dollar + "\n환전할 금액이 없습니다.");
		}else  {
			System.out.println("dollar: " + dollar + "\n환전된 금액은 "+ (dollar * won) +"입니다 ." );
	
		}

	}

}
