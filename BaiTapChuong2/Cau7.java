package BaiTapChuong2;

import java.util.Scanner;

public class Cau7 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int[] day = new int[10];
		System.out.println("Nhap 10 so nguyen :");
		for (int i = 0; i < 10; i++) {
			System.out.print("Phan tu thu " + (i + 1) + " :");
			day[i] = scn.nextInt();
		}
		int max = day[0];
		for (int i = 1; i < 10; i++) {
			if (day[i] > max) {
				max = day[i];
			}
		}
		System.out.println("Max=: " + max);

	}

}
