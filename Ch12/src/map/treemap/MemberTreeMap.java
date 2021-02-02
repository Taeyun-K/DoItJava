package map.treemap;

import java.util.Iterator;
import java.util.TreeMap;

import collection.Member;

public class MemberTreeMap {
	private TreeMap<Integer, Member> treeMap;
	
	//Constructor
	public MemberTreeMap() {
		treeMap = new TreeMap<Integer, Member>();
	}
	
	//Method
	public void addMember(Member mem) {
		treeMap.put(mem.getMemberId(), mem);
	}
	
	public boolean removeMember(int memberId) {
		if (treeMap.containsKey(memberId)) {
			treeMap.remove(memberId);
			return true;
		}
		System.out.println(memberId + "가 존재하지 않습니다.");
		return false;
	}
	
	public void showAllMember() {
		Iterator<Integer> iter = treeMap.keySet().iterator();
		while (iter.hasNext()) {
			int key = iter.next();
			Member member = treeMap.get(key);
			System.out.println(member);
		}
		System.out.println();
	}
}
