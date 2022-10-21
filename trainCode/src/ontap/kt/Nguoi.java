package ontap.kt;

import java.util.Scanner;

public class Nguoi {
	protected String hoTen;
	protected String ngaySinh;
	protected String queQuan;

	public Nguoi() {

	}

	public Nguoi(String hoTen, String ngaySinh) {
		this.hoTen = hoTen;
		this.ngaySinh = ngaySinh;
	}

	public Nguoi(String hoTen, String ngaySinh, String queQuan) {
		this.hoTen = hoTen;
		this.ngaySinh = ngaySinh;
		this.queQuan = queQuan;
	}

	public void nhapThongTin(Scanner sc) {
		System.out.println("\tNhap vao ho ten: ");
		hoTen = sc.nextLine();
		System.out.println("\tNhap vao ngay sinh: ");
		ngaySinh = sc.nextLine();
		System.out.println("\tNhap vao que quan: ");
		queQuan = sc.nextLine();
	}

	public void inThongTin() {
		System.out.println("\tHo ten: " + hoTen);
		System.out.println("\tNgay sinh: " + ngaySinh);
		System.out.println("\tQue quan: " + queQuan);
	}

	public String getNgaySinh() {
		return ngaySinh;
	}

	public String getQueQuan() {
		return queQuan;
	}

}
