package switch1;

public class Vote {
	
	public static void checkmarks(int marks)
	{
		if(marks < 35)
		{
			throw new  Invalidpassingcriteria("passing critera not fullfil");
		}
		
		else {
			System.out.println("pass");
		}
	}

	 public static void main(String[] args) {
		 
		
		Vote v = new Vote();
				
		v.checkmarks(23);
	}
}
