package chapter12;

import java.util.HashSet;
import java.util.Set;

public class Main3 {

	public static void main(String[] args) {
		Set<Student> stus = new HashSet<>();
		
		stus.add(new Student (16,"고"));
		stus.add(new Student (20,"박"));
		stus.add(new Student (13,"김"));
		stus.add(new Student (13,"이"));
		stus.add(new Student (16,"김"));
		
		System.out.println(stus.size());

	}

}
