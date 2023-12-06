package ListStudy;

public class NaverVO {
	
	private String ID;
	private String PW1;
	private String PW2;
	private String NAME;
	private String GENDER;
	private int BIRTH;
	private String EMAIL;
	private int TEL;
	
	public String getID() {
		return ID;
	}

	public void setID(String id) {
		ID = id;
	}

	public void setPW1(String pW1) {
		PW1 = pW1;
	}
	public void setPW2(String pW2) {
		PW2 = pW2;
	}
	public void setNAME(String nAME) {
		NAME = nAME;
	}
	public void setGENDER(String gENDER) {
		GENDER = gENDER;
	}
	public void setBIRTH(int bIRTH) {
		BIRTH = bIRTH;
	}
	public void setEMAIL(String eMAIL) {
		EMAIL = eMAIL;
	}
	public void setTEL(int tEL) {
		TEL = tEL;
	}
	
//	public String getID() {
//		return ID;
//	}
	public String getPW1() {
		return PW1;
	}
	public String getPW2() {
		return PW2;
	}
	public String getNAME() {
		return NAME;
	}
	public String getGENDER() {
		return GENDER;
	}
	public int getBIRTH() {
		return BIRTH;
	}
	public String getEMAIL() {
		return EMAIL;
	}
	public int getTEL() {
		return TEL;
	}
	
	@Override
	public String toString() {
		String str = 
				String.format("%6s %4s %4s %4s %4d %4s %5d",
								ID, PW1, NAME, GENDER, BIRTH, EMAIL, TEL);
		return str;
		
	}

}