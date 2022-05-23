package SGP;

public class StringOccurrance {

	public static void main(String[] args) 
	{
		
		String a="Hello Worllld";
		int count = stringOccurance(a,'l');
		System.out.println(count);
	
		
	

	}
	
	public static int stringOccurance(String a,char l)
	{
		int count=0;
		for(int i=0;i<a.length();i++)
		{
			if(a.charAt(i)==l)
			{
				count++;
			}
		}
		
		return count;
	}

}
