package chapter04;

import java.util.Scanner;

public class Main02 {
	public static Member member;
	public static void main(String[] args) {
		Memberlogin aaa = new Memberlogin();	
		boolean run = true;
		Scanner scan = new Scanner(System.in);

		while(run) {
			System.out.print("1.회원가입");
			System.out.print("2.로그인");
			System.out.print("3.종료");
			int nember = Integer.parseInt(scan.nextLine());
			switch(nember) {
			case 1 : System.out.println("회원가입");	
			member = aaa.login1();
			break;
			case 2 : System.out.println("로그인");
			aaa.login2();
			break;
			case 3 : System.out.println("종료");
			run = false;
			break;
			default : System.out.println("다시 입력하세요");
			break;
			}	
		}
	}
	
}




