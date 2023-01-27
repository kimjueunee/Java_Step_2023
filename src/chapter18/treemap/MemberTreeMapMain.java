package chapter18.treemap;

import chapter17.treeset.Member3;

public class MemberTreeMapMain {

	public static void main(String[] args) {
		MemberTreeMap memberTreeMap=new MemberTreeMap();
		
		//가방에 넣을 Member 데이터
		Member3 memberKim=new Member3(1001, "김병효");
		Member3 memberLee=new Member3(1002, "이채윤");
		Member3 memberKim2=new Member3(1003, "김지성");
		Member3 memberKim3=new Member3(1004, "김형우");
		Member3 memberYoon=new Member3(1005, "윤민주");
		Member3 memberKim4=new Member3(1006, "김주은");
		
		memberTreeMap.addMember(memberKim);
		memberTreeMap.addMember(memberLee);
		memberTreeMap.addMember(memberKim2);
		memberTreeMap.addMember(memberKim3);
		memberTreeMap.addMember(memberYoon);
		memberTreeMap.addMember(memberKim4);
		memberTreeMap.addMember(new Member3(1007, "안효섭"));
		
		memberTreeMap.showAllMember();
		
		memberTreeMap.removeMember(1001);
		memberTreeMap.showAllMember();

	}

}
