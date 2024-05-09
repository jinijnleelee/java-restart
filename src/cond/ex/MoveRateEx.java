package cond.ex;

public class MoveRateEx {

	public static void main(String[] args) {
		double rating =7.1;
		//9이상

		if(rating <= 9) {
			System.out.println("rating: " + rating + "\n'어바웃타임' 을 추천합니다");
			//9미만 8이하
		}if(rating <= 8) {
			System.out.println("rating: " + rating + "\n'토이 스토리'를 추천합니다.");
			//8이상 7미만 
		}if(rating <= 7){
			System.out.println("rating: " + rating + "\n'고질라'를 추천합니다." );
	
		}

	}

}
