package lab02;

import java.util.Scanner;

public class Bai3 {

	public static void main(String[] args) {
		int tien;
		Scanner scn = new Scanner(System.in);
		System.out.println("Nhap so dien :");
		int dien = scn.nextInt();
		if (dien >= 0 && dien <= 100) {
			System.out.println("So tien dien la " + (dien * 1000));
		} else {
			System.out.println("So tien dien la " + (dien * 1000 + ((dien - 100) * 1500)));
		}

	}

}
