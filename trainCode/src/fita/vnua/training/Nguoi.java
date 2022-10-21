package fita.vnua.training;

import java.util.Date;
import java.util.Scanner;

public class Nguoi {
	protected String hoTen;
	protected Date ngaySinh;
	protected String queQuan;
	
	public Nguoi() {
		
	}
	
	public Nguoi(String hoTen, Date ngaySinh) {
		this.hoTen = hoTen;
		this.ngaySinh = ngaySinh;
	}
	public Nguoi(String hoTen, Date ngaySinh, String queQuan) {
		this(hoTen,ngaySinh);
		this.queQuan = queQuan;
	}
	
	public void nhapThongTin(Scanner sc) {
		System.out.println("Ho ten: ");
		hoTen = sc.nextLine();
		
		System.out.println("Ngay sinh: ");
		String ngaySinhStr = sc.nextLine();
		ngaySinh = Utils.stringToDate(ngaySinhStr);
		
		System.out.println("Que quan: ");
		queQuan = sc.nextLine();
	}
	
	public void inThongTin() {
		System.out.println("Ho ten:" + hoTen);
		System.out.println("Ngay sinh:" + ngaySinh);
		System.out.println("Que quan: " + queQuan);
	}
	
}
