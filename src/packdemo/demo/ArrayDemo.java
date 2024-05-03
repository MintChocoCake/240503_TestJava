package packdemo.demo;

import java.util.Scanner;

public class ArrayDemo {

	final static int MAX_HEIGHT = 10;
	final static int MAX_WIDTH = 10;

	final static String FLOOR = "□"; // 바닥
	final static String WALL = "■"; // 벽
	final static String PIECE = "●"; // 말
	final static String EXIT = "▣"; // 출구
	
	private String[][] boardAry = new String[MAX_HEIGHT][MAX_WIDTH];
	
	// 출구 좌표
	private int exitX = 9;
	private int exitY = 9;
	
	private int wallCount = 0;
	private int[] wallX = null;
	private int[] wallY = null;
	
	private int wallNum = 0;
	
	// Wall
	public void initWall(int _count) {
		wallCount = _count;
		wallX = new int[_count];
		wallY = new int[_count];
		wallNum = 0;
	}
	public void setWall(int _x, int _y) {
		if (wallCount <= wallNum) {
			System.out.println("벽 개수 초과.");
			return;
		}
		
		System.out.print("[현재 벽 수 : " + (wallNum) + " / " + wallCount + " ]  ");
		System.out.println("wallX : " + _x + " wallY : " + _y);
		
		wallX[wallNum] = _x;
		wallY[wallNum] = _y;
		wallNum++;
	}
	public boolean isWall(int _x, int _y) {
		for (int i = 0; i < wallCount; i++) {
			if ((0 != _x && 0 != _y) && wallX[i] == _x && wallY[i]== _y) {
				//System.out.println("[벽 입니다]");
				return true;
			}
		}
		return false;
	}
	// move
	public int moveLeft(int _x, int _y) {
		int prevX = _x;
		System.out.println("[좌로 이동]");
		if (0 < _x && (MAX_WIDTH - 1) >= _x) {
			_x--;
			if (isWall(_x, _y)) {
				return prevX;
			} else {
				return _x;
			}
		}
		return _x;
	}
	public int moveRight(int _x, int _y) {
		int prevX = _x;
		System.out.println("[우로 이동]");
		if (0 <= _x && (MAX_WIDTH - 1) > _x) {
			_x++;
			if (isWall(_x, _y)) {
				return prevX;
			} else {
				return _x;
			}
		}
		return _x;
	}
	public int moveUp(int _x, int _y) {
		int prevY = _y;
		System.out.println("[위로 이동]");
		if (0 < _y && (MAX_HEIGHT - 1) >= _y) {
			_y--;
			if (isWall(_x, _y)) {
				return prevY;
			} else {
				return _y;
			}
		}
		return _y;
	}
	public int moveDown(int _x, int _y) {
		int prevY = _y;
		System.out.println("[아래로 이동]");
		if (0 <= _y && (MAX_HEIGHT - 1) > _y) {
			_y++;
			if (isWall(_x, _y)) {
				return prevY;
			} else {
				return _y;
			}
		}
		return _y;
	}
	// Exit
	public boolean setExit(int _x, int _y) {
		if (0 > _x || (MAX_HEIGHT - 1) < _x  
				|| 0 > _y || (MAX_HEIGHT - 1) < _y) {
			System.out.println("setExit Error");
			return false;
		}		
		exitX = _x;
		exitY = _y;
		
		return true;
	}
	public boolean isExit(int _x, int _y) {
		if (_x == exitX && _y == exitY) {
			return true;
		}
		return false;
	}
	
	// Bord
	public void setBord(int _x, int _y) {
		for (int i = 0; i < MAX_HEIGHT; i++) {
			for (int j = 0; j < MAX_WIDTH; j++) {
				if (isExit(j, i)) { // 출구
					boardAry[i][j] = EXIT;
				} else if (isWall(j, i)) { // 벽
					boardAry[i][j] = WALL;
				} else if (i == _y && j == _x) { // 현재위치
					boardAry[i][j] = PIECE;
				} else { // 바닥
					boardAry[i][j] = FLOOR;
				}
			}
		}
		
	}
	public void printBord(int _x, int _y) {
		for (int i = 0; i < MAX_HEIGHT; i++) {
			for (int j = 0; j < MAX_WIDTH; j++) {
				// index = (i * MAX_WIDTH) + j;
				
				if (isExit(j, i)) { // 출구
					boardAry[i][j] = EXIT;
				} else if (isWall(j, i)) { // 벽
					boardAry[i][j] = WALL;
				} else if (i == _y && j == _x) { // 현재위치
					boardAry[i][j] = PIECE;
				} else { // 바닥
					boardAry[i][j] = FLOOR;
				}
				
				System.out.print(boardAry[i][j] + " ");
			}
			System.out.println();
		}
		
	}
	
	
	public static void main(String[] args) {
		
		ArrayDemo arrDemo = new ArrayDemo();
		Scanner sc = new Scanner(System.in);

		int inputExitX = 0;
		int inputExitY = 0;
		
		while (true) {
			System.out.print("출구 x : ");
			inputExitX = sc.nextInt();
			
			System.out.print("출구 y : ");
			inputExitY = sc.nextInt();
			
			if (arrDemo.setExit(inputExitX, inputExitY)) {
				break;
			} 
			
		}
		arrDemo.printBord(0, 0);
		
		// 벽 세팅
		int intputWallCount = 0;
		int inputWallX = 0;
		int inputWallY = 0;

		while (true) {
			System.out.print("벽 개수 : ");
			intputWallCount = sc.nextInt();
			
			if ((0 >= intputWallCount) &&  
				((MAX_HEIGHT - 1) * (MAX_WIDTH - 1) <= intputWallCount)) {
				System.out.println("잘못된 입력입니다.");
			} else {
				arrDemo.initWall(intputWallCount);
				break;
			}
		}
		
		for (int i = 0; i < intputWallCount; i++) {
			System.out.println("[" + i + " / " + intputWallCount + "]");
			System.out.print("벽 x : ");
			inputWallX = sc.nextInt();
			
			if (0 > inputWallX || (MAX_WIDTH - 1) < inputWallX) {
				System.out.println("잘못된 입력입니다.");
				i--;
				continue;
			}
			
			System.out.print("벽 y : ");
			inputWallY = sc.nextInt();
			
			if (0 > inputWallY || (MAX_HEIGHT - 1) < inputWallY) {
				System.out.println("잘못된 입력입니다.");
				i--;
				continue;
			}
			
			arrDemo.setWall(inputWallX,inputWallY);
			arrDemo.printBord(0, 0);
		}
		
		int x = 0;
		int y = 0;
		boolean run = true;

		while (true == run) {
			arrDemo.printBord(x, y);
			
			if (arrDemo.isExit(x, y)) {
				System.out.println("출구 발견 ! 탈출 !");
				run = false;
			}
			
			System.out.println("=====[미로찾기]=====");
			System.out.println("[4]left [6]right [8]up [2]down [0]end");
			System.out.print("명령 선택 : ");
			int inputNum = sc.nextInt();
			
			switch (inputNum) {
			case 0:
				run = false;
				System.out.println("종료.");
				break;
			case 4:
				x = arrDemo.moveLeft(x,y);
				break;
			case 6:
				x = arrDemo.moveRight(x,y);
				break;
			case 8:
				y = arrDemo.moveUp(x,y);
				break;
			case 2:
				y = arrDemo.moveDown(x,y);
				break;
			default:
				System.out.println("잘못된 입력.");
				break;
			}
			
		}

		sc.close();

	} // main
} // class
