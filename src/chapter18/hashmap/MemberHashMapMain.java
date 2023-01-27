package chapter18.hashmap;

import chapter17.Member2;

public class MemberHashMapMain {

	public static void main(String[] args) {
		MemberHashMap memHashMap=new MemberHashMap();
		
		//가방에 넣을 Member 데이터
		Member2 memberKim=new Member2(1001, "김병효");
		Member2 memberLee=new Member2(1002, "이채윤");
		Member2 memberKim2=new Member2(1003, "김지성");
		Member2 memberKim3=new Member2(1004, "김형우");
		Member2 memberYoon=new Member2(1005, "윤민주");
		Member2 memberKim4=new Member2(1006, "김주은");
		
		memHashMap.addMember(memberKim);
		memHashMap.addMember(memberLee);
		memHashMap.addMember(memberKim2);
		memHashMap.addMember(memberKim3);
		memHashMap.addMember(memberYoon);
		memHashMap.addMember(memberKim4);
		memHashMap.addMember(new Member2(1007, "안효섭"));
		
		memHashMap.showAllMember();
		
		memHashMap.removeMember(1001);
		memHashMap.showAllMember();

	}

}
