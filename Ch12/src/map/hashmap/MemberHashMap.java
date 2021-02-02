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
		System.out.println(memberId + "�� �������� �ʽ��ϴ�.");
		return false;
	}
	
	public void showAllMember() {
		Iterator<Integer> ir = hashMap.keySet().iterator();
		while(ir.hasNext()) { //���� key�� ������
			int key = ir.next(); //key���� �����ͼ�
			Member mem = hashMap.get(key);	//key�κ��� value��������
			System.out.println(mem);
		}
		System.out.println();
	}
}
