package map.hashmap;

import collection.Member;

public class MemberHashMapTest {

	public static void main(String[] args) {
		MemberHashMap memberHashMap = new MemberHashMap();
		
		Member memLee = new Member(1001, "ÀÌÁöÈÆ");
		Member memKim = new Member(1002, "±è¹Î±Ô");
		Member memHong = new Member(1003, "È«Áö¼ö");
		Member memChoi = new Member(1004, "ÃÖ½ÂÃ¶");
		
		//addMember ¸Ş¼­µå°¡ ¸â¹ö¸¦ ¹Ş¾Æ¼­ Id¸¦ Å°·Î ¼³Á¤, NameÀ» value·Î ¼³Á¤.
		memberHashMap.addMember(memLee);	
		memberHashMap.addMember(memKim);
		memberHashMap.addMember(memHong);
		memberHashMap.addMember(memChoi);
		
		memberHashMap.showAllMember();
		
		memberHashMap.removeMember(1004);
		memberHashMap.showAllMember();
	}
}
