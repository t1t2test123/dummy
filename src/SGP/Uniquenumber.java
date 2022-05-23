package SGP;

import java.util.ArrayList;

public class Uniquenumber {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int a[] = {2,3,3,4,5,2,4,5,7,5,7};
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		for(int i=0; i < a.length ; i++)
		{
			int count = 0 ;
			if(!al.contains(a[i]))
			{
				al.add(a[i]);
				count ++;
				for(int j=i+1;j<a.length;j++)
				{
					if(a[i]==a[j])
					{
						count++;
					}
				}
				
				System.out.println("Number:"+ a[i]);
				System.out.println("Occurrence"+ count); 
				if(count==1)
				System.out.println(a[i]+ "is unique");
			}
		}
	}

}
