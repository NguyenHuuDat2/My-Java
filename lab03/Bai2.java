package lab03;

import java.util.Scanner;

public class Bai2 {

	public static void main(String[] args) {
		System.out.print("Nhap 1 so nguyen : ");
		int n = new Scanner(System.in).nextInt();
		for (int i = 1; i <= 10; i++) {
			System.out.printf(" %d x %d = %d \n ", n, i, n * i);
		}

	}

}
