public class BoolTest 
{
	public static void main(String [] args) 
    {
        BoolTest p = new BoolTest();
        NewClasss n = new NewClasss();
        p.start();
        n.start();
    }

	 void start() 
	    {
	        boolean b1 = false;
	        boolean b2 = fix(b1);
	        System.out.println(b1 + " " + b2);
	    }

	    boolean fix(boolean b1) 
	    {
	        b1 = true;
	        return b1;
	    }
}
