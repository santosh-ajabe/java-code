package switch1;

public class Stringex1 {
	
	public static void check(String str)
	{
		str = str.toLowerCase();
		//System.out.println(str.length());
		
		int cnt=0;
		for(int i=0; i<str.length();i++)
		{
			if(str.charAt(i)=='i' || str.charAt(i)=='I')
			{
				cnt++;
			}
		}
		System.out.println(cnt);
	}

	 public static void main(String[] args) {
		check("ajabe iIajba");
	}
}
