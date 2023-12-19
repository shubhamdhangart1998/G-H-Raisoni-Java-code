package FileHandling;



import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;

public class CopyPestDemo {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		File file=new File("C:\\Users\\Shubham\\OneDrive\\Pictures\\Screenshots\\2023-07-30.png");
		FileInputStream fis=new FileInputStream(file);
		FileOutputStream fos=new FileOutputStream("D:/2023-07-30.png");
		int d;
		while((d=fis.read())!=-1) {
			fos.write((char)d);
			System.out.print((char)d);
		}
		fis.close();
		fos.close();

	}

}
