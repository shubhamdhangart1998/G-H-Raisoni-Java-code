package String_1;

public class StringDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Java";
		System.out.println(s1);
		char ch=s1.charAt(1);
		System.out.println(ch);
		int i=s1.codePointAt(0);
		System.out.println(i);
		System.out.println(s1.codePointBefore(3));
		String s2="Raj";
		int cn=s1.compareTo(s2);
		System.out.println(cn);
		boolean b=s1.contains("av");
		System.out.println(b);
		char[] arr= {'R','a','j'};
		String s=String.copyValueOf(arr);
		System.out.println(s);
		System.out.println(s1.intern());
		System.out.println(s1.length());
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		System.out.println(s2.length());
		System.out.println(s1.concat(s2));
		String s3=s1.concat(s2.trim());
		System.out.println(s3);
		System.out.println(s2.trim());
		System.out.println(s2.codePointAt(1));

	}

}
