package fita.vnua.exam;

public class Test extends Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student st = new Student("Nguyen Thanh Nam", "Trau Quy-Gia Lam");
		st.addCourseGrade("Java", 9);
		st.addCourseGrade("CSDL", 8);
		st.addCourseGrade("Pascal", 10);
		st.addCourseGrade("Network", 6);
		
		System.out.println(st.toString());
		System.out.println("Diem TB: " + st.getAverageGrades());
	}

}
