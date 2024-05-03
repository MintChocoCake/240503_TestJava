package pack05;

import javax.swing.JOptionPane;

public class SungJuk {
	
	private String strNum = "";
	private String strName = "";
	private int java = 0;
	private int oracle = 0;
	private int spring = 0;
	
	private int total = 0;
	private double avg = 0;
	
	public void sum() {
		total = java + oracle + spring;
	}
	
	public void avg() {
		avg = (double)total / 3;
	}
	
	public void print() {
		System.out.println("자바 : " + this.java);
		System.out.println("오라클 : " + this.oracle);
		System.out.println("스프링 : " + this.spring);
		System.out.println("총점 : " + this.total);
		System.out.println("평균 : " + this.avg);
	}
	
	public static void main(String[] args) {
		
		SungJuk rec = new SungJuk();
		
		rec.strNum = JOptionPane.showInputDialog("학번");
		rec.strName = JOptionPane.showInputDialog("성명");
		
		rec.java = Integer.parseInt(JOptionPane.showInputDialog("자바 점수"));
		rec.oracle = Integer.parseInt(JOptionPane.showInputDialog("오라클 점수"));
		rec.spring = Integer.parseInt(JOptionPane.showInputDialog("스프링 점수"));
		
		System.out.println("=====[성적]=====");
		System.out.println("학번 : " + rec.strNum + " | 성명 : " + rec.strName);
		
		rec.sum();
		rec.avg();
		rec.print();
	}

}
