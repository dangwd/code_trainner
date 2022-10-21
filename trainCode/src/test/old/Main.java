package test.old;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HinhThoi ht = new HinhThoi();
		ht.inputLength();
		System.out.println("S= " + ht.dienTich());
		double a = ht.canhA();
		System.out.println("Canh ben a: " + a);
		System.out.println("Chu vi: " + ht.chuVi(a));
	}

}
