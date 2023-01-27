package chapter17.hashset;

import chapter17.Member;
import chapter17.Member2;
import chapter17.linkedlist.MemberLinkedList;

public class MemberHashSetTest {

	public static void main(String[] args) {
		
		MemberHashSet memberHashSet=new MemberHashSet();
		//순서 O, 중복 O
		Member2 memberKim=new Member2(1001, "김병효");
		Member2 memberLee=new Member2(1002, "이채윤");
		Member2 memberKim2=new Member2(1003, "김지성");
		Member2 memberKim3=new Member2(1004, "김형우");
		Member2 memberYoon=new Member2(1005, "윤민주");
		Member2 memberKim4=new Member2(1006, "김주은");
		
		memberHashSet.addMember(memberKim);
		memberHashSet.addMember(memberLee);
		memberHashSet.addMember(memberKim2);
		memberHashSet.addMember(memberKim3);
		memberHashSet.addMember(memberYoon);
		memberHashSet.addMember(memberKim4);
		
		memberHashSet.showAllMember();
		
		memberHashSet.removeMember(memberKim.getMemberId());
		//방법1
		//Member2 memberKim5=new Member2(1227, "김정진");
		//방법2
		Member2 memberKim5=new Member2(1227, "김정진");
		memberHashSet.addMember(memberKim5);
		
		memberHashSet.showAllMember();

	}

}
