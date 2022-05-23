package SGP;

import java.util.ArrayList;

public class stringOcccurance2 {

	public static void main(String[] args)
	{
		
		String a = "SSAALLL";
		ArrayList<Character> al = new ArrayList<Character>();
		
		for(int i=0;i<a.length();i++)
		{
			int count = 0;
			if(!al.contains(a.charAt(i)))
					{
						al.add(a.charAt(i));
						count++;
						for(int j=i+1;j<a.length();j++)
						{
							if(a.charAt(i)==a.charAt(j))
							{
								count++;
							}
							
							
						}
						
						System.out.println("Occurrance of "+a.charAt(i)+" = ");
						System.out.println(count);
						
						
					}
			

		}
	}

}
