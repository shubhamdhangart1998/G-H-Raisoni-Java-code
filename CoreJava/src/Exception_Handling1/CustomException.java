package Exception_Handling1;
class MyJob{
	public static void salary()throws MyException{
		System.out.println("I am basic Salary......");
	}
	public static void hra_Salary()throws CustomException1{
		System.out.println("HRA applicable for WFO people only");
	}
}
class HaSalary{
	public void crossSalary()throws MyException{
		MyJob.salary();
		System.out.println("Cross Salary");
	}
	public void calculate() {
		MyJob.hra_Salary();
	}
}
public class CustomException {
	public static void main(String[] args) {
		
		try{
			throw new MyException("This is my own Bussiness Exception");
		}
		catch(MyException e) {
			System.err.println("Catching own bussiness Exception");
		}
	}

}
