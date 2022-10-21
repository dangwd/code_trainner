package ontap.kt;

import java.util.ArrayList;
import java.util.Scanner;

public class QLHS {
	private ArrayList<HocSinh> dshs;

	public QLHS() {
		dshs = new ArrayList<HocSinh>(100);

	}

	public void themHocSinh(HocSinh hs) {
		dshs.add(hs);
	}

	public void nhapDanhSach(Scanner sc) {
		HocSinh hs;
		System.out.println("\tNhap so hoc sinh: ");
		int n = sc.nextInt();
		sc.nextLine();

		System.out.println("\tNhap vao danh sach: ");
		for (int i = 0; i < n; i++) {
			System.out.println("\tHoc sinh thu " + (i + 1) + " la: ");
			hs = new HocSinh();
			hs.nhapThongTin(sc);
			themHocSinh(hs);
		}

	}

	public void inDanhSach() {
		for (HocSinh hs : dshs) {
			hs.inThongTin();
		}
	}

	public void timKiemHocSinh(String ngaySinh, String queQuan) {
		for (HocSinh hs : dshs) {
			if (ngaySinh.equals(hs.ngaySinh) && queQuan.equals(hs.queQuan)) {
				hs.inThongTin();
			}
		}
	}

	public void timKiemHocSinh(String lop) {
		for (HocSinh hs : dshs) {
			if (lop.equals(hs.getLop())) {
				hs.inThongTin();
			}
		}
	}

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
		QLHS ql = new QLHS();
		Scanner sc = new Scanner(System.in);
		ql.nhapDanhSach(sc);
		ql.inDanhSach();
		ql.timKiemHocSinh("1985", "Thai Nguyen");
		ql.timKiemHocSinh("10A1");

	}

}
