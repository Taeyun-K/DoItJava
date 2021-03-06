package collection;

public class Member implements Comparable<Member>{
	//Variables
	private int memberId;
	private String memberName;
	
	//Constructor
	public Member(int memberId, String memberName) {
		this.memberId = memberId;
		this.memberName = memberName;
	}
	
	//Methods
	public int getMemberId() {
		return memberId;
	}
	
	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}
	
	public String getMemberName() {
		return memberName;
	}
	
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	
	@Override
	public String toString() {
		return memberName + "회원님의 아이디는" + memberId + "입니다";
	}
	
	@Override
	public int hashCode() {
		return memberId;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member = (Member)obj;
			if(this.memberId == member.memberId)
				return true;
			else
				return false;
		}
		return false;
	}
	
	@Override
	public int compareTo(Member member) {
		// 새로 추가한 회원의 아이디가 더 크면 양수, 그렇지 않으면 음수, 같으면 0.
		// 이렇게 구현하면 출력 결과 값이 오름차순으로 정렬되게 됨.
		//return (this.memberId - member.memberId);
		
		// 이름 순 정렬
		return this.memberName.compareTo(member.memberName);
	}
}
