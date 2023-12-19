package String_1;

public class StringDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1=new String("Sonam");
		String s2=new String("Pune");
		String s3=new String("Sonam");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		/*System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());*/
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s1.equals(s3));
		String str1="Pune";
		String str2="Mumbai";
		String str3="Pune";
		System.out.println("---------------------------");
		System.out.println(str1==str3);
		System.out.println(str1.equals(str3));
		System.out.println("Addresssssss");

	}

}
