package pack05;

public class FuncTest04 {

	// 맴버 변수 = 필드
	String channelStr = "";
	int channelInt = 0;
	int volume = 0;
	
	public int channelUp(int _vol) {
		System.out.println("소리를 높이겠습니다.");
		return _vol;
	}
	public void channelDown(int _vol) {
		System.out.println("소리를" + _vol + "만큼 내립니다.");
	}
	
	public static void main(String[] args) {
		
		FuncTest04 tv = new FuncTest04();

		System.out.println("소리를" + tv.channelUp(5) + "만큼 올립니다.");
		System.out.println("===============");
		int volume = tv.channelUp(9);
		System.out.println("소리를" + volume + "만큼 올립니다.");
		System.out.println("===============");
		tv.channelDown(7);
		
	}

}
