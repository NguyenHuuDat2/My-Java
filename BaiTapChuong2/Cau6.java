package BaiTapChuong2;

public class Cau6 {

	public static void main(String[] args) {

		System.out.print("Cac so armstrong co 3 chu so : ");

		for (int n = 100; n <= 999; n++) {
			int a = n / 100;
			int b = (n / 10) % 10;
			int c = n % 10;
			int sum = (a * a * a) + (b * b * b) + (int) (Math.pow(c, 3));
			if (n == sum) {
				System.out.println(n);
			}
		}

	}

}
