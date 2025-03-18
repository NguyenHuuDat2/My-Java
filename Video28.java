package chapter4;

public class Video28 {
	public static void main(String[] args) {
		System.out.println("Run video 28");
		Student st1 = new Student();
		Student st2 = new Student("Dat", 20);
		st2.setName("Eric new setName");
		System.out.println("Check obj: " + st2.getName() + " va tuoi : " + st2.getAge());
	}
}
