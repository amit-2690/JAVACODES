package mypack;
public class Main
{
	public static void main(String[] args) 
	{
	    String v = "RoYaLENfiElD";
	    //char [] a= v.toCharArray();
	    String upper ="";
	    String lower = "";
//	    char [] upper = new char [v.length()];
//	    char [] lower = new char [v.length()];
	    int up = 0;
	    int low = 0;
	    for (int i=0; i<v.length();i++)
	    {
	        if (v.charAt(i)>= 'A' && v.charAt(i) <= 'Z')
	        {
    	        upper = upper +v.charAt(i);
    	        up++;
	        }
	        
	        else{
	        	lower = lower +v.charAt(i);
	            low ++;
	        }
	    }
// 	    System.out.print (upper);
//      System.out.println ("");
//      System.out.print (lower);
//	    String upperCase = new String(upper);
//	    String lowerCase = new String(lower);
//	    String updated = lowerCase.trim()+upperCase.trim();
	    String updated = lower.trim()+upper.trim();
	    System.out.print (updated);
	    // System.out.println ("");
	   // System.out.print (lowerCase);
	}
}	    