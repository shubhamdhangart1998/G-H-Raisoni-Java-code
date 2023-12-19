//WAP Count the numbers of words in program
package String_1;


public class CountString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Hello friends how r u, today is our class on String Handling"+"Here we 10 people are working together ";
		String nstr=" ";
		//System.out.println(str.split(" ").length);
		String arr[]=str.split(" ");
		int countWords=arr.length;           //for count the number of words
		System.out.println(countWords);
		int count=0;                         //for vowels
		for(int i=0;i<str.length();i++) {
		if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'||
		str.charAt(i)=='A'||str.charAt(i)=='E'||str.charAt(i)=='I'||str.charAt(i)=='O'||str.charAt(i)=='U')
		count++;
		}
		System.out.println("Vowels is String:"+count);
		/*for(int j=0;j<str.length();j++) {    //for reverse
			char ch=str.charAt(j);
			nstr=ch+nstr;
			
		}
		System.out.println(nstr);*/
		for(int i=str.length()-1;i>0;i--)
			System.out.print(str.charAt(i));
		
	}

}
