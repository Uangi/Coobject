package String_Caculator3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class strGap {

	// 리스트 생성
	List<Double> number = new ArrayList<Double>();
	List<String> operator = new ArrayList<String>();
	public String oper;
	
	
	public void split() throws IOException {
		
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				
				System.out.println("수식 입력 : ");
				String oper = br.readLine();
				oper = oper.replaceAll("\\s", "");  // 공백 제거해서 표시
				System.out.println(oper);
				String[] tokens = oper.split("[+\\-*/]");
				for(String token : tokens) {	// 입력한 문자열을 하나씩 쪼개 token에 저장
					if(isNumber(token)) {	// 토큰이 숫자라면
						number.add(Double.parseDouble(token));	// token을 double형으로 변환해서  숫자 리스트에 저장 
					} else {	// 입력한 문자열이 숫자가 아닌 String 형 token이라면
						operator.add(token);	//  그냥 문자열 리스트에 추가
					}
				}
				for (char c : oper.toCharArray()) {	// 연산자 쪼개서 담기
		            if (c == '+' || c == '-' || c == '*' || c == '/') {
		                operator.add(String.valueOf(c));
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
			public void Output2(Calculator3 ca) {
				
				System.out.println("결과 : " + ca.result);
				for(int i = 0; i < number.size(); i ++) {
					System.out.println(number.get(i));	// 수식검사
				}
			}
	}
