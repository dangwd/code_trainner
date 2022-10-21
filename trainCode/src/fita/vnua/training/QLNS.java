package fita.vnua.training;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class QLNS {
	private List<Nguoi> dsns;
	
	public QLNS() {
		dsns = new ArrayList<Nguoi>(100);
	}
	
	public void themNhanSu(Nguoi ns) {
		dsns.add(ns);
	}
	
	public void nhapDanhSach(Scanner sc) {
		System.out.println("Nhap so nhan su n: ");
		
		int n = sc.nextInt(); sc.nextLine();
		int chon = 0;
		Nguoi ns = null;
		for (int i = 0; i < n; i++) {
			System.out.println("Chon loai nhan su muon nhap(0: hs, 1: sv)");
			chon = sc.nextInt(); sc.nextLine();
			switch (chon) {
			case 0:
				ns = new HocSinh();
				break;
			case 1:
				ns = new SinhVien();
				break;
			}
			ns.nhapThongTin(sc);
			themNhanSu(ns);
		}
	}
	
	public void inDanhSach() {
		// TODO Auto-generated method stub
		for (Nguoi ns : dsns) {
			ns.inThongTin();
		}
	}
	
	public void timKiemTheoMSV(String msv) {
		for (Nguoi ns : dsns) {
			if(ns instanceof SinhVien) {
				SinhVien sv = (SinhVien)ns;
				
				if(msv.equals(sv.getMsv())) {
					sv.inThongTin();
				}
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QLNS ql = new QLNS();
		Scanner sc = new Scanner(System.in);
		ql.nhapDanhSach(sc);
		ql.inDanhSach();
		ql.timKiemTheoMSV("CNTTA");
	}

}
