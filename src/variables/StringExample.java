package variables;

public class StringExample {
	
	public static void main(String[] args) {
		//Immutuble
		String s1="venkat";
		String s2="venkat";
		
		System.out.println(s1);
		s1.concat("suresh");
		System.out.println(s1);
		
		//mutuble
		StringBuilder sb = new StringBuilder("venkat");
		sb.append("suresh");
		System.out.println(sb);
		
		//compare
		String s3="venkat";
		String s4="venkats";
		System.out.println(s3.equals(s4));
		System.out.println(s3.equalsIgnoreCase(s4));
		System.out.println(s3.compareTo(s4));
		
		String a ="100";
		Integer.parseInt(a);
		Integer i =10;
		Object o = i;
		int a1 =20;
		Integer b = a1;
		int c = b;
		System.out.println(b.floatValue());
		System.out.println(b.doubleValue());
		
		
		
	}
	
	

}
