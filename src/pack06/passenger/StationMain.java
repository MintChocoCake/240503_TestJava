package pack06.passenger;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StationMain {

	public static void printPassList(List<PassengerInfo> _passList) {
		System.out.println("======[승객목록]=====");
		for (int i = 0; i < _passList.size(); i++) {
			System.out.print("[" + i + "] ");
			_passList.get(i).print();
		}
		System.out.println("================");
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		List<PassengerInfo> passengerList = new ArrayList<PassengerInfo>();

		boolean run = true;

		while (run) {
			String name = "";
			int money = 0;

			System.out.println("=====[메뉴]=====");
			System.out.println("[1]승객입력 [2]승객목록 [3]승객삭제 [0]종료");
			System.out.print("입력 : ");
			int selectNum = Integer.parseInt(sc.nextLine());

			switch (selectNum) {
			case 0:
				run = false;
				break;

			case 1:
				while (true) {
					System.out.println("[승객 입력]");
					System.out.print("이름 : ");
					name = sc.nextLine();
					System.out.print("money : ");
					money = Integer.parseInt(sc.nextLine());
					if (0 > money) {
						System.out.println("[승객 입력] 입력요류");
						continue;
					} else {
						PassengerInfo addPassenger = new PassengerInfo(name, money);
						passengerList.add(addPassenger);
						break;
					}
				}
				break;

			case 2:
				System.out.println("[승객 목록]");
				printPassList(passengerList);
				break;

			case 3:
				if (passengerList.isEmpty()) {
					System.out.println("승객이 없습니다.");
					break;
				}
				while (true) {
					System.out.println("[승객 목록]");
					printPassList(passengerList);

					System.out.println("[승객 삭제]");
					System.out.print("삭제할 Index : ");
					int deleteIndex = Integer.parseInt(sc.nextLine());

					if (0 > deleteIndex || passengerList.size() <= deleteIndex) {
						System.out.println("[탑승객 삭제] 입력요류");
						continue;
					} else {
						passengerList.remove(deleteIndex);
						break;
					}
				} // while
				break;

			default:
				break;
			}
		}

		run = true;

		Bus bus = new Bus(55);
		Subway sub = new Subway(1);
		PassengerInfo mainPassenger = null;

		while (run) {
			printPassList(passengerList);
			System.out.print("[승객선택 | 종료 : -1] : ");
			int passengerIndex = Integer.parseInt(sc.nextLine());

			if (-1 == passengerIndex) {
				System.out.println("[종료]");
				break;
			} else if (0 > passengerIndex || passengerList.size() <= passengerIndex) {
				System.out.println("[잘못된 입력]");
				continue;
			}

			mainPassenger = passengerList.get(passengerIndex);
			System.out.println("[선택한 승객]");
			mainPassenger.print();

			System.out.println("=====[탑승 메뉴]=====");
			System.out.println("[1]버스 [2]지하철 [3]승객선택 [0]종료");
			System.out.print("입력 : ");
			int selectNum = Integer.parseInt(sc.nextLine());

			switch (selectNum) {
			case 0:
				System.out.println("[종료]");
				run = false;
				break;

			case 1:
				while (true) {
					System.out.println("[버스 | 0 : 이전]=====");
					System.out.println("[1]아동 : " + bus.getCost(Bus.AgeRange.아동));
					System.out.println("[2]청소년 : " + bus.getCost(Bus.AgeRange.청소년));
					System.out.println("[3]성인 : " + bus.getCost(Bus.AgeRange.성인));
					System.out.println("[4]노인 : " + bus.getCost(Bus.AgeRange.노인));
					
					System.out.print("입력 : ");
					int busRange = Integer.parseInt(sc.nextLine());
					
					switch (busRange) {
					case 0: 
						System.out.println("[이전]");
						break;
						
					case 1:
						mainPassenger.takeBus(bus, Bus.AgeRange.아동);
						break;
						
					case 2:
						mainPassenger.takeBus(bus, Bus.AgeRange.청소년);
						break;
						
					case 3:
						mainPassenger.takeBus(bus, Bus.AgeRange.성인);
						break;
						
					case 4:
						mainPassenger.takeBus(bus, Bus.AgeRange.노인);
						break;
						
					default:
						break;
					} // switch
					
					break;
				} // while
				break;

			case 2:
				while (true) {
					System.out.println("[지하철 | 0 : 이전]=====");
					System.out.println("[1]아동 : " + sub.getCost(Subway.AgeRange.아동));
					System.out.println("[2]청소년 : " + sub.getCost(Subway.AgeRange.청소년));
					System.out.println("[3]성인 : " + sub.getCost(Subway.AgeRange.성인));
					System.out.println("[4]노인 : " + sub.getCost(Subway.AgeRange.노인));
					
					System.out.print("입력 : ");
					int subRange = Integer.parseInt(sc.nextLine());
					
					switch (subRange) {
					case 0: 
						System.out.println("[이전]");
						break;
						
					case 1:
						mainPassenger.takeSubway(sub, Subway.AgeRange.아동);
						break;
						
					case 2:
						mainPassenger.takeSubway(sub, Subway.AgeRange.청소년);
						break;
						
					case 3:
						mainPassenger.takeSubway(sub, Subway.AgeRange.성인);
						break;
						
					case 4:
						mainPassenger.takeSubway(sub, Subway.AgeRange.노인);
						break;
						
					default:
						break;
						
					} // switch
					break;
				} // while
				break;

			case 3:
				System.out.println("[승객선택]");
				continue;

			default:
				break;
			}

		}

		sc.close();

	} // main

} // class
