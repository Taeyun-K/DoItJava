package map.treemap;

import collection.Member;

public class MemberTreeMapTest {
	public static void main(String[] args) {
		MemberTreeMap memberTreeMap = new MemberTreeMap();
		
		Member memLee = new Member(1001, "������");
		Member memKim = new Member(1002, "��α�");
		Member memHong = new Member(1003, "ȫ����");
		Member memChoi = new Member(1004, "�ֽ�ö");
		
		//addMember �޼��尡 ����� �޾Ƽ� Id�� Ű�� ����, Name�� value�� ����.
		memberTreeMap.addMember(memLee);	
		memberTreeMap.addMember(memKim);
		memberTreeMap.addMember(memHong);
		memberTreeMap.addMember(memChoi);
		
		memberTreeMap.showAllMember();
		
		memberTreeMap.removeMember(1004);
		memberTreeMap.showAllMember();
	}
}
