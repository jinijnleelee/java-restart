package cond.ex;

public class DistanceEx {

	public static void main(String[] args) {
			int distance = 150;
		
		if(distance <= 1) {
			System.out.println("distance: " + distance + "\n도보를 이용하세요.");
		}else if(distance <= 10) {
			System.out.println("distance: " + distance + "\n자전거를 이용하세요.");
		}else if(distance <= 100) {
			System.out.println("distance: " + distance + "\n자동차를 이용하세요.");
	
		}else {
			System.out.println("distance: " + distance + "\n비행기를 이용하세요.");
		}

	}

}
