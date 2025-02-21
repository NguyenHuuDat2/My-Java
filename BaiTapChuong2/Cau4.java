package BaiTapChuong2;

import java.util.Scanner;

public class Cau4 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Nhap 3 so nguyen : ");
		int a = scn.nextInt();
		int b = scn.nextInt();
		int c = scn.nextInt();
		int max = Math.max(a, Math.max(b, c));
		System.out.println("Max =" + max);
	}

}
//dung if else
/*
 * if (b > max) { max = b; } if (c > max) { max = c; }
 */
//toan tu 3 ngoi
/* int max = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c); */
//array va for
/*
 * int[] numbers = {scn.nextInt(), scn.nextInt(), scn.nextInt()};
 * 
 * int max = numbers[0]; for (int num : numbers) { if (num > max) { max = num; }
 * }
 */
