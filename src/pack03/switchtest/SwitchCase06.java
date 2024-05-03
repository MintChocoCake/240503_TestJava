package pack03.switchtest;

import java.util.Random;

public class SwitchCase06 {

	public static void main(String[] args) {
		
		Random ran = new Random();
		
		int time = 9 + ran.nextInt(9);
		System.out.println("[시간 : " + time + "시]");
		System.out.print("할 일 : ");
		
		switch (time) {
		case 9: 	
			System.out.println("늦잠");
			break;
		case 10:
			System.out.println("아침 식사");
			break;
		case 11: 	
			System.out.println("씻기");
			break;
		case 12: 	
			System.out.println("눕기");
			break;
		case 13: 	
			System.out.println("점심 식사");
			break;
		case 14: 	
			System.out.println("낮잠");
			break;
		case 15: 	
			System.out.println("피방 1");
			break;
		case 16: 	
			System.out.println("피방 2");
			break;
		case 17:
			System.out.println("피방 3");
			break;
		case 18: 
			System.out.println("저녁 식사");
			break;
			
		default:
			System.out.println("계획미정");
			break;
		}

	}

}
