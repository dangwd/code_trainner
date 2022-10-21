package fita.vnua.hw;

import java.util.Scanner;

public class CongNhan extends CanBo {
	private String bac;
	
	public CongNhan() {
		
	}
	
	public CongNhan(String bac) {
		this.bac = bac;
	}
	
	@Override
	public void nhapThongTin(Scanner sc) {
		// TODO Auto-generated method stub
		super.nhapThongTin(sc);
		
		System.out.println("Nhap vao cap bac: ");
		bac = sc.nextLine();
	}

	public String getBac() {
		return bac;
	}

	public void setBac(String bac) {
		this.bac = bac;
	}
	
	
}
