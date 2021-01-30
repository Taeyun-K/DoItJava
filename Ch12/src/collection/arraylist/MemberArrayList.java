package collection.arraylist;

import java.util.ArrayList;
import collection.Member;

public class MemberArrayList {
	//Variables
	private ArrayList<Member> arrayList;
	
	//Constructor
	public MemberArrayList() {
		arrayList = new ArrayList<Member>();
	}
	
	//Methods
	public void addMember(Member member) {
		arrayList.add(member);
	}
	
	public void insertMember(Member member, int i) {
		arrayList.add(i, member);
	}
	
	public boolean removeMember(int memberId) {
		for(int i = 0; i < arrayList.size(); i++) {
			Member member = arrayList.get(i);
			int tempId = member.getMemberId();
			if(tempId == memberId) {
				arrayList.remove(i);
				return true;
			}
		}
		System.out.println(memberId + "가 존재하지 않습니다");
		return false;
		
		/* iterator 이용
		 * Iterator<Member> ir = arrayList.iterator();
		 * while(ir.hasNext()){
		 * 	Member member = ir.next();
		 * 	int tempId = member.getMemberId();
		 * 	if(tempId == memberId){
		 * 		arrayList.remove(member);
		 * 		return true;
		 * 	}
		 * }
		 * System.out.println(memberId + "가 존재하지 않습니다");
		 * return false;
		 */
	}
	
	public void showAllMember() {
		for(Member member : arrayList) {
			System.out.println(member);
		}
		System.out.println();
	}
}
