package fita.vnua.bai10;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		QuanLy ql = new QuanLy();
		ql.nhapDanhSach(sc);
		System.out.println("Danh sach bien lai cua cac ho gia dinh la: ");
		ql.hienThiDanhSach();

		sc.close();
	}

}
