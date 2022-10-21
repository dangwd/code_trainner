package fita.vnua.bai9;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		QuanLy ql = new QuanLy();
		
		ql.nhapDanhSach(sc);
		System.out.println("Danh sach sinh vien tra sach: vao cuoi thang :");
		ql.hienThiDanhSachTraCuoiThang();
		sc.close();
	}

}
