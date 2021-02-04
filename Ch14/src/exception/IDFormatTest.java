package exception;

public class IDFormatTest {
	private String userID;
	private String password;
	
	// Methods
	public String getUserID() {
		return userID;
	}	
	public String getPword() {
		return password;
	}
	
	public void setUserID(String userID)throws IDFormatException{
		if (userID == null) {
			throw new IDFormatException("아이디는 null일 수 없습니다.");
		}
		else if(userID.length() < 8 || userID.length() >20) {
			throw new IDFormatException("아이디는 8자 이상 20자 이하로 쓰세요.");
		}
	this.userID = userID;
	}
	
	public void setPword(String pword) throws PasswordException{
		if (pword == null) {
			throw new PasswordException("비밀번호는 null일 수 없습니다.");
		}
		else if(pword.length() <= 5 || pword.matches("[a-zA-Z]+")) {
			throw new PasswordException("비밀번호는 6자 이상이고 숫자가 포함되어야 합니다.");
		}
	this.password = pword;
	}
	
	
	// Execution
	public static void main(String[] args) {
		IDFormatTest test = new IDFormatTest();
		
		String userID = null;
		try {
			test.setUserID(userID);
		} catch(IDFormatException e) {
			System.out.println(e.getMessage());
		}
		
		userID = "1234567";
		try {
			test.setUserID(userID);
		} catch (IDFormatException e) {
			System.out.println(e.getMessage());
		}
		
		String pword = null;
		try {
			test.setPword(pword);
		} catch(PasswordException e) {
			System.out.println(e.getMessage());
		}
		
		pword = "thisispassword";
		try {
			test.setPword(pword);
		} catch(PasswordException e) {
			System.out.println(e.getMessage());
		}

	}

}
