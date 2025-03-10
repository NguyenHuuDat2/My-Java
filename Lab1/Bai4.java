package Lab1;
import java.util.*;
public class Bai4 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Nhap ho va ten : ");
		String hoTen=input.nextLine();
		tachHoTen(hoTen);
		input.close();
		
	}
	public static void tachHoTen(String hoTen) {
		hoTen=hoTen.trim();
		int khoangtrangcuoi=hoTen.lastIndexOf(" ");
		if(khoangtrangcuoi!=-1) {
			String hoVaTenDem=hoTen.substring(0,khoangtrangcuoi);
			String ten=hoTen.substring(khoangtrangcuoi+1);
			System.out.println("Ho va ten dem: " + hoVaTenDem);
            System.out.println("Ten: " + ten);
		}else {
			 System.out.println("Chuoi khong hop le.");
		}	
	}
}
