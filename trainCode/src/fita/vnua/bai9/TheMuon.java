package fita.vnua.bai9;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class TheMuon extends SinhVien {
	private int soMuon;
	private Date ngayMuon;
	private Date hanTra;
	private String soHieu;

	// Phuong thuc
	public TheMuon() {

	}

	public TheMuon(int soMuon, Date ngayMuon, String soHieu) {
		this.soHieu = soHieu;
		this.soMuon = soMuon;
		this.ngayMuon = ngayMuon;
	}

	// Ham nhap
	public void nhapThongTin(Scanner sc) {
		super.nhapThongTin(sc);
		System.out.print("\tNhap vao so muon: ");
		soMuon = sc.nextInt();
		sc.nextLine();

		System.out.print("\tNhap vao ngay muon: ");
		String strNgayMuon = sc.nextLine();
		ngayMuon = strToDate(strNgayMuon);

		String strNgayTra = "31-12-2022";
		hanTra = strToDate(strNgayTra);

		System.out.println("\tNhap so hieu: ");
		soHieu = sc.nextLine();
	}

	private Date strToDate(String strNgayMuon) {
		Date date = null;
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		try {
			date = sdf.parse(strNgayMuon);
		} catch (ParseException e) {
			System.out.println("Loi dinh dang!");
		}
		return date;
	}

	public void hienThiThongTin() {
		super.hienThiThongTin();
		System.out.println("\tSo phieu muon:" + soMuon);
		System.out.println("\tSo ngay muon:" + ngayMuon);
		System.out.println("\tHan tra:" + hanTra);
		System.out.println("\tSo hieu:" + soHieu);

	}

	// Ham lay ra thong tin ve han tra
	public Date getHanTra() {
		return hanTra;
	}
}
