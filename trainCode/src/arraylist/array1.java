package arraylist;

import java.util.Scanner;

public class array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao so nguyen n: ");
		int n = sc.nextInt();
		
		int array [] = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Nhap vao so thu " +(i+1));
			array[i] = sc.nextInt();
		}
		
		for (int i = 0; i<array.length;i++) {
			System.out.print(array[i]+" ");
		}
	}

}
