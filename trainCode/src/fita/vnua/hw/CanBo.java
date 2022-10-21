package fita.vnua.hw;

import java.util.Scanner;

public class CanBo {
	private String hoTen;
	private String ngaySinh;
	private String gioiTinh;
	private String diaChi;
	
	public CanBo() {
		
	}
	
	public CanBo(String hoTen, String gioiTinh, String diaChi, String ngaySinh) {
		this.hoTen = hoTen;
		this.gioiTinh = gioiTinh;
		this.diaChi = diaChi;
		this.ngaySinh = ngaySinh;
	}
	
	public void nhapThongTin(Scanner sc) {
		System.out.println("Nhap vao ho ten: ");
		hoTen = sc.nextLine();
		System.out.println("Nhap vao gioi tinh: ");
		gioiTinh = sc.nextLine();
		System.out.println("Nhap vao dia chi: ");
		diaChi = sc.nextLine();
		System.out.println("Nhap vao ngay sinh: ");
		ngaySinh = sc.nextLine();
	}
	
	public void timKiemCanBo() {
		
	}
	
	public void inThongTin() {
		System.out.println("Ho ten: " + hoTen);
		System.out.println("Gioi tinh: " + gioiTinh);
		System.out.println("Dia chi: " + diaChi);
		System.out.println("Ngay sinh: " + ngaySinh);
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public String getNgaySinh() {
		return ngaySinh;
	}

	public void setNgaySinh(String ngaySinh) {
		this.ngaySinh = ngaySinh;
	}

	public String getGioiTinh() {
		return gioiTinh;
	}

	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	
	
}
