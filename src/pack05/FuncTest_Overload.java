package pack05;

public class FuncTest_Overload {

	public void getResult(int _n) {
		System.out.println(_n + " : int 입니다.");
	}
	public void getResult(String _n) {
		System.out.println(_n + " : String 입니다.");
	}
	public void getResult(char _n) {
		System.out.println(_n + " : char 입니다.");
	}
	public void getResult(int _n, String _str) {
		System.out.println(_n + " : int 입니다.  " + _str + " : String 입니다.");
	}

}
