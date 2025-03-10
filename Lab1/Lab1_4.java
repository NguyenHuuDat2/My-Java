package Lab1;

public class Lab1_4 {
	public static void main(String[] args) {
		String s="   dai hoc     cong   nghe     sai gon   ";
		System.out.println("Chieu dai : "+s.length());
		s=s.trim();
		System.out.println("Bo khoang trang truoc va sau chuoi : '"+s+" '");
		s=s.replaceAll(" +", " ");
		System.out.println("Bo khoang trang du thua : '"+s+"'");
		s = firstoUpperWords(s);
		System.out.println(" Viet hoa chu cai dau moi tu: '"+s+"'");
	}
	public static String firstoUpperWords(String str) {
        StringBuilder capitalized = new StringBuilder(str);
        
        // Viết hoa chữ cái đầu của chuỗi
        if (capitalized.length() > 0) {
            capitalized.setCharAt(0, Character.toUpperCase(capitalized.charAt(0)));
        }
        
        int index = capitalized.indexOf(" ");
        while (index != -1) {
            // Viết hoa chữ cái ngay sau khoảng trắng
            if (index + 1 < capitalized.length()) {
                capitalized.setCharAt(index + 1, Character.toUpperCase(capitalized.charAt(index + 1)));
            }
            index = capitalized.indexOf(" ", index + 1);
        }
        
        return capitalized.toString();
    }
}



