package chapter04;

import java.util.Scanner;

public class MemberserviceExample {
	private static String hong;

	public static void main(String[] args) {
		Memberservice memberservice = new Memberservice();
		boolean result = true; 
		//memberservice.login("hong","12345");
		Scanner scan = new Scanner(System.in);
		System.out.println("아이디와 비밀번호를 입력하시요.");
		String x = scan.nextLine();
		String y = scan.nextLine();
		
		if(memberservice.login(x,y)) {
			System.out.println("로그인이 되었습니다");
		} else { 
			result = false;
			System.out.println("아이디와 비밀번호가 틀렸습니다.");
		};
	}
}
