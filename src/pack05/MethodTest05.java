package pack05;

public class MethodTest05 {

	public static int getStringLength(String _str) {
		return _str.length();
	}
	public static int getStringLength(String _str1, String _str2) {
		return (_str1.length() + _str2.length());
	}
	
	public static void main(String[] args) {
		
		System.out.println(getStringLength("Hello, Java!"));
		System.out.println(getStringLength("메소드호출"));
		
	}

}
