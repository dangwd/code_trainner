package fita.vnua.bai9;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLy {
	private ArrayList<TheMuon> ds;

	public QuanLy() {
		ds = new ArrayList<TheMuon>(10);
	}

	// Ham them the muon
	public void themTheMuon(TheMuon theMuon) {
		ds.add(theMuon);
	}

	// Ham nhap vao danh sach
	public void nhapDanhSach(Scanner sc) {
		TheMuon theMuon;

		System.out.println("\tNhap vao so the muon: ");
		int n = sc.nextInt();
		sc.nextLine();

		System.out.println("\tNhap vao danh sach: ");
		for (int i = 0; i < n; i++) {
			System.out.println("\tThe muon thu" + (i + 1) + "la: ");
			theMuon = new TheMuon();
			theMuon.nhapThongTin(sc);
			themTheMuon(theMuon);
		}
	}

	// Hien thi danh sach
	public void hienThiDanhSachTraCuoiThang() {
		for (TheMuon theMuon : ds) {
			if (theMuon.getHanTra().getDate() == 31 || theMuon.getHanTra().getDate() == 30) {
				theMuon.hienThiThongTin();
			}
		}
	}
}
