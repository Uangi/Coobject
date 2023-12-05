package Enum1;

//public enum RestartOption {
//	
//RESTRAT("1"), END("2");
//	
//	private RestartOption;
//	
//	private RestartOption(String option) {
//		this.option = option;
//	}
//	
//	public String generation() {
//		return option;
//	}
//	
//	public abstract void outPut()
//	
interface RestartAction {
	void announceMessage();
}
	public enum RestartOption implements RestartAction {
		RESTART("1"){
			@Override
			public void announceMessage() {
				System.out.println("다시 시작!");
			}
		},
		END("2") {
			@Override
			public void announceMessage() {
				System.out.println("프로그램 종료");
				System.exit(0);
			}
		};
		
	}

