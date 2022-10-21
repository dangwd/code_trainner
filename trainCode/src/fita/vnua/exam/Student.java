package fita.vnua.exam;

public class Student extends Person {
	private int numCourses ;
	private String [] courses = new String[30];
	private int [] grades = new int[30];
	
	public Student() {
		
	}
	public Student(String name, String address) {
		super(name, address);
	}
	@Override
	public String toString() {
		return "Student: " + getName() + "(" + getAddress() + ")";
	}
	
	public void addCourseGrade(String course,  int grade) {
		courses[numCourses] = course;
		grades[numCourses] = grade;
		numCourses ++;
		System.out.println(numCourses);
	}
	
	public double getAverageGrades() {
		int Tong = 0;
		for (int i = 0; i < numCourses; i++) {
			Tong += grades[i];
		}
		double tb =(double)Tong/numCourses;
		return tb;
	}
	public int[] getGrades() {
		return grades;
	}
}
