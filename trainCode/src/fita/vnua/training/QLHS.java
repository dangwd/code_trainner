package fita.vnua.training;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QLHS {
	private List<HocSinh> dshs;	
	
	public QLHS() {
		dshs = new ArrayList<HocSinh>();
	}
	
	public void  themHocSinh(HocSinh hs) {
		dshs.add(hs);
	}
	
	public void inDanhSach() {
		for (HocSinh hs : dshs) {
			hs.inThongTin();
		}
	}
	
	public void nhapDanhSach(Scanner sc) {
		String chon = null;
		do {
			//Nhap thong tin hoc sinh
			HocSinh hs = new HocSinh();
			hs.nhapThongTin(sc);
			
			//Them hoc sinh vao danh sach
			themHocSinh(hs);
			
		} while (!"k".equalsIgnoreCase(chon));
	}
	
	public void timKiemHocSinh(int namSinh, String queQuan) {
		for (HocSinh hs : dshs) {
			if(hs.ngaySinh.getYear() + 1900 == namSinh && queQuan.equals(queQuan)) {
				hs.inThongTin();
			}
		}
	}
	
	public void timKiemHocSinh(String lop) {
		for(HocSinh hs: dshs) {
			if(lop.equals(hs.getLop())) {
				hs.inThongTin();
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		QLHS ql = new QLHS();
		
		ql.nhapDanhSach(sc);
		System.out.println("-------------");
		ql.inDanhSach();
		System.out.println("-------------");
		ql.timKiemHocSinh(1985, "Thai Nguyen");
		System.out.println("-------------");
		ql.timKiemHocSinh("10A1");
	}

}
