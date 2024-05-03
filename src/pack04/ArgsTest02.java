package pack04;

public class ArgsTest02 {

	public void funtion1() {
		System.out.println("funtion 1");
	}
	public static void funtion2() {
		System.out.println("funtion 2");
	}
	
	public static void main(String[] args) {
		
		funtion2();
		
		int[] a = new int[5];
		
		int aVal = 0;
		int bVal = 0;
		int total = 0;
		
		String[] strAry = new String[] { "1", "2" };
		String[] strAr2 = { "1", "2" };

		if (null != strAry) {
			strAry[0] = "1";
			strAry[1] = "2";
			
			aVal = Integer.parseInt(strAry[0]);
			bVal = Integer.parseInt(strAry[1]);
		} else {
			aVal = 0;
			bVal = 0;
		}
		
		total = aVal + bVal;
		System.out.println(total);
		
	}

}
