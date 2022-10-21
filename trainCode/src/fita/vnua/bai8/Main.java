package fita.vnua.bai8;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		QuanLy ql = new QuanLy();
		ql.nhapDanhSach(sc);
		System.out.println("Danh sach nhung can bo co luong >= 8M: " );
		ql.timKiem(8000000);
		sc.close();
	}

}
