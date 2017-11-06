
public class GUI {

	static public int i=0,count=0;
	public static int countDigits(String s)
	{	
		if(s.charAt(i)>=48&&s.charAt(i)<=57)
		{
			count++;
			i++;					
		}
		
		else
			i++;
		if(s.length()>i)
			{
			countDigits(s);			
			}
		return count;
	}		
}
