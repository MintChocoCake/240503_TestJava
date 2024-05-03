package packdemo.demotest;

import java.util.LinkedList;
import java.util.List;

public class DataTable_Demo {

	// 데이터 정규화 - key 값을 통해 관련 데이터를 묶어 찾을수 있도록 ?
	// 과목ID , 과목명 , 과목가격
	public class Subject {
		int id = 0; // key
		String name = "";
		int cost = 0;
	}
	
	public class User {
		int id = 0; // key
		String name = "";
		String address = "";
	}
	
	public class SignUp_Subject {
		// 학생 id
		int userId = 0;
		// 신청한 과목 id
		int subjectId = 0;
	}

	// 과목 정보를 담은 List
	List<Subject> subList = new LinkedList<>();
	// 학생 정보를 담은 List
	List<User> userList = new LinkedList<>();
	// 수강 신청자 정보를 담은 List
	List<SignUp_Subject> signUpSubjectList = new LinkedList<>();
	
	// add
	public void addSubject(int _id, String _name, int _cost) {
		Subject sub = new Subject();
		sub.id = _id;
		sub.name = _name;
		sub.cost = _cost;
		
		subList.add(sub);
	}
	public void addUser(int _id, String _name, String _address) {
		User user = new User();
		user.id = _id;
		user.name = _name;
		user.address = _address;
		
		userList.add(user);
	}
	public void addsignUpSubject(int _userId, int _subjectId) {
		SignUp_Subject signUpSubject = new SignUp_Subject();
		
		signUpSubject.userId = _userId;
		signUpSubject.subjectId = _subjectId;
		
		signUpSubjectList.add(signUpSubject);
	}
	// get
	public Subject getSubjectInfo(int _subjectId) {
		for (Subject sub : subList) {
			if (_subjectId == sub.id) {
				return sub;
			}
		}
		return null;
	}
	public User getUserInfo(int _userId) {
		for (User user : userList) {
			if (_userId == user.id) {
				return user;
			}
		}
		return null;
	}
	
	// show
		public void showSubjectList() {
			int index = 0;
			
			System.out.println("=====[과목 목록]=====");
			for (Subject sub : subList) {
				System.out.println(++index + ". [과목ID : " +  sub.id + "] [과목명 : " + sub.name 
						+ "] [비용 : " + sub.cost + "]");
			}
		}
	public void showUserList() {
		int index = 0;
		
		System.out.println("=====[학생 목록]=====");
		for (User user : userList) {
			System.out.println(++index + ". [학생ID : " +  user.id + "] [학생명 : " + user.name 
					+ "] [주소 : " + user.address + "]");
		}
	}
	public void showSginUpSubject() {
		for (SignUp_Subject signSubject : signUpSubjectList) {
			User user = getUserInfo(signSubject.userId);
			Subject sub = getSubjectInfo(signSubject.subjectId);
			if (null == user || null == sub)
				return;
			
			System.out.println("=====[신청자 목록]=====");
			System.out.println("과목 : " + sub.name + "  과목ID : " + sub.id
					+ "  비용 : " + sub.cost);
			System.out.println("이름 : " + user.name + "  신청자ID : " + user.id
					+ "  주소 : " + user.address);
		}
	}

	
	public static void main(String[] args) {
		
		DataTable_Demo nf1 = new DataTable_Demo();
		
		nf1.addSubject(1, "수학", 7000);
		nf1.addSubject(2, "영어", 8000);
		nf1.addSubject(3, "과학", 6000);
		
		nf1.showSubjectList();
		
		nf1.addUser(111, "철수", "종로");
		nf1.addUser(112, "영수", "동대문");
		nf1.addUser(113, "희수", "시청");
		
		nf1.showUserList();
		
		nf1.addsignUpSubject(111, 1);
		nf1.addsignUpSubject(111, 2);
		nf1.addsignUpSubject(112, 3);
		nf1.addsignUpSubject(113, 2);
		
		nf1.showSginUpSubject();
	}

}
