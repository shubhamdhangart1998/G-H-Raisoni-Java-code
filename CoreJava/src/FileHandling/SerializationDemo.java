package FileHandling;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
public class SerializationDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream fos=new FileOutputStream("D:/empDetails.txt");
		Employee emp=new Employee();
		emp.setEmpid(101);
		emp.setEmpName("sonam");
		emp.setAdd("Pune");
		emp.setEmpSal(6000.75);
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(emp);
		System.out.println("Success");
		oos.close();
		fos.close();

	}

}
