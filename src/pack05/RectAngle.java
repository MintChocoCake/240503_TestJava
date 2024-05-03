package pack05;

public class RectAngle {

	/*
	 * 사각형의 넓이를 계산하는 메소드 calculateArea 를 오버로딩 하여 가로와 세로길이, 그리고 한 변의 길이를 받아서 계산할 수 있게
	 * 만들어보세요. 사각형 넓이 계산(직사각형) = 가로 x 세로(매개변수 2개) 가로 5, 세로 3 사각형 넓이 계산(정사각형) = 한 변의
	 * 길이 x 한 변의 길이(매개변수 1개) 한 변의 길이 4
	 */

	public double calculateArea(double _d1, double _d2) {
		return (_d1 * _d2);
	}

	public double calculateArea(double _d) {
		return (_d * _d);
	}

	public static void main(String[] args) {

		RectAngle ra = new RectAngle();

		double area1 = ra.calculateArea(5.0, 3.0);
		double area2 = ra.calculateArea(4.0);
		
		System.out.println("사각형 넓이 (가로5, 세로3) : " + area1);
		System.out.println("정사각형의 넓이 (4) : " + area2);

	}

}
