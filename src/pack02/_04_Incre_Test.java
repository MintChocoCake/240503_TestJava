package pack02;

public class _04_Incre_Test {

	public static void main(String[] args) {
		
		int x = 10, y = 10, z = 0;
	
		System.out.println("====================");
		// y후위연산 후 전위연산
		y++;
		++y;
		System.out.println("y : " + y);
		System.out.println("====================");
		// x후위연산 z에 대입
		z = x++;
		System.out.println("x : " + x);
		System.out.println("z : " + z);
		System.out.println("====================");
		// x전위연산 z에 대입
		z = ++x;
		System.out.println("x : " + x);
		System.out.println("z : " + z);
		System.out.println("====================");
		// x전위연산 + y후위연산 의 결과값을 z 대입
		z = (++x) + (y--);
		System.out.println("x : " + x);
		System.out.println("y : " + y);
		System.out.println("z : " + z);
		
	}

}
