package fita.vnua.hw;

import java.util.Scanner;

public class KySu extends CanBo {
	private String nganhDaoTao;
	
	public KySu() {
		
	}
	public KySu(String nganhDaoTao) {
		this.nganhDaoTao = nganhDaoTao;
	}
	
	@Override
	public void nhapThongTin(Scanner sc) {
		// TODO Auto-generated method stub
		super.nhapThongTin(sc);
		
		System.out.println("Nhap vao nganh dao tao: ");
		nganhDaoTao = sc.nextLine();
	}
	public String getNganhDaoTao() {
		return nganhDaoTao;
	}
	public void setNganhDaoTao(String nganhDaoTao) {
		this.nganhDaoTao = nganhDaoTao;
	}
	
	
}
