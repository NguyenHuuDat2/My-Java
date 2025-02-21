package BaiTapChuong2;

import java.util.Scanner;

public class Cau5 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Nhap so nguyen (Vd 3 chu so) : ");
		int n = scn.nextInt();
		int sum = 0;
		int temp = Math.abs(n);
		while (temp > 0) {
			sum += temp % 10;
			temp /= 10;
		}
		System.out.println("Tong cac so " + n + " la: " + sum);
	}

}
