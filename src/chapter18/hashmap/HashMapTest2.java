package chapter18.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapTest2 {
	
	public static void main(String[] args) {
		//Map<String integer>생성 map
		Map<String, Integer> map=new HashMap<String, Integer>();
		//팀원 데이터(성함, 학번)저장
		map.put("김병효", 1001);
		map.put("이채윤", 1002);
		map.put("김지성", 1003);
		map.put("김형우", 1004);
		map.put("윤민주", 1005);
		map.put("김주은", 1006);
		//팀원의 인원
		System.out.println("총 인원 : "+map.size()+"명");
		//팀장의 학번을 알아내자
		System.out.println("-----팀장 학번-----");
		System.out.println(map.get("김병효"));
		//팀원 모두의 학번 출력
        Set<Map.Entry<String, Integer>> entrySet=map.entrySet();
		
		Iterator<Map.Entry<String, Integer>> entryIterator=entrySet.iterator();
		System.out.println("-----팀원 학번-----");
		while(entryIterator.hasNext()) {
			Map.Entry<String, Integer> entry=entryIterator.next();
			String key=entry.getKey();
			Integer value=entry.getValue();
			System.out.println(key+" : "+value);
		}
		System.out.println();
	}

}
