package StudentFile;

import java.io.Serializable;

public class stuVO implements Serializable{

	private String name;
	private String birth;
	private int score;
	
	public stuVO(String name, String birth, int score) {
		this.name = name;
		this.birth = birth;
		this.score = score;
	}
	
	public stuVO() {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}
	public String getBirth() {
		return birth;
	}
	public int getScore() {
		return score;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
	@Override
	public String toString() {
		String str = 
		String.format("%6s %6s %6d", name, birth, score);
		return str;
	}
	
}
