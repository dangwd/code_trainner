package fita.vnua.bai8;

import java.util.Scanner;

public class Nguoi {
	// Thuoc tinh
	protected String hoTen;
	protected String ngaySinh;
	protected String queQuan;

	// Ham khoi tao khong doi so
	public Nguoi() {

	}

	// Ham khoi tao co doi so
	public Nguoi(String hoTen, String ngaySinh, String queQuan) {
		this.hoTen = hoTen;
		this.ngaySinh = ngaySinh;
		this.queQuan = queQuan;

	}

	// Ham nhap thong tin
	public void nhapThongTin(Scanner sc) {
		System.out.println("Ho ten:");
		hoTen = sc.nextLine();
		System.out.println("Ngay sinh:");
		ngaySinh = sc.nextLine();
		System.out.println("Que quan:");
		queQuan = sc.nextLine();
	}

	// Ham hien thi
	public void hienThiThongTin() {
		System.out.println("\n Ho ten:" + hoTen);
		System.out.println("\n Ngay sinh:" + ngaySinh);
		System.out.println("\n Que quan: " + queQuan);
	}

}
