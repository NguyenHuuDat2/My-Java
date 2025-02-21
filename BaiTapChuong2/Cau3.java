package BaiTapChuong2;

import java.util.Scanner;

public class Cau3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập số có 3 chữ số: ");
		int n = sc.nextInt();

		// Kiểm tra số có 3 chữ số không
		if (n < 100 || n > 999) {
			System.out.println("Vui lòng nhập số có đúng 3 chữ số!");
		} else {
			// Tách từng chữ số
			int ones = n % 10;
			int tens = (n / 10) % 10;
			int hundreds = n / 100;
			System.out.println("Số đảo ngược: " + ones + " " + tens + " " + hundreds);

		}

	}

}
