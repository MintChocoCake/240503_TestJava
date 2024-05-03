package packdemo.demotest;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ScanTest {

	public class Fruit {
		String name = "";
		int count = 0;
		int cost = 0;
		
		public Fruit(String _name, int _count, int _cost) {
			this.name = _name;
			this.count = _count;
			this.cost = _cost;
		}
		
	}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int fruitKind = 0;
		
		String fruitName = "";
		int fruitCount = 0;
		int fruitCost = 0;
		
		List<Fruit> fruitList = new ArrayList<>();
		
		System.out.print("과일 종류 수 : ");
		fruitKind = scan.nextInt();
		
		for (int i = 0; i < fruitKind; i++) {
			System.out.print((i + 1) + " 번째 과일 명 : ");
			fruitName = scan.next();
			
			System.out.print(fruitName + " 생산량 : ");
			fruitCount = scan.nextInt();
			
			System.out.print(fruitName + " 가격 : ");
			fruitCost = scan.nextInt();
			
			Fruit fruit = new ScanTest().new Fruit(fruitName, fruitCount, fruitCost);
			
			fruitList.add(fruit);
		}
		
		int fruitTotal = 0;
		float fruitHourAve = 0.0f;
		
		int fruitTotalCost = 0;
		float fruitHourCost = 0.0f;
		
		System.out.println("=====[통계]=====");
		
		for (Fruit fruitIter : fruitList) {
			String name = fruitIter.name;
			int count = fruitIter.count;
			int cost = fruitIter.cost;
			
			System.out.println(name + " 하루 생산량 : " + count);

			fruitTotal += count;
			fruitTotalCost += (cost * count);
		}
		
		fruitHourAve = fruitTotal / 24.0f;
		fruitHourCost = fruitTotalCost / 24.0f;
		
		System.out.println("오늘 하루 과일 총량 : " + fruitTotal);
		System.out.println("시간당 평균 : " + fruitHourAve);
		
		System.out.println("오늘 하루 수입 : " + fruitTotalCost);
		System.out.println("시급 : " + fruitHourCost);
		
		scan.close();
	}

}
