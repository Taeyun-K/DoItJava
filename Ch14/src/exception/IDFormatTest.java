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
			throw new IDFormatException("���̵�� null�� �� �����ϴ�.");
		}
		else if(userID.length() < 8 || userID.length() >20) {
			throw new IDFormatException("���̵�� 8�� �̻� 20�� ���Ϸ� ������.");
		}
	this.userID = userID;
	}
	
	public void setPword(String pword) throws PasswordException{
		if (pword == null) {
			throw new PasswordException("��й�ȣ�� null�� �� �����ϴ�.");
		}
		else if(pword.length() <= 5 || pword.matches("[a-zA-Z]+")) {
			throw new PasswordException("��й�ȣ�� 6�� �̻��̰� ���ڰ� ���ԵǾ�� �մϴ�.");
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
