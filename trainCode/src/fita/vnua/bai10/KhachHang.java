package fita.vnua.bai10;

import java.util.Scanner;

public class KhachHang {
	// Thuoc tinh
	protected String tenChuHo;
	protected int soNha;
	protected String maCongTo;

	// Phuong thuc
	public KhachHang() {

	}

	public KhachHang(String tenChuHo, int soNha, String maCongTo) {
		this.tenChuHo = tenChuHo;
		this.soNha = soNha;
		this.maCongTo = maCongTo;
	}

	// Ham nhap
	public void nhapThongTin(Scanner sc) {
		System.out.println("\tNhap ten chu ho: ");
		tenChuHo = sc.nextLine();
		System.out.println("\tNhap so nha: ");
		soNha = sc.nextInt();
		sc.nextLine();
		System.out.println("\tNhap ma cong to: ");
		maCongTo = sc.nextLine();
	}

	// Hien thi thong tin
	public void hienThiThongTin() {
		System.out.println("\tTen chu ho: " + tenChuHo);
		System.out.println("\tSo nha: " + soNha);
		System.out.println("\tMa cong to: " + maCongTo);
	}
}
