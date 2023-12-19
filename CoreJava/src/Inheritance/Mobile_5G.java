package Inheritance;

public class Mobile_5G extends Mobile_4G{
	
	
	public void Screen_recording()
	{
		System.out.println("screen recording");
	}
	
	public static void main(String[] args) {
		Mobile_5G M=new Mobile_5G();
		M.toString();
		M.text_msg();
		M.voice_call();
		M.video_call();
		M.Screen_recording();
		
		
		Mobile_3G m1=new Mobile_3G();
		m1.voice_call();
		m1.text_msg();
		m1.toString();
	}
	


}
