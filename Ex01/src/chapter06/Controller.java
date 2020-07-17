package chapter06;

public class Controller {
	public Controller() {
		init();
	}

	private void init() {//메인
		int number = View.mainMenu();
		for(;;) {// 무한 반복		
			switch(number) {
			case 1 :
				input();
				break;
			case 2 :
				check();
				break;
			case 3 :
				Ranking();
				break;
			case 4 :
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
				break;
			default:
				View.wrong();
			}
		}

	}
	private void dummy() {
		Main.stulist[0] = new Student("고길동", new int[]{78,64,82});
		Main.stulist[1] = new Student("고길동", new int[]{85,71,64});
		Main.stulist[2] = new Student("고길동", new int[]{74,69,57});
		Main.stulist[3] = new Student("고길동", new int[]{74,77,95});
		Main.stulist[4] = new Student("고길동", new int[]{68,95,84});
		System.out.println("더미데이터 입력완료");
	}


	private void Ranking() {
		int rank = 0;
		for (int i = 0; i<Main.stulist.length;i++) {
			if (Main.stulist[i]!=null) {
				for (int j = 0; j<Main.stulist.length; j++) {
					if(Main.stulist[i].getAvg() > Main.stulist[j].getAvg()) {
						rank = Main.stulist[j].getRanking();
						Main.stulist[j].setRanking(++rank);
					}else {
						rank = Main.stulist[i].getRanking();
						Main.stulist[i].setRanking(++rank);
					}
				}
				for(Student s:Main.stulist) {
					if(s != null) {
						System.out.println(s.getName()+"학생의 석차: "+s.getRanking());
					}
				}	
			}
		}
	}	

	private void check() {//메뉴 구성
		while(true){
			int number2 =  View.submenu();
			switch(number2) {//인스턴스 찾기, prt 호출
			case 1 :
				int studentno = studentSelect(); 
				break;
			case 2 :
				subjectSelect();
				break;
			case 3 :
				return;
			default :
				View.wrong();
				break;
			}
		}
	}

	private void subjectSelect() {
		int subjectNo = View.subjectmenu();
		switch(subjectNo) {
		case 1 :
			checksunject(subjectNo);
			break; 
		case 2 :
			checksunject(subjectNo);
			break; 
		case 3 :
			checksunject(subjectNo);
			break;
		default :
			View.wrong();
		}
	}

	private void checksunject(int subjectNo) {//과목별 총점과 평균 구하기
		int total = 0;
		int cnt = 0;
		for(Student student:Main.stulist) {
			if (student != null) {
				total += student.getScores(subjectNo-1);
				cnt++;
			}
		}
		double avg = total/(double)cnt;
		View.subjectPrt(subjectNo,total,avg);
	}


	private int studentSelect() {
		System.out.println("조회하고자 하는 학생의 이름을 입력하세요.");
		String name = Main.scan.nextLine();
		int idx = -1;
		for (int i=0;i<Main.stulist.length;i++) {
			if(Main.stulist[i] != null) {
				if(Main.stulist[i].getName().equals(name)) {
					idx = i;
					return idx;
				}
			}
		}
		return idx;//(?)
	}

	private void input() {
		System.out.println("성적을 입력하시요");
		System.out.println("학생이름>");
		String name = Main.scan.nextLine();
		int[] scores = new int[3];
		System.out.println("국어 점수");
		scores[0] =Main.scan.nextInt();
		System.out.println("수학 점수");
		scores[1] =Main.scan.nextInt();
		System.out.println("영어 점수");
		scores[2] =Main.scan.nextInt();

		Student stu = new Student(name,scores);

		for (int i=0;i<Main.stulist.length;i++) {
			if(Main.stulist[i] == null)
				Main.stulist[i] = stu;
			break;
		}
		Main.scan.nextLine();
	}


}

