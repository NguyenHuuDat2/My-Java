package lab03;

import java.util.Arrays;
import java.util.Scanner;

//viet chuong trinh nhap vao 1 mang so nguyen bat ky
//Sap xep va xuat mang
//xuat ptu nho nhat,lon nhat
public class Bai3 {

	public static void main(String[] args) {
		System.out.print("Nhap 1 so luong phan tu : ");
		int n = new Scanner(System.in).nextInt();
		int[] a = new int[n];
		System.out.println("Nhap gia tri vao mang : ");
		for (int i = 0; i < n; i++) {
			a[i] = new Scanner(System.in).nextInt();
		}
		System.out.println("Mang ban dau: " + Arrays.toString(a));

		/*
		 * Arrays.sort(a); System.out.println("Mang da sap xep: " + Arrays.toString(a));
		 * System.out.println("So lon nhat trong mang: " + a[a.length - 1]);
		 * System.out.println("So lon nhat trong mang: " + a[0]);
		 */
		int max = a[0];
		for (int i = 0; i < a.length; i++) {
			/*
			 * if (a[i] > max) { max = a[i]; }
			 */
			max = Math.max(max, a[i]);
		}
		System.out.println("Max =" + max);
		int min = a[0];
		for (int i = 0; i < a.length; i++) {

			min = Math.min(min, a[i]);
		}
		System.out.println("Min =" + min);
	}

}
