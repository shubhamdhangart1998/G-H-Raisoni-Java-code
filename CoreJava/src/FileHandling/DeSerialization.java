package FileHandling;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.FileNotFoundException;
public class DeSerialization {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		FileInputStream fis=new FileInputStream("D:/empDetails.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Object o=ois.readObject();
		Employee emp=(Employee)o;
		System.out.println(emp);
		ois.close();
		fis.close();
		

	}

}
