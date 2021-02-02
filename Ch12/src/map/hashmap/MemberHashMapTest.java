package map.hashmap;

import collection.Member;

public class MemberHashMapTest {

	public static void main(String[] args) {
		MemberHashMap memberHashMap = new MemberHashMap();
		
		Member memLee = new Member(1001, "������");
		Member memKim = new Member(1002, "��α�");
		Member memHong = new Member(1003, "ȫ����");
		Member memChoi = new Member(1004, "�ֽ�ö");
		
		//addMember �޼��尡 ����� �޾Ƽ� Id�� Ű�� ����, Name�� value�� ����.
		memberHashMap.addMember(memLee);	
		memberHashMap.addMember(memKim);
		memberHashMap.addMember(memHong);
		memberHashMap.addMember(memChoi);
		
		memberHashMap.showAllMember();
		
		memberHashMap.removeMember(1004);
		memberHashMap.showAllMember();
	}
}
