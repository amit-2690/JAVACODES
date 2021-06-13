package mypack;

public class UpperAtEND {

	public static void main(String[] args) {
		 
		 String v = "RoYaLENfiElD";
		 String upper = "";
		 String lower = "";

			for (int i=0; i<v.length();i++)
			    {
			        if (v.charAt(i)>= 'A' && v.charAt(i) <= 'Z')
			        {
		    	        upper = upper +v.charAt(i);
					}
			        
			        else
					{
			        	lower = lower +v.charAt(i);
			        }
			    }
			 //System.out.print (lower.trim()+upper.trim());
			 System.out.print (lower+upper);
			 
	}
	
}
