package pack06;

public class TeamMain {

	public static void main(String[] args) {
		
		TeamMember tm = new TeamMember();
		tm.setInfo("1팀", "팀장이름", "팀장전화", "부팀장이름", "팀원이름", "팀원성별");
		tm.printInfo();
		
		System.out.println("===============");
		
		TeamGroup tg = new TeamGroup();
		tg.printMemberInfo();
		
	}

}
