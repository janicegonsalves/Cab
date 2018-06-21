package complete;

public class Cab {

	public static void main(String[] args) {
	String s1="   hello";
	String s2="jab";
	String s3=s1+" "+s2;
	System.out.println(s3);
	s1.equals(s2);
	s2.equals(s3);
	System.out.println(s1.compareTo(s2));
	System.out.println(s1.replace('l','i'));
	System.out.println(s1.substring(3));
	System.out.println(s3.length());
	System.out.println(s3.trim());
	}

}
