package pack06;

public class AccessTest {

	private int aa = 0;
	public int bb = 0;
	int cc = 0;
	

	public void SetAa(int _aa) {
		this.aa = _aa;
	}
	public void SetBb(int _bb) {
		this.bb = _bb;
	}
	public void SetCc(int _cc) {
		this.cc = _cc;
	}
	
	public void Disp() {
		System.out.println("aa값:"+aa+"\nbb값:"+bb+"\ncc값:"+cc);
	}
 	
	public static void main(String[] args) {
		
		AccessTest at = new AccessTest();
		
		at.SetAa(20);
		at.SetBb(30);
		at.SetCc(40);
		
		at.Disp();
		
	}
	

}
