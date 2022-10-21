package fita.vnua.bai9;

import java.util.Scanner;

public class SinhVien {
	// Thuoc tinh
	protected String hoTen;
	protected String maSV;
	protected String ngaySinh;
	protected String lop;

	// Phuong thuc
	// Ham khong doi so
	public SinhVien() {

	}

	// Ham co doi so
	public SinhVien(String hoTen, String maSV, String ngaySinh, String lop) {
		this.hoTen = hoTen;
		this.maSV = maSV;
		this.ngaySinh = ngaySinh;
		this.lop = lop;
	}

	// Ham nhap
	public void nhapThongTin(Scanner sc) {
		System.out.println("\tNhap vao ho ten:");
		hoTen = sc.nextLine();
		System.out.println("\tNhap vao ma SV:");
		maSV = sc.nextLine();
		System.out.println("\tNhap vao ngay sinh:");
		ngaySinh = sc.nextLine();
		System.out.println("\tNhap vao lop:");
		lop = sc.nextLine();
	}

	// Ham hien thi
	public void hienThiThongTin() {
		System.out.println("\tHo ten: " + hoTen);
		System.out.println("\tNgay sinh: " + ngaySinh);
		System.out.println("\tMa SV: " + maSV);
		System.out.println("\tLop: " + lop);
	}
}
