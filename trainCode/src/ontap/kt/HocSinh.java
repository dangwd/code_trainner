package ontap.kt;

import java.util.Scanner;

public class HocSinh extends Nguoi {
	private String lop;
	private String khoaHoc;
	private String kyHoc;

	public HocSinh() {

	}

	public HocSinh(String hoTen, String ngaySinh, String lop, String khoaHoc) {
		this.hoTen = hoTen;
		this.ngaySinh = ngaySinh;
		this.lop = lop;
		this.khoaHoc = khoaHoc;
	}

	public HocSinh(String lop, String khoaHoc) {
		this.lop = lop;
		this.khoaHoc = khoaHoc;
	}

	public void nhapThongTin(Scanner sc) {
		super.nhapThongTin(sc);
		System.out.println("\tNhap vao lop: ");
		lop = sc.nextLine();
		System.out.println("\tNhap vao khoa hoc: ");
		khoaHoc = sc.nextLine();
		System.out.println("\tNhap vao ky hoc: ");
		kyHoc = sc.nextLine();
	}

	public void inThongTin() {
		super.inThongTin();
		System.out.println("\tLop: " + lop);
		System.out.println("\tKhoa hoc: " + khoaHoc);
		System.out.println("\tKy hoc: " + kyHoc);
	}

	public String getLop() {
		return lop;
	}
}
