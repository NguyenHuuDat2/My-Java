package BaiTapChuong2;

import java.util.Scanner;

public class Cau1 {
//Tao chuong trinh trinh fibonacci
	/*
	 * public static int fibonacci(int n) {// de quy if (n <= 1) return n; return
	 * fibonacci(n - 1) + fibonacci(n - 2); }
	 */
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Nhap so luong fibonanci : ");
		int n = scn.nextInt();
		// dung vong lap

		int a = 0, b = 1;
		System.out.print(" Day fibonanci :" + a + " " + b + " ");
		for (int i = 2; i <= n; i++) {
			int next = a + b;
			System.out.print(next + " ");
			a = b;
			b = next;
		}

		// dung de qui
		/* System.out.println("Fibonancci thu " + n + " la : " + fibonacci(n)); */
		scn.close();
	}

}

//qui hoach dong
/*
 * public static int fibonacci(int n) { if (n <= 1) return n; int[] f = new
 * int[n + 1]; f[0] = 0; f[1] = 1; for (int i = 2; i <= n; i++) { f[i] = f[i -
 * 1] + f[i - 2]; } return f[n]; }
 */
