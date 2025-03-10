package Lab1;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
public class Lab1_5 {
	public static void main(String[] args) {
		SimpleDateFormat  sdf=new SimpleDateFormat("dd/MM/yyyy");
		Date date;
		date=new Date();
		System.out.println("Ngay hien tai: "+sdf.format(date));
		SimpleDateFormat  sdf1=new SimpleDateFormat("yyyy-MM-dd");
		System.out.println("Ngay hien tai 1: "+sdf1.format(date));
		Scanner input = new Scanner(System.in);
        System.out.print("Nhập ngày tháng năm (dd/MM/yyyy): ");
        String inputDateStr = input.nextLine();

       
        SimpleDateFormat sdfCompare = new SimpleDateFormat("dd/MM/yyyy");
        sdfCompare.setLenient(false); 

        try {
       
            Date inputDate = sdfCompare.parse(inputDateStr);
            Date currentDate = new Date(); 


            if (inputDate.before(currentDate)) {
                System.out.println("Ngày nhập vào trước ngày hiện tại.");
            } else if (inputDate.after(currentDate)) {
                System.out.println("Ngày nhập vào sau ngày hiện tại.");
            } else {
                System.out.println("Ngày nhập vào bằng ngày hiện tại.");
            }
        } catch (ParseException e) {
            System.out.println("Định dạng ngày không hợp lệ.");
        }
        input.close();
	}
}
