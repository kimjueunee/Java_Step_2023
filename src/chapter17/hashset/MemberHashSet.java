package chapter17.hashset;

import java.util.HashSet;
import java.util.Iterator;

import chapter17.Member2;

public class MemberHashSet {
	
	private HashSet<Member2> hashSet;
	
	public MemberHashSet() {
		hashSet=new HashSet<Member2>();
	}
	
	public void addMember(Member2 member2) {
		hashSet.add(member2);
	}
	

	public boolean removeMember(int memberId) {
		Iterator<Member2> ir=hashSet.iterator();
		while(ir.hasNext()) {
			Member2 member2=ir.next();
			int tempId=member2.getMemberId();
			if(tempId==memberId) {
				hashSet.remove(member2);
				return true;
			}
		}
		System.out.println(memberId+"가 존재하지 않습니다.");
		return false;
	}
	
	public void showAllMember() {
		for(Member2 member2:hashSet) {
			System.out.println(member2);
		}
		System.out.println();
	}
	


}
