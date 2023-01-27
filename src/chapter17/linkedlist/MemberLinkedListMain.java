package chapter17.linkedlist;

import chapter17.Member;

public class MemberLinkedListMain {

	public static void main(String[] args) {
		
		MemberLinkedList memberLinkedList=new MemberLinkedList();
		//순서 O, 중복 O
		Member memberKim=new Member(1001, "김병효");
		Member memberLee=new Member(1002, "이채윤");
		Member memberKim2=new Member(1003, "김지성");
		Member memberKim3=new Member(1004, "김형우");
		Member memberYoon=new Member(1005, "윤민주");
		Member memberKim4=new Member(1006, "김주은");
		
		memberLinkedList.addMember(memberKim);
		memberLinkedList.addMember(memberLee);
		memberLinkedList.addMember(memberKim2);
		memberLinkedList.addMember(memberKim3);
		memberLinkedList.addMember(memberYoon);
		memberLinkedList.addMember(memberKim4);
		
		memberLinkedList.showAllMember();
		
		memberLinkedList.removeMember(memberKim.getMemberId());
		
		Member memberKim5=new Member(1227, "김정진");
		memberLinkedList.addMember(memberKim5);
		
		memberLinkedList.showAllMember();

	}

}
