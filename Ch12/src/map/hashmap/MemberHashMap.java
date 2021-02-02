package map.hashmap;

import java.util.HashMap;
import java.util.Iterator;

import collection.Member;

public class MemberHashMap {
	// Variable
	private HashMap<Integer,Member> hashMap;

	// Constructor
	public MemberHashMap() {
		hashMap = new HashMap<Integer, Member>();
	}
	
	// Method
	public void addMember(Member member) {
		hashMap.put(member.getMemberId(), member);
	}
	
	public boolean removeMember(int memberId) {
		if(hashMap.containsKey(memberId)) {
			hashMap.remove(memberId);
			return true;
		}
		System.out.println(memberId + "가 존재하지 않습니다.");
		return false;
	}
	
	public void showAllMember() {
		Iterator<Integer> ir = hashMap.keySet().iterator();
		while(ir.hasNext()) { //다음 key가 있으면
			int key = ir.next(); //key값을 가져와서
			Member mem = hashMap.get(key);	//key로부터 value가져오기
			System.out.println(mem);
		}
		System.out.println();
	}
}
