package packdemo.demotest;

enum Season {
	봄, 여름, 가을, 겨울
}

public class EnumTest {
	
	static Season favoriteSeason = Season.봄;
	
	public static void main(String[] args) {
		
		// 열거체를 배열로 만들어 리턴
		Season[] seasonArr = Season.values();;
		favoriteSeason = Season.겨울;
		
		for (Season sea : seasonArr) {
			System.out.println(sea);
		}
		

		System.out.print("가장 좋아하는 계절은 ");
		switch (favoriteSeason) {
		case 봄 : 
			System.out.println("봄 입니다.");
			break;
		case 여름 : 
			System.out.println("여름 입니다.");
			break;
		case 가을 : 
			System.out.println("가을 입니다.");
			break;
		case 겨울 : 
			System.out.println("겨울 입니다.");
			break;
		default:
			break;
		} 
		
	}

}
