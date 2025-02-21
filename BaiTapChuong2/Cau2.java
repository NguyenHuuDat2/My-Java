package BaiTapChuong2;

public class Cau2 {

	public static void main(String[] args) {

		int a = 10, b = 5;

		int result1 = (a << 2) + (b >> 2);
		boolean result2 = b > 0;
		int result3 = (a + b * 100) / 10;
		int result4 = a & b;

		System.out.println("(a << 2) + (b >> 2) = " + result1);
		System.out.println("b > 0 = " + result2);
		System.out.println("(a + b * 100) / 10 = " + result3);
		System.out.println("a & b = " + result4);

	}

}
