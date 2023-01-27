package chapter17.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

import chapter17.Member;

public class MemberLinkedList {
	
	private LinkedList<Member> linkedList;
	
	public MemberLinkedList() {
		linkedList=new LinkedList<Member>();
	}
	
	public void addMember(Member member) {
		linkedList.add(member);
	}
	

	public boolean removeMember(int memberId) {
		Iterator<Member> ir=linkedList.iterator();
		while(ir.hasNext()) {
			Member member=ir.next();
			int tempId=member.getMemberId();
			if(tempId==memberId) {
				linkedList.remove(member);
				return true;
			}
		}
		System.out.println(memberId+"가 존재하지 않습니다.");
		return false;
	}
	
	public void showAllMember() {
		for(Member member:linkedList) {
			System.out.println(member);
		}
		System.out.println();
	}
	


}
