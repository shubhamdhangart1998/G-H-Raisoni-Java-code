package String_1;


public class StringBuilderDemo {
	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder("Pune");
		System.out.println(sb);
		sb.append(" City");
		System.out.println(sb);
		sb.insert(4, " old");
		System.out.println(sb);
		String s=sb.toString();
		boolean b=s.contains("old");
		System.out.println(b);
		sb.replace(5, 9, "new ");
		System.out.println(sb);
		sb.setCharAt(0, 'k');
		System.out.println(sb);
		sb.deleteCharAt(0);
		System.out.println(sb);
		sb.delete(6, 8);
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
	}

}
