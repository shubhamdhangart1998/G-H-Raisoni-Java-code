package controlStatement;

public class SwitchStaement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int abc=6;     //declared and initialized
		
		switch(abc)
		{
		case 1:{
			int a=2;
			String name="chaitali";
			double salary=4152.23;
			float empid=12.35f;
			
			System.out.println(name+"   "+salary+"   "+empid+"   "+a);
	
			
			System.out.println("sunday");
			
			
		}
		break;
		
		case 2:System.out.println("monday");
		break;
		
		case 3:System.out.println("tuesday");
		break;
		
		case 4:System.out.println("wednsday");
		break;
		
		case 5:System.out.println("thursday");
		break;
		
		case 6:System.out.println("friday");
		break;
		
		case 7:
			System.out.println("saturday");
		break;
		
		case 8:System.out.println("there r only 7 days in a week ");
		break;
		
		default:System.out.println("invalid days");
	    
		
		
		
		}
			

	}

}
