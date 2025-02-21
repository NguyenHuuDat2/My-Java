package BaiTapChuong2;

import java.util.Scanner;

public class Cau8 {
//cac snt <n
	public static void main(String[] args) {
		System.out.print("Nhap 1 so nguyen (VD= 30) : ");
		int n = new Scanner(System.in).nextInt();
		boolean[] isPrime = new boolean[n];
		for (int i = 2; i < n; i++) {
			isPrime[i] = true;
		}

		for (int i = 2; i < n; i++) {
			if (isPrime[i]) {
				for (int j = i * 2; j < n; j += i) {
					isPrime[j] = false;
				}
			}
		}

		System.out.print("Các số nguyên tố nhỏ hơn " + n + ": ");
		for (int i = 2; i < n; i++) {
			if (isPrime[i]) {
				System.out.print(i + " ");
			}
		}

	}

}
