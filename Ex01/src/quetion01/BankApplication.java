package quetion01;

import java.util.Scanner;

public class BankApplication {
	private static Account[] accountArray = new Account[100];
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		boolean run = true;
		while(run) {
			System.out.println("--------------------------------------------");
			System.out.println("1.계좌생성|2.계좌목록|3.예금|4.출금|5.종료");
			System.out.println("--------------------------------------------");
			System.out.println("선택> ");

			int selectNo = scanner.nextInt();
			scanner.nextLine();
			if(selectNo == 1) {
				createAccount();
			}else if(selectNo == 2) {
				accountList();
			}else if(selectNo == 3) {
				deposit();
			}else if(selectNo == 4) {
				withdraw();
			}else if(selectNo == 5) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}
	private static void createAccount() {
		System.out.println("계좌번호 :");
		String ano = scanner.nextLine();
		System.out.println("계좌주 :");
		String name = scanner.nextLine();
		System.out.println("초기 입급액 :");
		int money = scanner.nextInt();
		scanner.nextLine();
		Account acc = new Account(name, name, money);
		int flag = -1;
		for(int i=0; i<accountArray.length; i++) {
			if(accountArray[i] == null) {
				accountArray[i] = acc;
				flag = 1;
				break;
			}
		}if (flag == -1) {
			System.out.println("계좌 생성 실패");
		} else {
			System.out.println("계좌 생성 성공");
		}


	}
	private static void accountList() {
		System.out.println("계좌목록");
		for(int i=0; i<accountArray.length; i++) {
			if(accountArray[i] != null) {
				accountArray[i].info();
			}
		}
	}	
	private static void deposit() {
		System.out.println("계좌번호 :");
		String ano = scanner.nextLine();
		Account acc = findAccount(ano);
		if(acc!=null) {
			System.out.println("예금액 : ");
			int money = Integer.parseInt(scanner.nextLine());			
			acc.setBalance(money+acc.getBalance());
		} else System.out.println("계좌 번호를 잘못 입력했습니다.");


	}	
	private static void withdraw() {
		System.out.println("계좌번호 :");
		String ano = scanner.nextLine();
		Account acc = findAccount(ano);
		if(acc!=null) {
			System.out.println("출금액 : ");
			int money = Integer.parseInt(scanner.nextLine());			
			if (money<acc.getBalance()) {
				acc.setBalance(acc.getBalance()-money);
			} else {
				System.out.println("계좌액을 초과했습니다.");
			}
		} else {
			System.out.println("계좌 번호를 잘못 입력했습니다.");
		}

	}
	private static Account findAccount(String ano) {
		for(int i=0; i<accountArray.length; i++) {
			if(accountArray[i] != null) {
				if(accountArray[i].getAno().equals(ano)) {
					return accountArray[i];
				}
			}
		}
		return null;
	}
}
