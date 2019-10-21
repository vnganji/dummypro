package variables;

public class example4 {

	int rollno;
	String name;
	String course;
	static String institute = "magneq";

	public static void main(String[] args) {
		
		example4 st1 = new example4();
		System.out.println(st1.hashCode());
		st1.addStudent(100, "alok", "java");
		st1.printStudnet();
		example4 st2 = new example4();
		System.out.println(st2.hashCode());
		st2.addStudent(101, "Arvind", "java");
		st2.printStudnet();
		
		

	}

	public void addStudent(int rollno , String name, String course) {

		this.rollno = rollno;
		this.name = name;
		this.course = course;
	}

	public  void printStudnet() {

		System.out.println(this.rollno);
		System.out.println(name);
		System.out.println(course);

}}
