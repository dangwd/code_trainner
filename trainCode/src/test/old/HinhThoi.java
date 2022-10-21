package test.old;

import java.util.Scanner;

public class HinhThoi {
	private double dc1;
	private double dc2;
	
	public HinhThoi() {
	
	}
	public HinhThoi(double dc1, double dc2) {
		this.dc1 = dc1;
		this.dc2 = dc2;
	}
	public double getDc1() {
		return dc1;
	}
	public void setDc1(double dc1) {
		this.dc1 = dc1;
	}
	public double getDc2() {
		return dc2;
	}
	public void setDc2(double dc2) {
		this.dc2 = dc2;
	}
	
	public void inputLength() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap do dai duong cheo thu 1:");
		dc1 = sc.nextDouble();
		System.out.println("Nhap do dai duong cheo thu 2: ");
		dc2 = sc.nextDouble();
	}
	
	public String dienTich() {
		return dc1 * dc2 * 0.5 + "";
	}
	public double canhA() {
		return Math.sqrt(dc1 * dc1 + dc2 * dc2);
	}
	public String chuVi(double a) {
		return 4 * a + "";
	}
}
