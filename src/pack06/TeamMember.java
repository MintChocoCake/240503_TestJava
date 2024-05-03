package pack06;

public class TeamMember {
	
	public String teamName = "";
	public String leaderName = "";
	public String leaderPhone = "";
	public String subLeaderName = "";
	public String memberName = "";
	public String memberGender = "";
	
	public TeamMember() {}
	public TeamMember(String _teamName, String _leaderName, String _leaderPhone,
			String _subLeaderName, String _memberName, String _memberGender) {
		this.teamName = _teamName;
		this.leaderName = _leaderName;
		this.leaderPhone = _leaderPhone;
		this.subLeaderName = _subLeaderName;
		this.memberName = _memberName;
		this.memberGender = _memberGender;
	}
	public TeamMember(String _memberName, String _memberGender) {
		this.memberName = _memberName;
		this.memberGender = _memberGender;
	}
	
	public void printInfo() {
		System.out.println("팀명 : " + this.teamName);
		System.out.println("팀장 : " + this.leaderName);
		System.out.println("팀장 연락처 : " + this.leaderPhone);
		System.out.println("부팀장 : " + this.subLeaderName);
		System.out.println("팀원 : " + this.memberName);
		System.out.println("팀원 성별 : " + this.memberGender);
	}
	
	// get / set
	public void setInfo(String _teamName, String _leaderName, String _leaderPhone,
			String _subLeaderName, String _memberName, String _memberGender) {
		this.teamName = _teamName;
		this.leaderName = _leaderName;
		this.leaderPhone = _leaderPhone;
		this.subLeaderName = _subLeaderName;
		this.memberName = _memberName;
		this.memberGender = _memberGender;
	}
	
	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public String getLeaderName() {
		return leaderName;
	}

	public void setLeaderName(String leaderName) {
		this.leaderName = leaderName;
	}

	public String getLeaderPhone() {
		return leaderPhone;
	}

	public void setLeaderPhone(String leaderPhone) {
		this.leaderPhone = leaderPhone;
	}

	public String getSubLeaderName() {
		return subLeaderName;
	}

	public void setSubLeaderName(String subLeaderName) {
		this.subLeaderName = subLeaderName;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public String getMemberGender() {
		return memberGender;
	}

	public void setMemberGender(String memberGender) {
		this.memberGender = memberGender;
	}
	
	
	
}
