package String_Caculator4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringTokenizer {

	// 리스트 생성
	List<Double> number = new ArrayList<Double>();
	List<String> operator = new ArrayList<String>();
	//public String[] str;
	
	public void split() {
		
				Scanner sc = new Scanner(System.in);
				System.out.println("수식 입력 : ");
				String oper = sc.next();
				String []str = oper.split(" ");	// 공백 기준으로 문자열 분리
				// oper.split("\\s+) 공백
				for(String token : str) {	// 입력한 문자열을 하나씩 쪼개 token에 저장
					if(isNumber(token)) {	// 입력한 문자열이 숫자가 아닌 String 형 token이라면
						number.add(Double.parseDouble(token));	// token을 double형으로 변환해서  숫자 리스트에 저장 
					} else {
						operator.add(token);	// 아니라면 그냥 문자열 리스트에 추가
					}
				}
			}

			// 문자열이 숫자인지 확인하는 메소드
			public boolean isNumber(String str) {
				try {
					Double.parseDouble(str);	// 입력한 문자열이 들어오는대로 double형으로 변환
					return true;	// 변환이 가능하면 true
				} catch (NumberFormatException e) {
					return false;	// 변환이 안된다면 false
				}
			}
			
			// 출력
			public void Output2(Calculator4 ca) {
				System.out.println("결과 : " + ca.result);
				for(int i = 0; i < number.size(); i ++) {
					System.out.println(number.get(i));
				}
			}
	}
