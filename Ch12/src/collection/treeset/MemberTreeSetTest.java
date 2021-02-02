package collection.treeset;

import collection.Member;

public class MemberTreeSetTest {

	public static void main(String[] args) {
		MemberTreeSet memberTreeSet = new MemberTreeSet();
		
		Member memberPark = new Member(1003, "¹Ú¹Î¿µ");
		Member memberLee = new Member(1001, "ÀÌÁöÈÆ");
		Member memberSon = new Member(1002, "¼Õ¹Î±¹");
		
		memberTreeSet.addMember(memberSon);
		memberTreeSet.addMember(memberPark);
		memberTreeSet.addMember(memberLee);
		memberTreeSet.showAllMember();
		
		Member memberHong = new Member(1003, "È«±æµ¿");
		memberTreeSet.addMember(memberHong);
		memberTreeSet.showAllMember();
	}

}
