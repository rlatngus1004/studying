package chapter04;

import java.util.Scanner;

public class Memberlogin {
	Scanner scan = new Scanner(System.in);
	Member prt = new Member(null, null, null, null);
	//public Memberlogin() {}
	
	public Member login1() {
		
		System.out.print("아이디 입력");
		String id = scan.nextLine();
		System.out.print("비번 입력");
		String password = scan.nextLine();
		System.out.print("이름 입력");
		String name = scan.nextLine();
		System.out.print("전화번호 입력");
		String phone = scan.nextLine();
		System.out.println("회원가입 성공");
		Member m = new Member(id,password,name,phone);
		return m;
		
	}
	
	public void login2() {
		Scanner scan = new Scanner(System.in);
		System.out.println("아이디 입력");
		String id = scan.nextLine();
		System.out.println("비번 입력");
		String password = scan.nextLine();
		if(id.equals(Main02.member.id) && password.equals(Main02.member.password)) {
			System.out.println("로그인 성공");
			prt.prt();
		} else {
			System.out.println("로그인 실패");
		}
	}	
	
}