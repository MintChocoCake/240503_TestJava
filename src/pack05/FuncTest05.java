package pack05;

public class FuncTest05 {

	public final int MAX_VOL = 10;
	public final int MIN_VOL = 0;
	
	public String channelName = "";
	public int channelInt = 0;
	public int volume = 0;
	
	public FuncTest05(String _name) {
		channelName = _name;
	}
	
	public int volumeUp(int _volume) {
		System.out.println("소리를 " + _volume + "만큼 높입니다.");
		
		return volume += _volume;
	}
	public int volumeDown(int _volume) {
		System.out.println("소리를 " + _volume + "만큼 내립니다.");
		
		return volume -= _volume;
	}
	public void print() {
		System.out.println("===============");
		System.out.println("channelName : " + this.channelName);
		System.out.println("channelInt : " + this.channelInt);
		System.out.println("volume : " + this.volume);
		System.out.println("===============");
	}
	
	// 재귀
	public void volumMax() {
		if (MAX_VOL > this.volume) {
			System.out.println("소리를 높입니다. 현재볼륨 : " + (++this.volume));
			volumMax();
		}
	}
	public void volumMin() {
		if (MIN_VOL < this.volume) {
			System.out.println("소리를 낮춥니다. 현재볼륨 : " + (--this.volume));
			volumMin();
		}
	}
	
	
	public static void main(String[] args) {
		
		FuncTest05 tv = new FuncTest05("네셔널지오그래픽");
		
		int curVolume = 0;
		
		curVolume = tv.volumeUp(6);
		System.out.println("현재 볼륨 : " + curVolume);
		curVolume = tv.volumeDown(4);
		System.out.println("현재 볼륨 : " + curVolume);

		tv.print();
		
		tv.volumMax();
		tv.volumMin();
		
	}

}
