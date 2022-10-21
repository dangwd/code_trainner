package fita.vnua.bai8;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLy {
	// Thuoc tinh
	private ArrayList<CBGV> ds;

	// Phuong thuc
	// Ham khoi tao
	public QuanLy() {
		ds = new ArrayList<CBGV>(10);
	}

	public void themCBGV(CBGV canBo) {
		ds.add(canBo);
	}

	// Ham nhap vao danh sach
	public void nhapDanhSach(Scanner sc) {
		CBGV canBo;

		System.out.println("Nhap vao so luong can bo: ");
		int n = sc.nextInt();
		sc.nextLine();

		System.out.println("\tNhap vao danh sach:");
		for (int i = 0; i < n; i++) {
			System.out.println("Can bo thu: " + (i + 1) + "la:");
			canBo = new CBGV();
			canBo.nhapThongTin(sc);
			themCBGV(canBo);
		}
	}

	// Hien thi danh sach
	public void hienThiDanhSach() {
		for (CBGV cbgv : ds) {
			cbgv.hienThiThongTin();
		}
	}

	// Ham tim kiem
	public void timKiem(double luong) {
		for (CBGV cbgv : ds) {
			if (cbgv.getLuongThucLinh() >= luong) {
				cbgv.hienThiThongTin();
			}
		}

	}

}
