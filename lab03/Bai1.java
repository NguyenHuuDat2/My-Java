package lab03;

import java.util.Scanner;

public class Bai1 {

	public static void main(String[] args) {
		System.out.print("Nhap 1 so nguyen : ");
		int n = new Scanner(System.in).nextInt();
		int count = 0;
		for (int i = 2; i <= n - 1; i++) {
			if (n % i == 0) {
				System.out.println("Uoc so khac : " + i);
				count++;
				break;
			}
		}
		if (count == 0) {
			System.out.printf("%d la so nguyen to", n);
		} else {
			System.out.printf("%d khong phai snt", n);
		}
	}

}
