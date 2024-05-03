package pack01;

public class ImplicitConversion13 {

	public static void main(String[] args) {
		// 묵시적 형변환 : 작은 메모리에서 큰 메모리로 자연스럽게 형 변환(byte -> int)
		byte bNum = 10;
		int iNum = bNum;
		
		System.out.println(bNum);
		
		int iNum2 = 10;
		// byte bNum2 = iNum2; -> 큰 메모리에서 작은 메모리 변환은 에러
		
		// 묵시적 형변환 : 더 정밀한 수로 자연스럽게 암시적 형변환 (int->float)
		int i = 1;
		float f = i;

		System.out.println(f);
		
		float f2 = 1.0f;
		int i2 = (int)f2; // float->int : 묵시적 불가, 명시적 가능
		System.out.println(i2);
		
		
		
	}

}
