package fita.vnua.bai10;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLy {
	// Thuoc tinh
	private ArrayList<BienLai> ds;

	// Phuong thuc
	public QuanLy() {
		ds = new ArrayList<BienLai>(10);
	}

	// Ham them bien lai
	public void themBienLai(BienLai bienLai) {
		ds.add(bienLai);
	}

	public void nhapDanhSach(Scanner sc) {
		BienLai bienLai;
		System.out.print("\tNhap vao so luong bien lai: ");
		int n = sc.nextInt();
		sc.nextLine();
		System.out.println("\tNhap vao danh sach bien lai: ");
		for (int i = 0; i < n; i++) {
			System.out.println("Bien lai thu " + (i + 1) + " la :");
			bienLai = new BienLai();
			bienLai.nhapThongTin(sc);

			themBienLai(bienLai);
		}
	}

	// Hien thi danh sach
	public void hienThiDanhSach() {
		for (int i = 0; i < ds.size(); i++) {
			System.out.println("Bien lai thu " + (i + 1) + "la: ");
			ds.get(i).hienThiThongTin();
			System.out.println("\n");
		}
	}
}
