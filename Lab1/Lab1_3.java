package Lab1;

import java.util.*;

public class Lab1_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a[], n;
        System.out.print("Nhap so phan tu: ");
        n = input.nextInt();
        a = new int[n];
        for(int i=0; i<a.length; i++) {
            System.out.print("a[" + i + "]= ");
            a[i] = input.nextInt();
        }
        System.out.print("\nMang vua nhap: ");
        XuatMang(a);
        System.out.print("\n\nTong cac phan tu: " + Tong(a));
        System.out.print("\n\nTong cac phan tu le: " +TongLe(a));
        input.close();
    }

    public static void XuatMang(int a[]) {
        for(int i=0; i<a.length; i++)
            System.out.print("\t" + a[i]);
    }

    public static int Tong(int a[]) {
        int tong = 0;
        for(int i=0; i<a.length; i++)
            tong += a[i];
        return tong;
    }
    
    public static int TongLe(int a[]) {
    	int tongLe=0;
    	for(int i=0;i<a.length;i++) {
    		if(a[i]%2!=0) {
    			tongLe+=a[i];
    		}
    	}
    	return tongLe;
    }
    
    
}
