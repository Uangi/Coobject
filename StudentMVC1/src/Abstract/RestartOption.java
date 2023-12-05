package Abstract;

public enum RestartOption {

	RESTRAT("1"), END("2");
	
	private RestartOption;
	
	private RestartOption(String option) {
		this.option = option;
	}
	
	public String generation() {
		return option;
	}
}
