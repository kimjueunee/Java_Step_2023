package chapter17.arraylist;

import chapter17.Member;

public class MemberArrayListMain {

	public static void main(String[] args) {
		
		MemberArrayList memberArrayList=new MemberArrayList();
		//팀원들의 정보
		Member memberKim=new Member(1001, "김병효");
		Member memberLee=new Member(1002, "이채윤");
		Member memberKim2=new Member(1003, "김지성");
		Member memberKim3=new Member(1004, "김형우");
		Member memberYoon=new Member(1005, "윤민주");
		Member memberKim4=new Member(1006, "김주은");
		//회원가입
		memberArrayList.addMember(memberKim);
		memberArrayList.addMember(memberLee);
		memberArrayList.addMember(memberKim2);
		memberArrayList.addMember(memberKim3);
		memberArrayList.addMember(memberYoon);
		memberArrayList.addMember(memberKim4);
		
		memberArrayList.showAllMember();
		
		memberArrayList.removeMember(memberKim.getMemberId());

	}

}
