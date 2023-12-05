package com.naver;

import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

import javax.security.auth.callback.PasswordCallback;

import com.day15.Test3_ScoreVO;

public class NaverFunc implements Naver{

	private Map<String, NaverVO> user = new TreeMap<>();
	
	Scanner sc = new Scanner(System.in);
	private String id; 	// 전역 변수
	
	NaverPassword npc = new NaverPassword();
	NaverId nic = new NaverId();
	
	@Override
	public void createanAccount() {
		NaverVO vo = new NaverVO();	// 객체 생성 이후 정보주입
		
		nic.idCreate(vo);
		
		npc.passwordCreate(vo);	// 1차 비밀번호 생성
		
		System.out.print("이름 : ");
		vo.setNAME(sc.next());

		System.out.print("성별 : ");
		vo.setGENDER(sc.next());
		
		System.out.print("생일 : ");
		vo.setBIRTH(sc.nextInt());
		
		System.out.print("이메일 : " );
		vo.setEMAIL(sc.next());
	
		System.out.print("전화번호 : " );
		vo.setTEL(sc.nextInt());
		
		user.put(vo.getID(), vo);
		
		System.out.println("추가 성공!");
		}

	public Map<String, NaverVO> getUser() {
		return user;
	}

	@Override
	public void allPrint() {
		Iterator<String> it = user.keySet().iterator();
		while(it.hasNext()) {
			String key = it.next();
			NaverVO vo = user.get(key);
			System.out.println(key + " " + vo.toString());
		}
	}

	@Override
	public boolean searchID(String ID) {	// ID 유무 검색
		if(user.containsKey(ID)) { 
			return true;
		}
		return false;
		
	}

	@Override
	public void searchUser() {
		System.out.println("찾을 ID : ");
		String id = sc.next();
		
		if(!searchID(id)) {
			System.out.println("id가 없습니다.");
			return;
		}
		
		Iterator<String> it = user.keySet().iterator();
		
		while(it.hasNext()) {	
			String key = it.next();	
			
			if(key.equals(id)) {
				System.out.println("검색한 회원정보입니다. ");
				NaverVO vo = user.get(key);
				System.out.println(key + " " + vo.toString());
			}
		}
	}

}
