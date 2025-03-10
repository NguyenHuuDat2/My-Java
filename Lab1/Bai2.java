package Lab1;
import java.util.*;
public class Bai2 {
public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	System.out.print("Nhap vao thang (1-12): ");
	int thang=input.nextInt();
	String qui=" ";
	switch(thang) {
	case 1: case 2: case 3:
        qui = " 1";
        break;
    case 4: case 5: case 6:
        qui = " 2";
        break;
    case 7: case 8: case 9:
        qui = " 3";
        break;
    case 10: case 11: case 12:
        qui = " 4";
        break;
    default:
        System.out.println("Lỗi: tháng không hợp lệ!");
	}
	System.out.println("Thang a"+ thang+ " thuoc Qui "+ qui);
	input.close();
}
}
