package Lab1;
import java.util.*;
public class lab1_2 {
public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	float x,y,ketqua=0;
	String c;
	System.out.print("x = ");
	x=input.nextFloat();
	System.out.print("y = ");
	y=input.nextFloat();
	input.nextLine();
	System.out.print("Phep toan: ");
	c=input.nextLine();
	switch(c) {
	case "+":
		ketqua=x+y;
		break;
	case "-":
		ketqua=x-y;
		break;
	case "*":
		ketqua=x*y;
		break;
	case "/":
		if(y!=0)
		{
		ketqua=x/y;
		}else {
			System.out.println("Loi : Chia cho 0!");
		}
		break;
	default:
		System.out.println("Nhap sai phep toan!");
		break;
	}
	
		
	System.out.println(x+" "+c+" "+y+" = "+ ketqua);
	input.close();
	
}
}
