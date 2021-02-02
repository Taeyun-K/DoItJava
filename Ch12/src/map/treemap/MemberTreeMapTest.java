package map.treemap;

import collection.Member;

public class MemberTreeMapTest {
	public static void main(String[] args) {
		MemberTreeMap memberTreeMap = new MemberTreeMap();
		
		Member memLee = new Member(1001, "ÀÌÁöÈÆ");
		Member memKim = new Member(1002, "±è¹Î±Ô");
		Member memHong = new Member(1003, "È«Áö¼ö");
		Member memChoi = new Member(1004, "ÃÖ½ÂÃ¶");
		
		//addMember ¸Ş¼­µå°¡ ¸â¹ö¸¦ ¹Ş¾Æ¼­ Id¸¦ Å°·Î ¼³Á¤, NameÀ» value·Î ¼³Á¤.
		memberTreeMap.addMember(memLee);	
		memberTreeMap.addMember(memKim);
		memberTreeMap.addMember(memHong);
		memberTreeMap.addMember(memChoi);
		
		memberTreeMap.showAllMember();
		
		memberTreeMap.removeMember(1004);
		memberTreeMap.showAllMember();
	}
}
