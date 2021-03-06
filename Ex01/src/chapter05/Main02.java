package chapter05;

import java.util.Scanner;

public class Main02 {
	static String[] names = new String[] {"고","김","이","박","홍"}; 
	static int [][] scores = new int [5][4];
	static double [] avg = new double [5];
	static int[] ranking = new int[] {1,1,1,1,1};
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		boolean run = true;
		while(run) {
			System.out.println("1.시험 점수 입력");
			System.out.println("2.개인별 시험 점수 조회");
			System.out.println("3.과목별 시험 점수 조회");
			System.out.println("4.석차 조회");
			System.out.println("5.종료");
			int number	= scan.nextInt();
			scan.nextLine();
			switch(number) {
			case 1 :
				JumSu();
				break;
			case 2 :
				JumSu2();
				break;
			case 3 :
				JumSu3();
				break;
			case 4 :
				for(int i=0;i<ranking.length;i++) {
					System.out.println(names[i]+" 학생의 석차 : "+ranking[i]+"등");
				}
				break;
			case 5 :
				System.out.println("프로그램 종료");
				System.exit(0);//프로그램 정상 종료
				break;
			default : System.out.println("잘못 입력하셨습니다."); 
			}
		}
	}

	private static void JumSu3() {
		int total1 = 0;
		int total2 = 0;
		int total3 = 0;		
		for(int i=0;i<scores.length;i++) {
			total1 += scores[i][0];
		}
		for(int i=0;i<scores.length;i++) {
			total2 += scores[i][1];
		}
		for(int i=0;i<scores.length;i++) {
			total3 += scores[i][2];
		}
		System.out.println("국어점수 총점: "+total1);
		System.out.println("국어점수 평균: " +total1/5);
		System.out.println("영어점수 총점: "+total2);
		System.out.println("영어점수 평균: " +total2/5);
		System.out.println("수학점수 총점: "+total3);
		System.out.println("수학점수 평균: " +total3/5);
	}

	private static void JumSu2() {
		System.out.println("학생의 이름을 입력하여 주십죠");
		String name = scan.nextLine();
		for(int i=0;i<names.length;i++) {
			if(name.equals(names[i])) {
			System.out.println(names[i]+"학생");
			System.out.println("국어점수 : "+scores[i][0]);
			System.out.println("영어점수 : "+scores[i][1]);
			System.out.println("수학점수 : "+scores[i][2]);
			System.out.println("총점 : "+scores[i][3]);
			System.out.println("평균 : "+avg[i]);		
			}
		}	
	}

	private static void JumSu() {
		System.out.println("1.시험 점수를 입력하시요");
		for(int i=0;i<names.length;i++) {
			System.out.println(names[i]+"학생");
			System.out.print("국어점수 : ");
			scores[i][0] = scan.nextInt();
			System.out.print("영어점수 : ");
			scores[i][1] = scan.nextInt();
			System.out.print("수학점수 : ");
			scores[i][2] = scan.nextInt();
			scan.nextLine();
			scores[i][3] =scores[i][0]+scores[i][1]+scores[i][2];
			avg[i] = scores[i][3]/3.0;
			for(int j=0;j<i;j++) {
				if(avg[i] > avg[j]) {
					ranking[j]++;
				}else {
					ranking[i]++;
				}
			}
		}
	}
}
