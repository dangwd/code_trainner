package fita.vnua.bai8;

import java.util.Scanner;

public class CBGV extends Nguoi {
	// Thuoc tinh
	private double luongCung;
	private double thuong;
	private double phat;
	private double luongThucLinh;

	// Phuong thuc
	public CBGV() {

	}

	// Ham nhap thong tin
	public void nhapThongTin(Scanner sc) {
		super.nhapThongTin(sc);
		System.out.println("\tNhap vao luong cung:");
		luongCung = sc.nextDouble();
		sc.nextLine();

		System.out.println("\tNhap vao thuong:");
		thuong = sc.nextDouble();
		sc.nextLine();

		System.out.println("\tNhap vao phat:");
		phat = sc.nextDouble();
		sc.nextLine();

		// Tinh luong
		luongThucLinh = luongCung + thuong + phat;
	}

	// Hien thi thong tin
	public void hienThiThongTin() {
		super.hienThiThongTin();
		System.out.println("\tLuong cung:" + luongCung);
		System.out.println("\tThuong: " + thuong);
		System.out.println("\tPhat: " + phat);
		System.out.println("\tLuong thuc linh:" + luongThucLinh);
	}
	
	//Ham lay ra thong tin luong thuc linh
	public double getLuongThucLinh() {
		return luongThucLinh;
	}
}
