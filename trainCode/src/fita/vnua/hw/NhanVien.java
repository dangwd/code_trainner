package fita.vnua.hw;

import java.util.Scanner;

public class NhanVien extends CanBo {
	private String congViec;
	
	public NhanVien() {
		
	}
	
	public NhanVien(String congViec) {
		this.congViec = congViec;
	}
	
	@Override
	public void nhapThongTin(Scanner sc) {
		// TODO Auto-generated method stub
		super.nhapThongTin(sc);
		
		System.out.println("Nhap vao cong viec: ");
		congViec = sc.nextLine();
	}
	
	public String getCongViec() {
		return congViec;
	}
}
