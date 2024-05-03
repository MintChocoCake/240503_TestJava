package pack06;

public class TeamGroup {

	private TeamMember[] members = null;
	
	public TeamGroup() {
		initialize();
	}
	
	public void initialize() {
		members = new TeamMember[6];
		
		String[] memberName = { "팀원1", "팀원2", "팀원3", "팀원4", "팀원5", "팀원6" };
		String[] memberGender = { "남", "여", "남", "여", "남", "여" };
		
		for (int i = 0; i < members.length; i++) {
			members[i] = new TeamMember(memberName[i], memberGender[i]);
		}
	}
	
	public void printMemberInfo() {
		for (int i = 0; i < members.length; i++) {
			System.out.print("[성명 : " + members[i].getMemberName() + "] ");
			System.out.println("[성별 : " + members[i].getMemberGender() + "]");
		}
	}
	
}
